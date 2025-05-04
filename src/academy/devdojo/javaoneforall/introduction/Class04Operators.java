package academy.devdojo.javaoneforall.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        double result = number01 / (double) number02;

        System.out.println(result);

        // % - remainder
        int modulo = 20 % 2;
        System.out.println(modulo);

        // > < <= >= == !=
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualsThanTwenty = 10 >= 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        boolean isTenEqualsThanTwenty = 10 == 20;
        System.out.println("isTenLowerThanTwenty " + isTenLowerThanTwenty);
        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);
        System.out.println("isTenLowerOrEqualsThanTwenty " + isTenLowerOrEqualsThanTwenty);
        System.out.println("isTenGreaterOrEqualsThanTwenty " + isTenGreaterOrEqualsThanTwenty);
        System.out.println("isTenDifferentThanTwenty " + isTenDifferentThanTwenty);
        System.out.println("isTenEqualsThanTwenty " + isTenEqualsThanTwenty);

        // && (AND) || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isInsideLawGreaterThanThirty = idade > 30 && salario > 4612;
        boolean isInsideLawLessThanThirty = idade < 30 && salario >= 3381;

        System.out.println("isInsideLawGreaterThanThirty " + isInsideLawGreaterThanThirty);
        System.out.println("isInsideLawLessThanThirty " + isInsideLawLessThanThirty);

    }
}
