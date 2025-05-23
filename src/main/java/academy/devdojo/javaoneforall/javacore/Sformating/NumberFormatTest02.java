package academy.devdojo.javaoneforall.javacore.Sformating;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double value = 100_000_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMinimumFractionDigits());
            System.out.println(numberFormat.format(value));
        }

        String stringValue = "$1234.1234";
        try {
            System.out.println(nfa[0].parse(stringValue));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
