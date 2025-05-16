package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain;

public class CurrencyFactory {

    public static Currency newCurrency(Country country) {
        switch (country) {
            case BRAZIL:
                return new Real();
            case USA:
                return new Dollar();
            default:
                throw new IllegalArgumentException("Not found currency for this country");
        }
    }

}
