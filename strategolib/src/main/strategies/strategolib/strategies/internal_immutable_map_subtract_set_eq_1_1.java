package strategolib.strategies;

import org.spoofax.interpreter.library.ssl.StrategoImmutableSet;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

import io.usethesource.capsule.Map;
import io.usethesource.capsule.util.EqualityComparator;
import org.spoofax.interpreter.library.ssl.StrategoImmutableMap;
import strategolib.terms.CompiledStrategyEqualityComparator;

public class internal_immutable_map_subtract_set_eq_1_1 extends Strategy {
    public static internal_immutable_map_subtract_set_eq_1_1 instance = new internal_immutable_map_subtract_set_eq_1_1();

    /**
     * Stratego 2 type: {@code internal-immutable-map-subtract-set-eq :: (v * v -> ?|ImmutableSetImplBlob) ImmutableMapImplBlob -> ImmutableMapImplBlob}
     */
     @Override public IStrategoTerm invoke(Context context, IStrategoTerm current, Strategy compare,
        IStrategoTerm other) {
        return subtract(current, other, new CompiledStrategyEqualityComparator(context, compare));
    }

    protected IStrategoTerm subtract(IStrategoTerm current, IStrategoTerm other, EqualityComparator<Object> cmp) {
        final Map.Transient<IStrategoTerm, IStrategoTerm> one =
            ((StrategoImmutableMap) current).backingMap.asTransient();
        for(IStrategoTerm key : ((StrategoImmutableSet) other).backingSet) {
            one.__removeEquivalent(key, cmp);
        }

        return new StrategoImmutableMap(one.freeze());
    }
}
