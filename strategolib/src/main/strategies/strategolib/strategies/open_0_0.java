package strategolib.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.util.TermUtils;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class open_0_0 extends Strategy {
    public static open_0_0 instance = new open_0_0();

    /**
     * Stratego 2 type: {@code open :: (|) string -> FileDescriptor}
     */
    @Override public IStrategoTerm invoke(Context context, IStrategoTerm current) {
        context.getIOAgent().printError("'SSL_open' is not implemented.");
        return null;
    }
}
