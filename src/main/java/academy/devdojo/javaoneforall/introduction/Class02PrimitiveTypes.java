package academy.devdojo.javaoneforall.introduction;

public class Class02PrimitiveTypes {
    public static void main(String[] args) {
        // int, double, float, boolean, char, byte, short, long
        // cast
        int age = (int) 10000000000L;
        long bigNumber = (long) 10000.00;
        float salaryFloat = 2500.0F;
        double salaryDouble = 2500.0;
        boolean trueValue = true;
        boolean falseValue = false;
        short ageShort = 29;
        byte ageByte = -128;
        char character = 97;
        String name = "Guilherme";

        System.out.println("The age is " + age + " years old");
        System.out.println(bigNumber);
        System.out.println("Hello, my name is " + name + "!");
    }
}
