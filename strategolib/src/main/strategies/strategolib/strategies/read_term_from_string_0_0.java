package strategolib.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.ParseError;
import org.spoofax.terms.util.TermUtils;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class read_term_from_string_0_0 extends Strategy {
    public static read_term_from_string_0_0 instance = new read_term_from_string_0_0();

    /**
     * Stratego 2 type: {@code read-term-from-string :: (|) string -> ?}
     */
    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term) {
        try {
            return context.getFactory().parseFromString(TermUtils.toJavaString(term));
        } catch(ParseError e) {
            context.getIOAgent().printError("SSL_read_term_from_string: " + e.getMessage());
            return null;
        }
    }
}