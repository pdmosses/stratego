package mb.stratego.build;

import java.io.File;
import java.io.Serializable;

import javax.annotation.Nullable;

import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.vfs2.FileObject;
import org.metaborg.core.context.IContext;
import org.metaborg.core.context.IContextService;
import org.metaborg.core.language.ILanguageComponent;
import org.metaborg.core.language.ILanguageImpl;
import org.metaborg.core.project.IProject;
import org.metaborg.core.project.IProjectService;
import org.metaborg.core.resource.IResourceService;
import org.metaborg.spoofax.core.stratego.IStrategoCommon;
import org.metaborg.spoofax.core.stratego.IStrategoRuntimeService;
import org.metaborg.spoofax.core.stratego.ResourceAgent;
import org.metaborg.spoofax.core.stratego.StrategoRuntimeFacet;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.HybridInterpreter;

import com.google.inject.Inject;

import mb.pie.api.ExecContext;
import mb.pie.api.ExecException;
import mb.pie.api.TaskDef;
import mb.stratego.build.util.LocallyUniqueStringTermFactory;
import mb.stratego.build.util.ResourceAgentTracker;

public class StrIncrSubFront implements TaskDef<StrIncrSubFront.Input, StrIncrSubFront.Output> {
    public static final String id = StrIncrSubFront.class.getCanonicalName();

    private final IResourceService resourceService;
    private final IProjectService projectService;
    private final IStrategoRuntimeService strategoRuntimeService;
    private final IContextService contextService;
    private final IStrategoCommon strategoCommon;
    ILanguageImpl strategoLang;

    public static final class Input implements Serializable {
        final File projectLocation;
        final String inputFileString;
        final String cifiedName;
        final InputType inputType;
        final IStrategoTerm ast;

        public Input(File projectLocation, String inputFileString, String cifiedName, InputType inputType,
            IStrategoTerm ast) {
            this.projectLocation = projectLocation;
            this.inputFileString = inputFileString;
            this.cifiedName = cifiedName;
            this.inputType = inputType;
            this.ast = ast;
        }

        @Override public String toString() {
            return "StrIncrFront$Input(" + inputType.name() + ", " + cifiedName + ')';
        }


        @Override public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((ast == null) ? 0 : ast.hashCode());
            result = prime * result + ((cifiedName == null) ? 0 : cifiedName.hashCode());
            result = prime * result + ((inputFileString == null) ? 0 : inputFileString.hashCode());
            result = prime * result + ((inputType == null) ? 0 : inputType.hashCode());
            result = prime * result + ((projectLocation == null) ? 0 : projectLocation.hashCode());
            return result;
        }


        @Override public boolean equals(Object obj) {
            if(this == obj)
                return true;
            if(obj == null)
                return false;
            if(getClass() != obj.getClass())
                return false;
            Input other = (Input) obj;
            if(ast == null) {
                if(other.ast != null)
                    return false;
            } else if(!ast.equals(other.ast))
                return false;
            if(cifiedName == null) {
                if(other.cifiedName != null)
                    return false;
            } else if(!cifiedName.equals(other.cifiedName))
                return false;
            if(inputFileString == null) {
                if(other.inputFileString != null)
                    return false;
            } else if(!inputFileString.equals(other.inputFileString))
                return false;
            if(inputType != other.inputType)
                return false;
            if(projectLocation == null) {
                if(other.projectLocation != null)
                    return false;
            } else if(!projectLocation.equals(other.projectLocation))
                return false;
            return true;
        }

    }

    public static final class Output implements Serializable {
        final IStrategoTerm result;

        public Output(IStrategoTerm result) {
            this.result = result;
        }

        @Override public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
            return result;
        }

        @Override public boolean equals(Object obj) {
            if(this == obj)
                return true;
            if(obj == null)
                return false;
            if(getClass() != obj.getClass())
                return false;
            Output other = (Output) obj;
            if(result == null) {
                if(other.result != null)
                    return false;
            } else if(!result.equals(other.result))
                return false;
            return true;
        }
    }

    public static enum InputType {
        TopLevelDefinition("compile-top-level-def"),
        Split("split-module"); // Split is for convenience, not because it *must* be cached
        final String strategyName;

        InputType(String strategyName) {
            this.strategyName = strategyName;
        }
    }

    @Inject public StrIncrSubFront(IResourceService resourceService, IProjectService projectService,
        IStrategoRuntimeService strategoRuntimeService, IContextService contextService,
        IStrategoCommon strategoCommon) {
        this.resourceService = resourceService;
        this.projectService = projectService;
        this.strategoRuntimeService = strategoRuntimeService;
        this.contextService = contextService;
        this.strategoCommon = strategoCommon;
    }


    @Override public String getId() {
        return id;
    }

    @Override public Serializable key(StrIncrSubFront.Input input) {
        return input.inputFileString + ":" + input.cifiedName;
    }


    @Override public StrIncrSubFront.Output exec(ExecContext context, StrIncrSubFront.Input input) throws Exception {
        FileObject inputFile = resourceService.resolve(input.inputFileString);
        FileObject projectLocation = resourceService.resolve(input.projectLocation);
        return new Output(transform(inputFile, projectLocation, input.ast, input.inputType.strategyName));
    }

    private IStrategoTerm transform(FileObject inputFile, FileObject projectLocation,
        final IStrategoTerm ast, String strategyName) throws Exception {
        final @Nullable IProject project = projectService.get(projectLocation);
        assert project != null : "Could not find project in location: " + projectLocation;
        final IContext transformContext = contextService.get(inputFile, project, strategoLang);
        final HybridInterpreter interpreter =
            strategoRuntimeService.runtime(getComponent(strategoLang), transformContext, false);
        final ResourceAgentTracker tracker = newResourceTracker(new File(System.getProperty("user.dir")), true);
        final ITermFactory f = new LocallyUniqueStringTermFactory(interpreter.getCompiledContext().getFactory());
        interpreter.getCompiledContext().setFactory(f);
        interpreter.setIOAgent(tracker.agent());
        @Nullable IStrategoTerm result = strategoCommon.invoke(interpreter, ast, strategyName);
        if(result == null) {
            throw new ExecException("Normal Stratego strategy failure during execution of " + strategyName
                + "\n\nstdout:\n\n" + tracker.stdout()
                + "\n\nstderr:\n\n" + tracker.stderr());
        }
        return result;
    }

    private ResourceAgentTracker newResourceTracker(File baseFile, boolean silent, String... excludePatterns) {
        final FileObject base = resourceService.resolve(baseFile);
        final ResourceAgentTracker tracker;
        if(silent) {
            tracker = new ResourceAgentTracker(resourceService, base, new NullOutputStream(), new NullOutputStream());
        } else {
            tracker = new ResourceAgentTracker(resourceService, base, excludePatterns);
        }
        final ResourceAgent agent = tracker.agent();
        agent.setAbsoluteWorkingDir(base);
        agent.setAbsoluteDefinitionDir(base);
        return tracker;
    }

    private static ILanguageComponent getComponent(@Nullable ILanguageImpl language) throws ExecException {
        if(language != null) {
            for(ILanguageComponent component : language.components()) {
                if(component.facet(StrategoRuntimeFacet.class) == null) {
                    continue;
                }
                return component;
            }
        }
        throw new ExecException("Could not find StrategoRuntime component for Stratego.lang");
    }

}