package mb.stratego.build.strincr.function;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.function.Function;

import mb.stratego.build.strincr.IModuleImportService;
import mb.stratego.build.strincr.data.StrategySignature;
import mb.stratego.build.strincr.task.output.CheckOutput;

public class ModulesDefiningDynamicRule implements Serializable,
    Function<CheckOutput, LinkedHashSet<IModuleImportService.ModuleIdentifier>> {
    public final StrategySignature strategySignature;

    public ModulesDefiningDynamicRule(StrategySignature strategySignature) {
        this.strategySignature = strategySignature;
    }

    @Override
    public LinkedHashSet<IModuleImportService.ModuleIdentifier> apply(CheckOutput output) {
        return output.dynamicRuleIndex.get(strategySignature);
    }

    @Override public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;

        ModulesDefiningDynamicRule that = (ModulesDefiningDynamicRule) o;

        return strategySignature.equals(that.strategySignature);
    }

    @Override public int hashCode() {
        return strategySignature.hashCode();
    }
}
