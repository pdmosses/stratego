package strategolib.strategies;

import io.usethesource.capsule.BinaryRelation;
import strategolib.terms.StrategoImmutableRelation;

import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;

public class internal_immutable_relation_insert_0_2 extends Strategy {
    public static internal_immutable_relation_insert_0_2 instance = new internal_immutable_relation_insert_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm current, IStrategoTerm key, IStrategoTerm value) {
        final StrategoImmutableRelation map = (StrategoImmutableRelation) current;

        return new StrategoImmutableRelation(
            (BinaryRelation.Immutable<IStrategoTerm, IStrategoTerm>) map.backingRelation.__insert(key, value));
    }

}
