package mb.stratego.build.strincr;

import static mb.stratego.build.strincr.Frontends.reportOverlappingStrategies;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nullable;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

import io.usethesource.capsule.BinaryRelation;
import mb.pie.api.ExecContext;
import mb.pie.api.ExecException;
import mb.pie.api.Logger;
import mb.pie.api.STask;
import mb.stratego.build.strincr.SplitResult.StrategySignature;
import mb.stratego.build.termvisitors.SugarAnalysis;
import mb.stratego.build.util.Algorithms;
import mb.stratego.build.util.Relation;
import mb.stratego.build.util.StrIncrContext;
import mb.stratego.build.util.StringSetWithPositions;

public class StaticChecks {
    public static final class Output {
        // Cified-strategy-name (where the call occurs) to cified-strategy-name (amb call) to cified-strategy-name (amb
        // call resolves to)
        public final Map<String, SortedMap<String, String>> ambStratResolution;

        Output(Map<String, SortedMap<String, String>> ambStratResolution) {
            this.ambStratResolution = ambStratResolution;
        }

        @Override
        public String toString() {
            if(!ambStratResolution.isEmpty()) {
                final StringBuilder b = new StringBuilder();
                for(Map.Entry<String, SortedMap<String, String>> stringSortedMapEntry : ambStratResolution.entrySet()) {
                    b.append("  In strategy ").append(stringSortedMapEntry.getKey()).append(":\n");
                    for(Map.Entry<String, String> stringStringEntry : stringSortedMapEntry.getValue().entrySet()) {
                        b.append("    ").append(stringStringEntry.getKey()).append(" -> ")
                            .append(stringStringEntry.getValue()).append("\n");
                    }
                }
                return b.toString();
            } else {
                return "  (none)";
            }
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ambStratResolution.hashCode();
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj)
                return true;
            if(obj == null)
                return false;
            if(getClass() != obj.getClass())
                return false;
            Output other = (Output) obj;
            return ambStratResolution.equals(other.ambStratResolution);
        }
    }

    public static final class Data {
        // Module-path to sugar ast
        public final Map<String, IStrategoTerm> sugarASTs = new HashMap<>();
        // Module-path to module-path
        public final Map<String, Set<String>> imports = new HashMap<>();
        // Module-path to cified-strategy-names used (to AST names of actual use)
        public final Map<String, StringSetWithPositions> usedStrategies = new HashMap<>();
        // Module-path to cified-strategy-name used in ambiguous call position to cified-strategy-names where the calls
        // occur
        public final Map<String, Map<String, Set<String>>> usedAmbStrategies = new HashMap<>();
        // Module-path to cified-strategy-name used in ambiguous call position (to AST names of actual use)
        public final Map<String, StringSetWithPositions> ambStratPositions = new HashMap<>();
        // Module-path to constructor_arity names used (to AST names of actual use)
        public final Map<String, StringSetWithPositions> usedConstructors = new HashMap<>();
        // Module-path to cified-strategy-names defined here (to AST names of actual definitions)
        public final Map<String, StringSetWithPositions> definedStrategies = new HashMap<>();
        // Module-path to cified-strategy-names defined here as congruences
        public final Map<String, StringSetWithPositions> definedCongruences = new HashMap<>();
        // Module-path to external cified-strategy-names that will be imported in Java
        public final Map<String, StringSetWithPositions> externalStrategies = new HashMap<>();
        // External cified-strategy-names that will be imported in Java
        public final StringSetWithPositions libraryExternalStrategies = new StringSetWithPositions();
        // Internal cified-strategy-names that will be imported in Java
        public final Map<String, StringSetWithPositions> internalStrategies = new HashMap<>();
        // External constructors that will be imported in Java
        public final StringSetWithPositions externalConstructors = new StringSetWithPositions();
        // Module-path to constructor_arity names defined there (to AST names of actual definitions)
        public final Map<String, StringSetWithPositions> definedConstructors = new HashMap<>();
        // Cified-strategy-names that need a corresponding name in a library because it overrides or extends it. (to
        // strategy definition AST names)
        public final StringSetWithPositions strategyNeedsExternal = new StringSetWithPositions();
        // Constructor_arity overlay name. (to overlay definition AST names)
        public final StringSetWithPositions overlayDefs = new StringSetWithPositions();
        // Constructor strictness for each strategy
        public final Map<String, Boolean> strictnessLevel = new HashMap<>();

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + sugarASTs.hashCode();
            result = prime * result + definedCongruences.hashCode();
            result = prime * result + definedConstructors.hashCode();
            result = prime * result + definedStrategies.hashCode();
            result = prime * result + externalConstructors.hashCode();
            result = prime * result + externalStrategies.hashCode();
            result = prime * result + libraryExternalStrategies.hashCode();
            result = prime * result + internalStrategies.hashCode();
            result = prime * result + imports.hashCode();
            result = prime * result + strategyNeedsExternal.hashCode();
            result = prime * result + usedAmbStrategies.hashCode();
            result = prime * result + usedConstructors.hashCode();
            result = prime * result + usedStrategies.hashCode();
            result = prime * result + usedStrategies.hashCode();
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj)
                return true;
            if(obj == null)
                return false;
            if(getClass() != obj.getClass())
                return false;
            Data other = (Data) obj;
            return sugarASTs.equals(other.sugarASTs) && definedCongruences.equals(other.definedCongruences)
                && definedConstructors.equals(other.definedConstructors) && definedStrategies
                .equals(other.definedStrategies) && externalConstructors.equals(other.externalConstructors)
                && externalStrategies.equals(other.externalStrategies) && libraryExternalStrategies
                .equals(other.libraryExternalStrategies) && internalStrategies.equals(other.internalStrategies)
                && imports.equals(other.imports) && strategyNeedsExternal.equals(other.strategyNeedsExternal)
                && usedAmbStrategies.equals(other.usedAmbStrategies) && usedConstructors.equals(other.usedConstructors)
                && usedStrategies.equals(other.usedStrategies) && strictnessLevel.equals(other.strictnessLevel);
        }

        public void registerConstructorDefinitions(String modulePath, StringSetWithPositions constrs,
            StringSetWithPositions overlays) {
            StringSetWithPositions visConstrs = new StringSetWithPositions(constrs);
            visConstrs.addAll(overlays);
            definedConstructors.put(modulePath, visConstrs);
        }
    }

    // TODO: remove once strategoxt is bootstrapped and has an updated baseline. This stuff was added to the standard library and can be removed from the compiler once the baseline is updated.
    static final HashSet<String> ALWAYS_DEFINED =
        new HashSet<>(Arrays.asList("DR__DUMMY_0_0", "Anno__Cong_____2_0", "DR__UNDEFINE_1_0"));
    public static final Pattern stripArityPattern = Pattern.compile("([A-Za-z$_][A-Za-z0-9_$]*)_(\\d+)_(\\d+)");

    protected final Frontend strIncrFront;
    protected final InsertCasts strIncrInsertCasts;
    private final StrIncrContext strContext;

    static ArrayList<Long> timestamps = new ArrayList<>();

    @Inject
    public StaticChecks(Frontend strIncrFront, InsertCasts strIncrInsertCasts, StrIncrContext strContext) {
        this.strIncrFront = strIncrFront;
        this.strIncrInsertCasts = strIncrInsertCasts;
        this.strContext = strContext;
    }

    public Output insertCasts(ExecContext execContext, String mainFileModulePath, Frontends.Output output,
        List<Message<?>> outputMessages, Collection<STask> originTasks, Path projectLocationPath)
        throws ExecException, InterruptedException {
        final Data staticData = output.staticData;

        // Module-path to cified_strategy names to FunTType visible in the module (def or import of def)
        final Map<String, Map<IStrategoString, IStrategoTerm>> stratEnvInclImports = new HashMap<>();
        // Module-path to constructor_arity names to ConstrType visible in the module (def or import of def)
        final Map<String, BinaryRelation.Immutable<IStrategoString, IStrategoTerm>> constrEnvInclImports =
            new HashMap<>();
        // Module-path to Sort type to Sort type in the module (def or import of def)
        final Map<String, BinaryRelation.Immutable<IStrategoTerm, IStrategoTerm>> injEnvInclImports = new HashMap<>();
        final Deque<Set<String>> sccs = Algorithms.topoSCCs(Collections.singleton(mainFileModulePath),
            k -> staticData.imports.getOrDefault(k, Collections.emptySet()));
        for(Iterator<Set<String>> iterator = sccs.descendingIterator(); iterator.hasNext(); ) {
            Set<String> scc = iterator.next();
            // Gather up environment for SCC (typically just 1 module)
            Map<IStrategoString, IStrategoTerm> sccStrategyEnv = new HashMap<>();
            BinaryRelation.Transient<IStrategoString, IStrategoTerm> sccConstructorEnvT = BinaryRelation.Transient.of();
            BinaryRelation.Transient<IStrategoTerm, IStrategoTerm> sccInjEnvT = BinaryRelation.Transient.of();
            final ITermFactory tf = strContext.getFactory();
            prepareSCCEnv(output, staticData, stratEnvInclImports, constrEnvInclImports, injEnvInclImports, scc,
                sccStrategyEnv, sccConstructorEnvT, sccInjEnvT, tf);
            BinaryRelation.Immutable<IStrategoString, IStrategoTerm> sccConstructorEnv = sccConstructorEnvT.freeze();
            BinaryRelation.Immutable<IStrategoTerm, IStrategoTerm> sccInjEnv = sccInjEnvT.freeze();
            // Do the actual work
            for(String moduleName : scc) {
                if(Library.Builtin.isBuiltinLibrary(moduleName)) {
                    continue;
                }
                // Incrementally build the transitive closure while traversing the SCCs
                constrEnvInclImports.put(moduleName, sccConstructorEnv);
                stratEnvInclImports.put(moduleName, sccStrategyEnv);
                injEnvInclImports.put(moduleName, sccInjEnv);
                // CHECK for constant congruences & overlap between local variables and nullary constructors
                warnConstCongrAndNullaryConstr(execContext, outputMessages, staticData, moduleName);
                // Insert casts (mutates splitResult.strategyDefs)
                final SplitResult splitResult =
                    insertCasts(execContext, outputMessages, sccStrategyEnv, tf, sccConstructorEnv, sccInjEnv,
                        output.splitModules.get(moduleName));
                // Desugar
                long shuffleStartTime;
                final String projectName = projectName(moduleName);

                final Frontend.Input frontInput =
                    new Frontend.Input(projectLocationPath.toFile(), splitResult.inputFileString, projectName,
                        splitResult);
                timestamps.add(System.nanoTime());
                final @Nullable Frontend.NormalOutput frontOutput =
                    execContext.require(strIncrFront, frontInput).normalOutput();
                timestamps.add(System.nanoTime());
                // Shuffle information
                if(frontOutput == null) {
                    execContext.logger().debug("File deletion detected: " + splitResult.inputFileString);
                    continue;
                }
                execContext.logger().debug("File parsed: " + splitResult.inputFileString);

                for(Map.Entry<String, Integer> strategyNoOfDefs : frontOutput.noOfDefinitions.entrySet()) {
                    Relation
                        .getOrInitialize(BuildStats.modulesDefiningStrategy, strategyNoOfDefs.getKey(), ArrayList::new)
                        .add(strategyNoOfDefs.getValue());
                }
                shuffleStartTime = System.nanoTime();

                // combining output for check
                for(StringSetWithPositions usedConstrs : frontOutput.strategyConstrs.values()) {
                    Relation.getOrInitialize(staticData.usedConstructors, moduleName, StringSetWithPositions::new)
                        .addAll(usedConstrs);
                }
                staticData.usedStrategies.put(moduleName, frontOutput.usedStrategies);
                staticData.usedAmbStrategies.put(moduleName, frontOutput.ambStratUsed);
                staticData.ambStratPositions.put(moduleName, frontOutput.ambStratPositions);
                staticData.definedStrategies.put(moduleName, frontOutput.strats);
                staticData.internalStrategies.put(moduleName, frontOutput.internalStrats);
                reportOverlappingStrategies(staticData.libraryExternalStrategies, frontOutput.externalStrats,
                    execContext.logger());
                staticData.externalStrategies.put(moduleName, frontOutput.externalStrats);
                staticData.definedCongruences.put(moduleName, frontOutput.congrs);
                staticData.registerConstructorDefinitions(moduleName, frontOutput.constrs, frontOutput.overlays);

                staticData.strategyNeedsExternal.addAll(frontOutput.strategyNeedsExternal);


                // shuffling output for backend
                for(Map.Entry<String, IStrategoAppl> gen : frontOutput.strategyASTs.entrySet()) {
                    String strategyName = gen.getKey();
                    // ensure the strategy is a key in the strategyFiles map
                    Relation.getOrInitialize(output.backendData.strategyASTs, strategyName, ArrayList::new)
                        .add(gen.getValue());
                    Relation.getOrInitialize(output.backendData.strategyConstrs, strategyName, HashSet::new)
                        .addAll(frontOutput.strategyConstrs.get(strategyName).readSet());
                }
                for(Map.Entry<String, IStrategoAppl> gen : frontOutput.congrASTs.entrySet()) {
                    final String congrName = gen.getKey();
                    output.backendData.congrASTs.put(congrName, gen.getValue());
                    Relation.getOrInitialize(output.backendData.strategyConstrs, congrName, HashSet::new)
                        .addAll(frontOutput.strategyConstrs.get(congrName).readSet());
                }
                for(Map.Entry<String, List<IStrategoAppl>> gen : frontOutput.overlayASTs.entrySet()) {
                    final String overlayName = gen.getKey();

                    Relation.getOrInitialize(output.backendData.overlayASTs, overlayName, ArrayList::new)
                        .addAll(gen.getValue());
                }
                for(Map.Entry<String, StringSetWithPositions> gen : frontOutput.overlayConstrs.entrySet()) {
                    final String overlayName = gen.getKey();
                    Relation.getOrInitialize(output.backendData.overlayConstrs, overlayName, HashSet::new)
                        .addAll(gen.getValue().readSet());
                }

                BuildStats.shuffleTime += System.nanoTime() - shuffleStartTime;
            }
        }

        // Run old static checks while we move those from here to the type system implementation
        return StaticChecks
            .check(execContext.logger(), mainFileModulePath, output.staticData, output.backendData.overlayConstrs,
                output.messages);
    }

    public void warnConstCongrAndNullaryConstr(ExecContext execContext, List<Message<?>> outputMessages,
        Data staticData, String moduleName) throws ExecException {
        if(!staticData.sugarASTs.containsKey(moduleName)) {
            execContext.logger().debug("Sugar ASTs available for: " + staticData.sugarASTs.keySet());
            throw new ExecException("Cannot find sugar AST for " + moduleName);
        }
        new SugarAnalysis(moduleName, outputMessages, staticData.definedConstructors)
            .visit(staticData.sugarASTs.get(moduleName));
    }

    public SplitResult insertCasts(ExecContext execContext, List<Message<?>> outputMessages,
        Map<IStrategoString, IStrategoTerm> sccStrategyEnv, ITermFactory tf,
        BinaryRelation.Immutable<IStrategoString, IStrategoTerm> sccConstructorEnv,
        BinaryRelation.Immutable<IStrategoTerm, IStrategoTerm> sccInjEnv, SplitResult splitResult)
        throws ExecException, InterruptedException {
        final InsertCasts.Input.Builder builder =
            new InsertCasts.Input.Builder(sccStrategyEnv, sccConstructorEnv, sccInjEnv, tf);
        for(Map.Entry<String, IStrategoTerm> e : splitResult.strategyDefs.entrySet()) {
            final InsertCasts.Input insertCastsInput = builder.build(e.getValue(), e.getKey());
            final InsertCasts.Output result = execContext.require(strIncrInsertCasts, insertCastsInput);
            e.setValue(result.astWithCasts);
            outputMessages.addAll(result.messages);
        }
        return splitResult;
    }

    public static void prepareSCCEnv(Frontends.Output output, Data staticData,
        Map<String, Map<IStrategoString, IStrategoTerm>> stratEnvInclImports,
        Map<String, BinaryRelation.Immutable<IStrategoString, IStrategoTerm>> constrEnvInclImports,
        Map<String, BinaryRelation.Immutable<IStrategoTerm, IStrategoTerm>> injEnvInclImports, Set<String> scc,
        Map<IStrategoString, IStrategoTerm> sccStrategyEnv,
        BinaryRelation.Transient<IStrategoString, IStrategoTerm> sccConstructorEnvT,
        BinaryRelation.Transient<IStrategoTerm, IStrategoTerm> sccInjEnvT, ITermFactory tf) {
        for(String moduleName : scc) {
            final SplitResult splitResult = output.splitModules.get(moduleName);

            final Map<IStrategoString, IStrategoTerm> moduleEnv = new HashMap<>(2 * splitResult.defTypes.size());
            for(Map.Entry<String, IStrategoTerm> e : splitResult.defTypes.entrySet()) {
                moduleEnv.put(tf.makeString(e.getKey()), e.getValue());
            }
            for(StrategySignature dynRuleSig : splitResult.dynRuleSigs) {
                moduleEnv.putAll(dynRuleSig.dynamicRuleSignatures(tf));
            }
            for(Map.Entry<String, IStrategoTerm> e : splitResult.consTypes.entrySet()) {
                sccConstructorEnvT.__insert(tf.makeString(e.getKey()), e.getValue());
            }
            Relation.putAll(sccInjEnvT, splitResult.injections);
            sccStrategyEnv.putAll(moduleEnv);
            for(String mod : staticData.imports.getOrDefault(moduleName, new HashSet<>())) {
                Relation
                    .putAll(sccConstructorEnvT, constrEnvInclImports.getOrDefault(mod, BinaryRelation.Immutable.of()));
                Relation.putAll(sccInjEnvT, injEnvInclImports.getOrDefault(mod, BinaryRelation.Immutable.of()));
                sccStrategyEnv.putAll(stratEnvInclImports.getOrDefault(mod, new HashMap<>()));
            }
        }
    }

    public static Output check(Logger logger, String mainFileModulePath, Data staticData,
        Map<String, Set<String>> overlayConstrs, List<Message<?>> outputMessages) throws ExecException {
        StringSetWithPositions allExternals = new StringSetWithPositions(staticData.libraryExternalStrategies);
        for(StringSetWithPositions s : staticData.externalStrategies.values()) {
            allExternals.addAll(s);
        }
        StringSetWithPositions globalStrategies = new StringSetWithPositions();
        StringSetWithPositions globalConstructors = new StringSetWithPositions();
        for(StringSetWithPositions s : staticData.definedStrategies.values()) {
            globalStrategies.addAll(s);
        }
        for(StringSetWithPositions s : staticData.definedConstructors.values()) {
            globalConstructors.addAll(s);
        }
        globalStrategies.addAll(allExternals);

        // Cified-strategy-name (where the call occurs) to cified-strategy-name (amb call) to cified-strategy-name (amb
        // call resolves to)
        final Map<String, SortedMap<String, String>> ambStratResolution = new HashMap<>();
        // Module-path to visible when imported (transitive closure of strategy definitions)
        final Map<String, StringSetWithPositions> visibleStrategies =
            new HashMap<>(2 * (staticData.definedStrategies.size() + staticData.definedCongruences.size()));
        for(Map.Entry<String, StringSetWithPositions> entry : staticData.definedStrategies.entrySet()) {
            visibleStrategies.put(entry.getKey(), new StringSetWithPositions(entry.getValue()));
        }
        for(Map.Entry<String, StringSetWithPositions> entry : staticData.externalStrategies.entrySet()) {
            getOrInitialize(visibleStrategies, entry.getKey(), StringSetWithPositions::new).addAll(entry.getValue());
        }
        for(Map.Entry<String, StringSetWithPositions> entry : staticData.definedCongruences.entrySet()) {
            getOrInitialize(visibleStrategies, entry.getKey(), StringSetWithPositions::new).addAll(entry.getValue());
        }
        // Module-path to constructor_arity names visible when imported (transitive closure of constructor definitions)
        final Map<String, StringSetWithPositions> visibleConstructors =
            new HashMap<>(2 * staticData.definedConstructors.size());
        for(Map.Entry<String, StringSetWithPositions> entry : staticData.definedConstructors.entrySet()) {
            visibleConstructors.put(entry.getKey(), new StringSetWithPositions(entry.getValue()));
        }

        strategyNeedsExternal(mainFileModulePath, staticData, outputMessages, allExternals);
        cyclicOverlays(mainFileModulePath, staticData, overlayConstrs, outputMessages);

        // CHECK that names can be resolved
        final Deque<Set<String>> sccs = Algorithms.topoSCCs(Collections.singleton(mainFileModulePath),
            k -> staticData.imports.getOrDefault(k, Collections.emptySet()));
        for(Iterator<Set<String>> iterator = sccs.descendingIterator(); iterator.hasNext(); ) {
            Set<String> scc = iterator.next();
            StringSetWithPositions theVisibleStrategies = new StringSetWithPositions();
            StringSetWithPositions theVisibleConstructors = new StringSetWithPositions();
            for(String moduleName : scc) {
                theVisibleConstructors
                    .addAll(visibleConstructors.getOrDefault(moduleName, new StringSetWithPositions()));
                theVisibleStrategies.addAll(visibleStrategies.getOrDefault(moduleName, new StringSetWithPositions()));
                for(String mod : staticData.imports.getOrDefault(moduleName, new HashSet<>())) {
                    theVisibleConstructors.addAll(visibleConstructors.getOrDefault(mod, new StringSetWithPositions()));
                    theVisibleStrategies.addAll(visibleStrategies.getOrDefault(mod, new StringSetWithPositions()));
                }
            }
            for(String moduleName : scc) {
                if(Library.Builtin.isBuiltinLibrary(moduleName)) {
                    continue;
                }
                visibleConstructors.put(moduleName, theVisibleConstructors);
                visibleStrategies.put(moduleName, theVisibleStrategies);
                resolveConstructors(outputMessages, globalConstructors, theVisibleConstructors, moduleName, staticData);
                resolveStrategies(staticData, outputMessages, globalStrategies, theVisibleStrategies, moduleName);
                overlapWithExternals(staticData, outputMessages, moduleName, allExternals);
                resolveAmbiguousStrategyCalls(staticData, outputMessages, ambStratResolution, theVisibleStrategies,
                    moduleName);
            }
        }
        return new Output(ambStratResolution);
    }

    /**
     * RESOLVE ambiguous strategy calls (i.e. in higher-order strategy argument position)
     *
     * @throws ExecException on stratego strategy name that does not conform to cified name
     */
    private static void resolveAmbiguousStrategyCalls(Data staticData, List<Message<?>> outputMessages,
        final Map<String, SortedMap<String, String>> ambStratResolution, StringSetWithPositions theVisibleStrategies,
        String moduleName) throws ExecException {
        Map<String, Set<String>> theUsedAmbStrategies =
            new HashMap<>(staticData.usedAmbStrategies.getOrDefault(moduleName, Collections.emptyMap()));
        StringSetWithPositions ambStratPositions =
            staticData.ambStratPositions.getOrDefault(moduleName, new StringSetWithPositions());
        // By default a _0_0 strategy is used in the ambiguous call situation if one is defined.
        theUsedAmbStrategies.keySet().removeIf(theVisibleStrategies::contains);
        if(!theUsedAmbStrategies.isEmpty()) {
            Map<String, Set<String>> differentArityDefinitions = new HashMap<>(2 * theVisibleStrategies.size());
            for(String theVisibleStrategy : theVisibleStrategies.readSet()) {
                String ambCallVersion = stripArity(theVisibleStrategy) + "_0_0";
                getOrInitialize(differentArityDefinitions, ambCallVersion, HashSet::new).add(theVisibleStrategy);
            }
            for(Map.Entry<String, Set<String>> entry : theUsedAmbStrategies.entrySet()) {
                final String usedAmbStrategy = entry.getKey();
                final Set<String> defs =
                    differentArityDefinitions.getOrDefault(usedAmbStrategy, Collections.emptySet());
                switch(defs.size()) {
                    case 0:
                        for(IStrategoString ambStrategyPosition : ambStratPositions.getPositions(usedAmbStrategy)) {
                            outputMessages
                                .add(Message.strategyNotFound(moduleName, ambStrategyPosition, MessageSeverity.ERROR));
                        }
                        break;
                    case 1:
                        final String resolvedDef = defs.iterator().next();
                        for(String useSite : entry.getValue()) {
                            getOrInitialize(ambStratResolution, useSite, TreeMap::new)
                                .put(usedAmbStrategy, resolvedDef);
                        }
                        break;
                    default:
                        for(IStrategoString ambStratPosition : ambStratPositions.getPositions(usedAmbStrategy)) {
                            outputMessages.add(Message.ambiguousStrategyCall(moduleName, ambStratPosition, defs));
                        }
                }
            }
        }
    }

    /**
     * CHECK for overlap with external strategies (error condition)
     */
    private static void overlapWithExternals(Data staticData, List<Message<?>> outputMessages, String moduleName,
        StringSetWithPositions allExternals) {
        final StringSetWithPositions definedStrategies =
            staticData.definedStrategies.getOrDefault(moduleName, new StringSetWithPositions());
        final StringSetWithPositions internalStrategies =
            staticData.internalStrategies.getOrDefault(moduleName, new StringSetWithPositions());
        Set<String> strategiesOverlapWithExternal = Sets.difference(
            Sets.difference(Sets.intersection(definedStrategies.readSet(), allExternals.readSet()), ALWAYS_DEFINED),
            internalStrategies.readSet());
        for(String name : strategiesOverlapWithExternal) {
            if(!staticData.strategyNeedsExternal.contains(name)) {
                for(IStrategoString strategyDef : definedStrategies.getPositions(name)) {
                    outputMessages.add(Message.externalStrategyOverlap(moduleName, strategyDef));
                }
            }
        }
    }

    /**
     * CHECK for strategies that cannot be resolved (error/warning condition)
     */
    private static void resolveStrategies(Data staticData, List<Message<?>> outputMessages,
        StringSetWithPositions globalStrategies, StringSetWithPositions theVisibleStrategies, String moduleName) {
        final StringSetWithPositions usedStrategies =
            staticData.usedStrategies.getOrDefault(moduleName, new StringSetWithPositions());
        Set<String> unresolvedStrategies = Sets.difference(usedStrategies.readSet(), theVisibleStrategies.readSet());
        for(String name : unresolvedStrategies) {
            final MessageSeverity severity;
            if(globalStrategies.contains(name)) {
                severity = MessageSeverity.WARNING;
            } else {
                severity = MessageSeverity.ERROR;
            }
            for(IStrategoString strategyUse : usedStrategies.getPositions(name)) {
                outputMessages.add(Message.strategyNotFound(moduleName, strategyUse, severity));
            }
        }
    }

    /**
     * CHECK for constructors that cannot be resolved (error/warning condition)
     */
    private static void resolveConstructors(List<Message<?>> outputMessages, StringSetWithPositions globalConstructors,
        StringSetWithPositions theVisibleConstructors, String moduleName, final Data staticData) {
        final StringSetWithPositions usedConstructors =
            staticData.usedConstructors.getOrDefault(moduleName, new StringSetWithPositions());
        final Set<String> unresolvedConstructors =
            Sets.difference(usedConstructors.readSet(), theVisibleConstructors.readSet());
        for(String name : unresolvedConstructors) {
            final MessageSeverity severity;
            if(globalConstructors.contains(name)) {
                severity = MessageSeverity.WARNING;
            } else {
                severity = MessageSeverity.ERROR;
            }
            for(IStrategoString constructorUse : usedConstructors.getPositions(name)) {
                outputMessages.add(Message.constructorNotFound(moduleName, constructorUse, severity));
            }
        }
    }

    /**
     * CHECK that overlays do not cyclically use each other (error condition) (New check, old compiler looped)
     */
    private static void cyclicOverlays(String mainFileModulePath, Data staticData,
        Map<String, Set<String>> overlayConstrs, List<Message<?>> outputMessages) {
        final Deque<Set<String>> overlaySccs =
            Algorithms.topoSCCs(overlayConstrs.keySet(), k -> overlayConstrs.getOrDefault(k, Collections.emptySet()));
        overlaySccs.removeIf(s -> {
            String overlayName = s.iterator().next();
            return s.size() == 1 && !overlayConstrs.getOrDefault(overlayName, Collections.emptySet())
                .contains(overlayName);
        });
        for(Set<String> overlayScc : overlaySccs) {
            for(String name : overlayScc) {
                for(IStrategoString overlayName : staticData.overlayDefs.getPositions(name)) {
                    outputMessages.add(Message.cyclicOverlay(mainFileModulePath, overlayName, overlayScc));
                }
            }
        }
    }

    /**
     * CHECK that extending and/or overriding strategies have an external strategy to extend and/or override (New check,
     * old compiler generated Java code that would fail to compile)
     */
    private static void strategyNeedsExternal(String mainFileModulePath, Data staticData,
        List<Message<?>> outputMessages, StringSetWithPositions allExternals) {
        Set<String> strategyNeedsExternalNonOverlap =
            Sets.difference(staticData.strategyNeedsExternal.readSet(), allExternals.readSet());
        for(String name : strategyNeedsExternalNonOverlap) {
            for(IStrategoString definitionName : staticData.strategyNeedsExternal.getPositions(name)) {
                outputMessages.add(Message.externalStrategyNotFound(mainFileModulePath, definitionName));
            }
        }
    }

    private static String stripArity(String s) throws ExecException {
        if(s.substring(s.length() - 4).matches("_\\d_\\d")) {
            return s.substring(0, s.length() - 4);
        }
        if(s.substring(s.length() - 5).matches("_\\d+_\\d+")) {
            return s.substring(0, s.length() - 5);
        }
        Matcher m = stripArityPattern.matcher(s);
        if(!m.matches()) {
            throw new ExecException(
                "Frontend returned stratego strategy name that does not conform to cified name: '" + s + "'");
        }
        return m.group(1);
    }

    static <K, V> V getOrInitialize(Map<K, V> map, K key, Supplier<V> initialize) {
        map.computeIfAbsent(key, ignore -> initialize.get());
        return map.get(key);
    }

    private static String projectName(String inputFile) {
        // *can* we get the project name somehow? This is probably more portable for non-project based compilation
        return Integer.toString(inputFile.hashCode());
    }

}
