package mb.stratego.build;

import mb.pie.api.ExecContext;
import mb.pie.api.ExecException;
import mb.pie.api.None;
import mb.pie.api.STask;
import mb.pie.api.TaskDef;
import mb.pie.api.stamp.output.InconsequentialOutputStamper;
import mb.pie.api.stamp.resource.FileSystemStampers;
import mb.stratego.build.util.ResourceAgentTracker;
import mb.stratego.build.util.StrategoExecutor;
import mb.stratego.compiler.pack.Packer;

import com.google.inject.Inject;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.util.RandomAccessMode;
import org.metaborg.core.MetaborgRuntimeException;
import org.metaborg.core.resource.IResourceService;
import org.metaborg.spoofax.core.SpoofaxConstants;
import org.metaborg.spoofax.core.stratego.ResourceAgent;
import org.metaborg.util.cmd.Arguments;
import javax.annotation.Nullable;
import java.io.File;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedMap;

public class StrIncrBack implements TaskDef<StrIncrBack.Input, None> {
    public static final String id = StrIncrBack.class.getCanonicalName();

    public static final class Input implements Serializable {
        final Collection<STask> frontEndTasks;
        final File projectLocation;
        final @Nullable String strategyName;
        final File strategyDir;
        final Collection<File> strategyContributions;
        final Collection<File> overlayContributions;
        final SortedMap<String, String> ambStrategyResolution;
        final @Nullable String packageName;
        final File outputPath;
        final @Nullable File cacheDir;
        final List<String> constants;
        final Collection<File> includeDirs;
        final Arguments extraArgs;
        final boolean isBoilerplate;

        Input(Collection<STask> frontEndTasks, File projectLocation, @Nullable String strategyName, File strategyDir,
            Collection<File> strategyContributions, Collection<File> overlayContributions,
            SortedMap<String, String> ambStrategyResolution, @Nullable String packageName, File outputPath,
            @Nullable File cacheDir, List<String> constants, Collection<File> includeDirs, Arguments extraArgs,
            boolean isBoilerplate) {
            this.frontEndTasks = frontEndTasks;
            this.projectLocation = projectLocation;
            this.strategyName = strategyName;
            this.strategyDir = strategyDir;
            this.strategyContributions = strategyContributions;
            this.overlayContributions = overlayContributions;
            this.ambStrategyResolution = ambStrategyResolution;
            this.packageName = packageName;
            this.outputPath = outputPath;
            this.cacheDir = cacheDir;
            this.constants = constants;
            this.includeDirs = includeDirs;
            this.extraArgs = extraArgs;
            this.isBoilerplate = isBoilerplate;
        }

        @Override public String toString() {
            return "StrIncrBack$Input(" + strategyName + ')';
        }

        @Override public boolean equals(Object o) {
            if(this == o)
                return true;
            if(o == null || getClass() != o.getClass())
                return false;

            Input input = (Input) o;

            if(isBoilerplate != input.isBoilerplate)
                return false;
            if(!frontEndTasks.equals(input.frontEndTasks))
                return false;
            if(!projectLocation.equals(input.projectLocation))
                return false;
            if(strategyName != null ? !strategyName.equals(input.strategyName) : input.strategyName != null)
                return false;
            if(!strategyDir.equals(input.strategyDir))
                return false;
            if(!strategyContributions.equals(input.strategyContributions))
                return false;
            if(!overlayContributions.equals(input.overlayContributions))
                return false;
            if(packageName != null ? !packageName.equals(input.packageName) : input.packageName != null)
                return false;
            if(!outputPath.equals(input.outputPath))
                return false;
            if(cacheDir != null ? !cacheDir.equals(input.cacheDir) : input.cacheDir != null)
                return false;
            //noinspection SimplifiableIfStatement
            if(!constants.equals(input.constants))
                return false;
            return extraArgs.equals(input.extraArgs);
        }

        @Override public int hashCode() {
            int result = frontEndTasks.hashCode();
            result = 31 * result + projectLocation.hashCode();
            result = 31 * result + (strategyName != null ? strategyName.hashCode() : 0);
            result = 31 * result + strategyDir.hashCode();
            result = 31 * result + strategyContributions.hashCode();
            result = 31 * result + overlayContributions.hashCode();
            result = 31 * result + (packageName != null ? packageName.hashCode() : 0);
            result = 31 * result + outputPath.hashCode();
            result = 31 * result + (cacheDir != null ? cacheDir.hashCode() : 0);
            result = 31 * result + constants.hashCode();
            result = 31 * result + extraArgs.hashCode();
            result = 31 * result + (isBoilerplate ? 1 : 0);
            return result;
        }
    }

    private final IResourceService resourceService;

    @Inject public StrIncrBack(IResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @Override public None exec(ExecContext execContext, Input input) throws Exception {
        for(STask t : input.frontEndTasks) {
            execContext.require(t, InconsequentialOutputStamper.instance);
        }

//        final List<Path> contributionPaths = new ArrayList<>(input.strategyContributions.size());
        for(File strategyContrib : input.strategyContributions) {
            execContext.require(strategyContrib, FileSystemStampers.hash());
//            contributionPaths.add(strategyContrib.toPath());
        }
//
//        final List<Path> overlayPaths = new ArrayList<>(input.overlayContributions.size());
        for(File overlayFile : input.overlayContributions) {
            execContext.require(overlayFile, FileSystemStampers.hash());
//            overlayPaths.add(overlayFile.toPath());
        }

        // Pack the directory into a single strategy
        final FileObject packedFile = resourceService.resolve(URI.create("ram://" + input.strategyDir.getAbsolutePath() + "/packed$.ctree"));
        long startTime = System.nanoTime();
        if(input.isBoilerplate) {
            Packer.packBoilerplate(input.strategyContributions, packedFile);
        } else {
            Packer.packStrategy(input.overlayContributions, input.strategyContributions, input.ambStrategyResolution, packedFile);
        }
        execContext.logger().debug(
            "\"BackEnd task packing took\", " + (System.nanoTime() - startTime) + ", \"" + input.projectLocation
                .toPath().relativize(Paths.get(input.strategyDir.toString(), "packed$.ctree")) + "\"");
//        execContext.provide(packedFile.toFile());

        // Call Stratego compiler
        // Note that we need --library and turn off fusion with --fusion for separate compilation
        final Arguments arguments = new Arguments().add("-i", packedFile.getPublicURIString()).addFile("-o", input.outputPath)
            .addLine(input.packageName != null ? "-p " + input.packageName : "").add("--library").add("--fusion");
        if(input.isBoilerplate) {
            arguments.add("--boilerplate");
        } else {
            arguments.add("--single-strategy");
        }

        for(File includeDir : input.includeDirs) {
            arguments.add("-I", includeDir);
        }

        if(input.cacheDir != null) {
            arguments.addFile("--cache-dir", input.cacheDir);
        }

        for(String constant : input.constants) {
            // Needed in boilerplate for generating a strategy (e.g. $C$O$N$S$T$A$N$T_0_0), needed in single-strategy
            //  to turn e.g. prim("CONSTANT") into Build(theconstantvalue), in the example where you give pass
            //  -DCONSTANT=theconstantvalue.
            arguments.add("-D", constant);
        }
        arguments.addAll(input.extraArgs);

        final ResourceAgentTracker tracker = newResourceTracker(new File(System.getProperty("user.dir")));
        /*, Pattern.quote("[ strj | info ]") + ".*",
                Pattern.quote("[ strj | error ] Compilation failed") + ".*",
                Pattern.quote("[ strj | warning ] No Stratego files found in directory") + ".*",
                Pattern.quote("[ strj | warning ] Found more than one matching subdirectory found for") + ".*",
                Pattern.quote(SpoofaxConstants.STRJ_INFO_WRITING_FILE) + ".*",
                Pattern.quote("* warning (escaping-var-id):") + ".*",
                Pattern.quote("          [\"") + ".*" + Pattern.quote("\"]"));*/

        startTime = System.nanoTime();
        final StrategoExecutor.ExecutionResult result =
            new StrategoExecutor().withStrjContext().withStrategy(org.strategoxt.strj.main_0_0.instance)
                .withTracker(tracker).withName("strj").setSilent(true).executeCLI(arguments);
        execContext.logger().debug(
            "\"BackEnd task stratego code took\", " + (System.nanoTime() - startTime) + ", \"" + input.projectLocation
                .toPath().relativize(Paths.get(input.strategyDir.toString(), "packed$.ctree")) + "\"");

        if(!result.success) {
            throw new ExecException("Call to strj failed", result.exception);
        }

        for(String line : result.errLog.split(System.lineSeparator())) {
            if(line.startsWith(SpoofaxConstants.STRJ_INFO_WRITING_FILE)) {
                String fileName = line.substring(SpoofaxConstants.STRJ_INFO_WRITING_FILE.length()).trim();
                execContext.provide(new File(fileName));
            }
        }

        return None.instance;
    }

    private ResourceAgentTracker newResourceTracker(File baseFile, String... excludePatterns) {
        final FileObject base = resourceService.resolve(baseFile);
        final ResourceAgentTracker tracker = new ResourceAgentTracker(resourceService, base, excludePatterns);
        final ResourceAgent agent = tracker.agent();
        agent.setAbsoluteWorkingDir(base);
        agent.setAbsoluteDefinitionDir(base);
        return tracker;
    }

    @Override public String getId() {
        return id;
    }

    @Override public Serializable key(Input input) {
        return input.strategyDir;
    }
}
