package mb.stratego.build;

import mb.flowspec.terms.B;
import mb.pie.api.ExecContext;
import mb.pie.api.ExecException;
import mb.pie.api.Logger;
import mb.pie.api.STask;
import mb.pie.api.TaskDef;
import mb.pie.api.stamp.output.InconsequentialOutputStamper;
import mb.stratego.build.util.CommonPaths;

import com.google.inject.Inject;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.metaborg.core.context.IContext;
import org.metaborg.core.context.IContextService;
import org.metaborg.core.language.ILanguage;
import org.metaborg.core.language.ILanguageComponent;
import org.metaborg.core.language.ILanguageIdentifierService;
import org.metaborg.core.language.ILanguageImpl;
import org.metaborg.core.language.ILanguageService;
import org.metaborg.core.language.dialect.IDialectService;
import org.metaborg.core.project.IProject;
import org.metaborg.core.project.IProjectService;
import org.metaborg.core.resource.IResourceService;
import org.metaborg.core.source.ISourceTextService;
import org.metaborg.core.syntax.ParseException;
import org.metaborg.spoofax.core.stratego.IStrategoCommon;
import org.metaborg.spoofax.core.stratego.IStrategoRuntimeService;
import org.metaborg.spoofax.core.stratego.StrategoRuntimeFacet;
import org.metaborg.spoofax.core.syntax.IParseTableProvider;
import org.metaborg.spoofax.core.syntax.IParserConfig;
import org.metaborg.spoofax.core.syntax.ImploderImplementation;
import org.metaborg.spoofax.core.syntax.JSGLR1FileParseTableProvider;
import org.metaborg.spoofax.core.syntax.JSGLR1I;
import org.metaborg.spoofax.core.syntax.JSGLR2FileParseTableProvider;
import org.metaborg.spoofax.core.syntax.JSGLR2I;
import org.metaborg.spoofax.core.syntax.JSGLRI;
import org.metaborg.spoofax.core.syntax.ParserConfig;
import org.metaborg.spoofax.core.syntax.SyntaxFacet;
import org.metaborg.spoofax.core.terms.ITermFactoryService;
import org.metaborg.spoofax.core.unit.ParseContrib;
import org.spoofax.interpreter.core.Tools;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoConstructor;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.jsglr.client.InvalidParseTableException;
import org.spoofax.jsglr2.parsetable.ParseTableReadException;
import org.spoofax.terms.StrategoConstructor;
import org.spoofax.terms.TermVisitor;
import org.spoofax.terms.io.binary.TermReader;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.lang.Context;
import javax.annotation.Nullable;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class StrIncrFront2 implements TaskDef<StrIncrFront2.Input, StrIncrFront2.Output> {
    public static final String id = StrIncrFront2.class.getCanonicalName();

    public static final class Input implements Serializable {
        final File projectLocation;
        final String inputFileString;
        final String projectName;
        final Collection<STask> originTasks;

        Input(File projectLocation, String inputFileString, String projectName, Collection<STask> originTasks) {
            this.projectLocation = projectLocation;
            this.inputFileString = inputFileString;
            this.projectName = projectName;
            this.originTasks = originTasks;
        }

        @Override public String toString() {
            return "StrIncrFront$Input(" + inputFileString + ')';
        }

        @Override public boolean equals(Object o) {
            if(this == o)
                return true;
            if(o == null || getClass() != o.getClass())
                return false;

            Input input = (Input) o;

            if(!projectLocation.equals(input.projectLocation))
                return false;
            if(!inputFileString.equals(input.inputFileString))
                return false;
            //noinspection SimplifiableIfStatement
            if(!projectName.equals(input.projectName))
                return false;
            return originTasks.equals(input.originTasks);
        }

        @Override public int hashCode() {
            int result = projectLocation.hashCode();
            result = 31 * result + inputFileString.hashCode();
            result = 31 * result + projectName.hashCode();
            result = 31 * result + originTasks.hashCode();
            return result;
        }
    }

    public static final class Output implements Serializable {
        final String moduleName;
        /**
         * Cified-strategy-name to file with CTree definition of that strategy [static linking]
         */
        final Map<String, File> strategyFiles;
        /**
         * Cified-strategy-names referred to in this module [name checks]
         */
        final Set<String> usedStrategies;
        /**
         * Cified-strategy-names-without-arity referred to in this module in an ambiguous position (strategy argument
         * to other strategy) to cified-strategy-names where the ambiguous call occurs [name checks]
         */
        final Map<String, Set<String>> ambStratUsed;
        /**
         * Cified-strategy-name to constructor_arity names that were used in the body [name checks]
         */
        final Map<String, Set<String>> strategyConstrs;
        /**
         * Overlay_arity names to file with CTree definition of that overlay [static linking / name checks]
         */
        final Map<String, File> overlayFiles;
        /**
         * Imports in this module (normal, library or wildcard) [import tracking / name checks]
         */
        final List<StrIncrFront.Import> imports;
        /**
         * Constructor_arity names defined in this module [name checks]
         */
        final Set<String> constrs;
        /**
         * Cified-strategy-name of a generated congruence [static linking]
         */
        final Set<String> congrs;
        /**
         * Cified-strategy-names of strategies that need a corresponding strategy in a library
         * because it overrides or extends it. [name checks]
         */
        final Set<String> strategyNeedsExternal;
        /**
         * Overlay_arity names to constructor_arity names used. [static linking / name checks]
         */
        final Map<String, Set<String>> overlayConstrs;
        /**
         * Constructor_arity to file with CTree definition of that congruence [static linking]
         */
        final Map<String, File> congrFiles;
        /**
         * Cified-strategy-name to CTree definition of that strategy [in-memory optimization]
         */
        final transient Map<String, IStrategoAppl> strategyASTs;
        /**
         * Overlay_arity names to CTree definition of that strategy [in-memory optimization]
         */
        final transient Map<String, List<IStrategoAppl>> overlayASTs;
        /**
         * Constructor_arity names to CTree definition of that strategy [in-memory optimization]
         */
        final transient Map<String, IStrategoAppl> congrASTs;

        Output(String moduleName, Map<String, File> strategyFiles, Set<String> usedStrategies,
            Map<String, Set<String>> ambStratUsed, Map<String, Set<String>> strategyConstrs,
            Map<String, File> overlayFiles, List<StrIncrFront.Import> imports, Set<String> constrs, Set<String> congrs,
            Set<String> strategyNeedsExternal, Map<String, Set<String>> overlayConstrs, Map<String, File> congrFiles,
            Map<String, IStrategoAppl> strategyASTs, Map<String, List<IStrategoAppl>> overlayASTs,
            Map<String, IStrategoAppl> congrASTs) {
            this.moduleName = moduleName;
            this.strategyFiles = strategyFiles;
            this.usedStrategies = usedStrategies;
            this.ambStratUsed = ambStratUsed;
            this.strategyConstrs = strategyConstrs;
            this.overlayFiles = overlayFiles;
            this.imports = imports;
            this.constrs = constrs;
            this.congrs = congrs;
            this.strategyNeedsExternal = strategyNeedsExternal;
            this.overlayConstrs = overlayConstrs;
            this.congrFiles = congrFiles;
            this.strategyASTs = strategyASTs;
            this.overlayASTs = overlayASTs;
            this.congrASTs = congrASTs;
        }

        @Override public String toString() {
            return "StrIncrFront$Output(" + moduleName + ')';
        }

        @Override public boolean equals(Object o) {
            if(this == o)
                return true;
            if(o == null || getClass() != o.getClass())
                return false;

            Output output = (Output) o;

            if(!moduleName.equals(output.moduleName))
                return false;
            if(!strategyFiles.equals(output.strategyFiles))
                return false;
            if(!usedStrategies.equals(output.usedStrategies))
                return false;
            if(!ambStratUsed.equals(output.ambStratUsed))
                return false;
            if(!strategyConstrs.equals(output.strategyConstrs))
                return false;
            if(!overlayFiles.equals(output.overlayFiles))
                return false;
            if(!imports.equals(output.imports))
                return false;
            if(!constrs.equals(output.constrs))
                return false;
            if(!congrs.equals(output.congrs))
                return false;
            if(!strategyNeedsExternal.equals(output.strategyNeedsExternal))
                return false;
            //noinspection SimplifiableIfStatement
            if(!overlayConstrs.equals(output.overlayConstrs))
                return false;
            return congrFiles.equals(output.congrFiles);
        }

        @Override public int hashCode() {
            int result = moduleName.hashCode();
            result = 31 * result + strategyFiles.hashCode();
            result = 31 * result + usedStrategies.hashCode();
            result = 31 * result + ambStratUsed.hashCode();
            result = 31 * result + strategyConstrs.hashCode();
            result = 31 * result + overlayFiles.hashCode();
            result = 31 * result + imports.hashCode();
            result = 31 * result + constrs.hashCode();
            result = 31 * result + congrs.hashCode();
            result = 31 * result + strategyNeedsExternal.hashCode();
            result = 31 * result + overlayConstrs.hashCode();
            result = 31 * result + congrFiles.hashCode();
            return result;
        }
    }

    private final IResourceService resourceService;
    private final IProjectService projectService;
    private final ILanguageIdentifierService languageIdentifierService;
    private final IDialectService dialectService;
    private final ILanguageService languageService;
    private final IStrategoRuntimeService strategoRuntimeService;
    private final ITermFactoryService termFactoryService;
    private final IContextService contextService;
    private final IStrategoCommon strategoCommon;
    private final ISourceTextService sourceTextService;
    private static final Map<String, ParserConfig> parserConfigs = new HashMap<>();

    private static final String COMPILE_STRATEGY_NAME = "compile-module2";
    private static final String STRATEGO_LANG_NAME = "Stratego-Sugar";
    private static final IStrategoConstructor varDec = new StrategoConstructor("VarDec", 2);
    private static final IStrategoConstructor constType = new StrategoConstructor("ConstType", 1);
    private static final IStrategoConstructor sort = new StrategoConstructor("Sort", 2);
    private static final IStrategoConstructor funType = new StrategoConstructor("FunType", 2);
    private static final IStrategoAppl A_TERM = B.appl(sort, B.string("ATerm"), B.list());
    private static final IStrategoTerm newTVar = B.appl(varDec, B.string("a"), B.appl(constType, A_TERM));
    private static final IStrategoTerm newSVar = B.appl(varDec, B.string("a"), B.appl(funType, A_TERM, A_TERM));

    @Inject public StrIncrFront2(IResourceService resourceService, IProjectService projectService,
        ILanguageIdentifierService languageIdentifierService, IDialectService dialectService,
        ILanguageService languageService, IStrategoRuntimeService strategoRuntimeService,
        ITermFactoryService termFactoryService, IContextService contextService, IStrategoCommon strategoCommon,
        ISourceTextService sourceTextService) {
        this.resourceService = resourceService;
        this.projectService = projectService;
        this.languageIdentifierService = languageIdentifierService;
        this.dialectService = dialectService;
        this.languageService = languageService;
        this.strategoRuntimeService = strategoRuntimeService;
        this.termFactoryService = termFactoryService;
        this.contextService = contextService;
        this.strategoCommon = strategoCommon;
        this.sourceTextService = sourceTextService;
    }


    @Override public Output exec(ExecContext execContext, Input input) throws Exception {
        for(final STask t : input.originTasks) {
            execContext.require(t, InconsequentialOutputStamper.instance);
        }

        final FileObject location = resourceService.resolve(input.projectLocation);
        final FileObject inputFile = resourceService.resolve(input.inputFileString);
        final long startTime = System.nanoTime();
        final IStrategoTerm result =
            runStrategoCompileBuilder(execContext.logger(), inputFile, input.projectName, location);
        execContext.logger().debug(
            "\"FrontEnd task stratego related code took\", " + (System.nanoTime() - startTime) + ", \""
                + input.projectLocation.toPath().relativize(Paths.get(input.inputFileString)) + "\"");

        execContext.require(resourceService.localFile(inputFile));
        // TODO: reinstate support for files from within a jar? Where was this used again?
        //        if(inputURI.getScheme().equals("jar")) {
        //            JarURLConnection c = ((JarURLConnection) inputURI.openConnection());
        //            try(FileSystem fs = FileSystems
        //                .newFileSystem(URI.create("jar:" + c.getJarFileURL().toString()), Collections.emptyMap())) {
        //                execContext.require(fs.getPath(c.getEntryName()));
        //            }
        //        } else {
        //            execContext.require(new File(inputURI));
        //        }

        final String moduleName = Tools.javaStringAt(result, 0);
        final IStrategoList defs3 = Tools.listAt(result, 1);
        final IStrategoList constrs = Tools.listAt(result, 2);
        final IStrategoList olays = Tools.listAt(result, 3);
        final IStrategoList congs = Tools.listAt(result, 4);
        final IStrategoList imps = Tools.listAt(result, 5);

        final ITermFactory factory = termFactoryService.getGeneric();
        final B b = new B(factory);

        final Map<String, IStrategoAppl> strategyASTs = new HashMap<>(defs3.size() * 2);
        final List<IStrategoAppl> decls = new ArrayList<>(defs3.size());
        final Map<String, File> strategyFiles = new HashMap<>(defs3.size() * 2);
        final Map<String, Set<String>> strategyConstrs = new HashMap<>(defs3.size() * 2);
        final Set<String> strategyNeedsExternal = new HashSet<>();
        final Map<String, Set<String>> usedAmbStrats = new HashMap<>();
        final Set<String> usedStrats = new HashSet<>();
        for(IStrategoTerm defPair : defs3) {
            final String strategy = Tools.javaStringAt(defPair, 0);
            final IStrategoAppl strategyAST = Tools.applAt(defPair, 1);
            strategyASTs.put(strategy, strategyAST);

            storeDef(execContext, location, moduleName, strategy, strategyAST, factory, strategyFiles,
                input.projectName);
            decls.add(toDecl(b, strategyAST));
            final HashSet<String> usedConstrs = new HashSet<>();
            collectUsedNames(strategyAST, usedConstrs, usedStrats, usedAmbStrats);
            strategyConstrs.put(strategy, usedConstrs);
            if(needsExternal(strategyAST)) {
                strategyNeedsExternal.add(strategy);
            }
        }
        storeDecls(execContext, location, moduleName, factory, decls, input.projectName);

        final Set<String> definedConstrs = new HashSet<>();
        for(IStrategoTerm constr : constrs) {
            definedConstrs.add(Tools.javaStringAt(constr, 0));
        }

        final Map<String, File> overlayFiles = new HashMap<>(olays.size() * 2);
        final Map<String, Set<String>> overlayConstrs = new HashMap<>(olays.size() * 2);
        final Map<String, List<IStrategoAppl>> overlayASTs = new HashMap<>(olays.size() * 2);
        for(IStrategoTerm overlayPair : olays) {
            final String overlayName = Tools.javaStringAt(overlayPair, 0);
            final IStrategoAppl overlayAST = Tools.applAt(overlayPair, 1);

            StrIncr.getOrInitialize(overlayASTs, overlayName, ArrayList::new).add(overlayAST);
        }
        for(Map.Entry<String, List<IStrategoAppl>> overlayPair : overlayASTs.entrySet()) {
            final String overlayName = overlayPair.getKey();
            final List<IStrategoAppl> overlayASTList = overlayPair.getValue();

            storeOverlay(execContext, location, moduleName, overlayName, overlayASTList, factory, overlayFiles,
                input.projectName);
            final HashSet<String> usedConstrs = new HashSet<>();
            collectUsedNames(B.list(overlayASTList.toArray(new IStrategoAppl[0])), usedConstrs);
            overlayConstrs.put(overlayName, usedConstrs);
        }

        final Map<String, IStrategoAppl> congrASTs = new HashMap<>(congs.size() * 2);
        final Set<String> congrs = new HashSet<>(congs.size() * 2);
        final Map<String, File> congrFiles = new HashMap<>(congs.size() * 2);
        for(IStrategoTerm congrPair : congs) {
            final String congrName = Tools.javaStringAt(congrPair, 0);
            final IStrategoAppl congrAST = Tools.applAt(congrPair, 1);
            congrs.add(congrName + "_0");

            storeDef(execContext, location, moduleName, congrName, congrAST, factory, congrFiles, input.projectName);
            final HashSet<String> usedConstrs = new HashSet<>();
            collectUsedNames(congrAST, usedConstrs, usedStrats, usedAmbStrats);
            strategyConstrs.put(congrName, usedConstrs);
        }

        final List<StrIncrFront.Import> imports = new ArrayList<>();
        for(IStrategoTerm importsTerm : imps) {
            for(IStrategoTerm importTerm : Tools.listAt(importsTerm, 0)) {
                imports.add(StrIncrFront.Import.fromTerm(importTerm));
            }
        }

        return new Output(moduleName, strategyFiles, usedStrats, usedAmbStrats, strategyConstrs, overlayFiles, imports,
            definedConstrs, congrs, strategyNeedsExternal, overlayConstrs, congrFiles, strategyASTs, overlayASTs,
            congrASTs);
    }

    /**
     * Collect usedConstructors, usedStrategies, and ambUsedStrategies
     * Combination of extract-used-constructors and extract-used-strategies
     */
    private void collectUsedNames(IStrategoTerm strategyAST, Set<String> usedConstrs, Set<String> usedStrats,
        Map<String, Set<String>> usedAmbStrats) {
        final TermVisitor visitor = new CollectUsedNamesTermVisitor(usedConstrs, usedStrats, usedAmbStrats);
        visitor.visit(strategyAST);
    }

    private void collectUsedNames(IStrategoTerm overlayASTList, Set<String> usedConstrs) {
        final TermVisitor visitor = new CollectUsedConstrsTermVisitor(usedConstrs);
        visitor.visit(overlayASTList);
    }

    private boolean needsExternal(IStrategoAppl strategyAST) {
        if(Tools.hasConstructor(strategyAST, "AnnoDef", 2)) {
            IStrategoList annos = Tools.listAt(strategyAST, 0);
            for(IStrategoTerm anno : annos) {
                if(anno.getSubtermCount() == 0 && anno.getTermType() == IStrategoTerm.APPL) {
                    String annoName = Tools.constructorName(anno);
                    if(annoName.equals("Override") || annoName.equals("Extend")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void storeDecls(ExecContext execContext, FileObject location, String moduleName, ITermFactory factory,
        List<IStrategoAppl> decls, String projectName) throws IOException {
        final @Nullable File boilerplateFile =
            resourceService.localPath(CommonPaths.strSepCompBoilerplateFile(location, projectName, moduleName));
        assert boilerplateFile
            != null : "Bug in strSepCompBoilerplateFile or the arguments thereof: returned path is not a file";
        execContext.provide(boilerplateFile);
        try(final Writer writer = new BufferedWriter(new FileWriter(boilerplateFile))) {
            String sep = "";
            for(IStrategoAppl decl : decls) {
                writer.write(sep);
                new TermReader(factory).unparseToFile(decl, writer);
                sep = ", ";
            }
        }
    }

    private static IStrategoAppl toDecl(B b, IStrategoAppl strategyAST) throws ExecException {
        if(Tools.hasConstructor(strategyAST, "AnnoDef", 2)) {
            final IStrategoTerm annos = strategyAST.getSubterm(0);
            final IStrategoAppl sdeft = sDefTtoDecl(b, Tools.applAt(strategyAST, 1));
            return b.applShared("AnnoDef", annos, sdeft);
        } else {
            return sDefTtoDecl(b, strategyAST);
        }
    }

    private static IStrategoAppl sDefTtoDecl(B b, IStrategoAppl strategyAST) throws ExecException {
        if(Tools.hasConstructor(strategyAST, "SDefT", 4)) {
            final IStrategoAppl newBody = b.applShared("Id");
            final IStrategoTerm name = strategyAST.getSubterm(0);
            final IStrategoTerm newSVars = buildShortSVar(Tools.listAt(strategyAST, 1).size());
            final IStrategoTerm newTVars = buildShortTVar(Tools.listAt(strategyAST, 2).size());
            return b.applShared("SDefT", name, newSVars, newTVars, newBody);
        }
        throw new ExecException("Expected SDefT/4 but got: " + strategyAST.toString(1));
    }

    private static IStrategoList buildShortTVar(int size) {
        final IStrategoTerm[] newTVars = new IStrategoTerm[size];
        Arrays.fill(newTVars, newTVar);
        return B.list(newTVars);
    }

    private static IStrategoList buildShortSVar(int size) {
        final IStrategoTerm[] newTVars = new IStrategoTerm[size];
        Arrays.fill(newTVars, newSVar);
        return B.list(newTVars);
    }

    private void storeDef(ExecContext execContext, FileObject location, String moduleName, String strategy,
        IStrategoAppl strategyAST, ITermFactory factory, Map<String, File> strategyFiles, String projectName)
        throws IOException {
        final @Nullable File strategyFile =
            resourceService.localPath(CommonPaths.strSepCompStrategyFile(location, projectName, moduleName, strategy));
        assert strategyFile
            != null : "Bug in strSepCompStrategyFile or the arguments thereof: returned path is not a file";
        execContext.provide(strategyFile);

        try(final OutputStream outputStream = new FileOutputStream(strategyFile)) {
            // N.B. unparseToFile buffers, so we don't
            new TermReader(factory).unparseToFile(strategyAST, outputStream);
        }
        strategyFiles.put(strategy, strategyFile);
    }

    private void storeOverlay(ExecContext execContext, FileObject location, String moduleName, String overlayName,
        List<IStrategoAppl> overlayASTList, ITermFactory factory, Map<String, File> overlayFiles, String projectName)
        throws IOException {
        final @Nullable File overlayFile = resourceService
            .localPath(CommonPaths.strSepCompOverlayFile(location, projectName, moduleName, overlayName));
        assert
            overlayFile != null : "Bug in strSepCompStrategyFile or the arguments thereof: returned path is not a file";
        overlayFiles.put(overlayName, overlayFile);
        execContext.provide(overlayFile);

        try(final Writer writer = new BufferedWriter(new FileWriter(overlayFile))) {
            String sep = "";
            for(IStrategoAppl overlayAST : overlayASTList) {
                writer.write(sep);
                new TermReader(factory).unparseToFile(overlayAST, writer);
                sep = ", ";
            }
        }
        overlayFiles.put(overlayName, overlayFile);
    }

    private IStrategoTerm runStrategoCompileBuilder(Logger logger, FileObject inputFile, String projectName,
        FileObject projectLocation) throws Exception {
        final long startTime = System.nanoTime();
        @Nullable ILanguageImpl strategoDialect = languageIdentifierService.identify(inputFile);
        @Nullable ILanguageImpl strategoLang = dialectService.getBase(strategoDialect);
        IStrategoTerm ast;
        if(strategoLang == null) {
            strategoLang = strategoDialect;
            strategoDialect = null;
        }
        if(strategoLang == null) {
            @Nullable ILanguage stratego = languageService.getLanguage(STRATEGO_LANG_NAME);
            String extension = inputFile.getName().getExtension();
            if(stratego != null && extension.equals("rtree")) {
                strategoLang = stratego.activeImpl();
                // support *.rtree (StrategoSugar AST)
                final ITermFactory factory = termFactoryService.getGeneric();
                ast = new TermReader(factory).parseFromStream(inputFile.getContent().getInputStream());
                if(!(ast instanceof IStrategoAppl && ((IStrategoAppl) ast).getName().equals("Module")
                    && ast.getSubtermCount() == 2)) {
                    throw new ExecException(
                        "Did not find Module/2 in RTree file. Bug in custom library detection? (If file contains Specification/1 with only external definitions, then yes). Found: \n"
                            + ast.toString(2));
                }
            } else {
                throw new ExecException(
                    "Cannot find/load Stratego language. Please add source dependency on org.metaborg:org.metaborg.meta.lang.stratego:${metaborgVersion} in metaborg.yaml");
            }
        } else {
            // parse *.str file
            ast = parse(inputFile, strategoDialect, strategoLang);
        }
        logger.debug("\"Parsing took\", " + (System.nanoTime() - startTime));
        return transform(logger, inputFile, projectName, projectLocation, strategoLang, ast);
    }

    private IStrategoTerm transform(Logger logger, FileObject inputFile, String projectName, FileObject projectLocation,
        @Nullable ILanguageImpl strategoLang, final IStrategoTerm ast) throws Exception {
        final long startTime = System.nanoTime();
        final @Nullable IProject project = projectService.get(projectLocation);
        assert project != null : "Could not find project in location: " + projectLocation;
        if(!contextService.available(strategoLang)) {
            throw new ExecException("Cannot create stratego transformation context");
        }
        final IContext transformContext = contextService.get(inputFile, project, strategoLang);
        final ITermFactory f = termFactoryService.getGeneric();
        final String projectPath = transformContext.project().location().toString();
        final IStrategoTerm inputTerm = f.makeTuple(f.makeString(projectPath), f.makeString(projectName), ast);
        final long beforeStrategoCommonCall = System.nanoTime();
        logger.debug("\"Getting project/context/factory took\", " + (beforeStrategoCommonCall - startTime));
        final HybridInterpreter interpreter =
            strategoRuntimeService.runtime(getComponent(strategoLang), transformContext, false);
        interpreter.getContext().setContextObject(transformContext);
        interpreter.getCompiledContext().setContextObject(transformContext);
        @Nullable IStrategoTerm result = strategoCommon.invoke(interpreter, inputTerm, COMPILE_STRATEGY_NAME);
        logger.debug("\"StrategoCommon#invoke took\", " + (System.nanoTime() - beforeStrategoCommonCall));
        if(result == null) {
            throw new ExecException("Normal Stratego strategy failure during execution of " + COMPILE_STRATEGY_NAME);
        }
        return result;
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

    private IStrategoTerm parse(FileObject inputFile, @Nullable ILanguageImpl strategoDialect,
        ILanguageImpl strategoLang) throws ParseException, ExecException {
        final ImploderImplementation imploder;
        final ILanguageImpl langImpl;
        if(strategoDialect != null) {
            langImpl = strategoDialect;
            imploder = ImploderImplementation.stratego;
        } else {
            langImpl = strategoLang;
            imploder = ImploderImplementation.java;
        }
        final ITermFactory termFactory = termFactoryService.get(strategoLang, null, false);

        final IParserConfig config = getParserConfig(findParseTable(langImpl), imploder);
        try {
            final String inputText = sourceTextService.text(inputFile);
            final JSGLRI<?> parser;

            if(imploder == ImploderImplementation.java) {
                parser = new JSGLR2I(config, termFactory, strategoLang, null, inputFile, inputText, false, false);
            } else {
                final Context context = strategoRuntimeService.genericRuntime().getCompiledContext();
                parser = new JSGLR1I(config, termFactory, context, strategoLang, strategoDialect, inputFile, inputText);
            }

            final ParseContrib contrib = parser.parse(null);

            if(!contrib.valid || !contrib.success || contrib.ast == null) {
                throw new ExecException(
                    "Cannot parse stratego file " + inputFile + ": parsing failed with" + (!contrib.valid ? " errors" :
                        (!contrib.success) ? "out errors" : " ast == null"));
            }

            return contrib.ast;
        } catch(IOException | ParseTableReadException | InvalidParseTableException e) {
            throw new ParseException(null, e);
        }
    }

    private IParserConfig getParserConfig(FileObject parseTable, ImploderImplementation imploder)
        throws ParseException {
        if(parserConfigs.containsKey(parseTable.toString())) {
            return parserConfigs.get(parseTable.toString());
        }
        final ITermFactory termFactory =
            termFactoryService.getGeneric().getFactoryWithStorageType(IStrategoTerm.MUTABLE);
        final IParseTableProvider provider;
        if(imploder == ImploderImplementation.java) {
            provider = new JSGLR2FileParseTableProvider(parseTable, termFactory);
        } else {
            provider = new JSGLR1FileParseTableProvider(parseTable, termFactory);
        }
        final ParserConfig config = new ParserConfig("Module", provider, imploder);
        parserConfigs.put(parseTable.toString(), config);
        return config;
    }

    private static FileObject findParseTable(ILanguageImpl lang) throws ParseException {
        final SyntaxFacet facet = Objects.requireNonNull(lang.facet(SyntaxFacet.class));
        @Nullable FileObject parseTable = null;
        if(facet.parseTable == null) {
            try {
                boolean multipleTables = false;
                for(ILanguageComponent component : lang.components()) {
                    if(component.config().sdfEnabled()) {
                        if(component.config().parseTable() != null) {
                            if(multipleTables) {
                                throw new ParseException(null);
                            }

                            parseTable = component.location().resolveFile(component.config().parseTable());
                            multipleTables = true;
                        }
                    }
                }
            } catch(FileSystemException e) {
                throw new ParseException(null, e);
            }
        } else {
            parseTable = facet.parseTable;
        }
        return Objects.requireNonNull(parseTable);
    }

    @Override public String getId() {
        return id;
    }

    @Override public Serializable key(Input input) {
        return input.inputFileString;
    }
}
