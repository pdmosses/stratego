package strategolib.strategies.binary;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.util.TermUtils;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public abstract class BinaryRealCompStrategy extends Strategy {
    /**
     * Stratego 2 type: {@code (|int) int -> int}
     */
    @Override public IStrategoTerm invoke(Context context, IStrategoTerm left, IStrategoTerm right) {
        return operation(TermUtils.toJavaReal(left), TermUtils.toJavaReal(right)) ? left : null;
    }

    public abstract boolean operation(double left, double right);
}
