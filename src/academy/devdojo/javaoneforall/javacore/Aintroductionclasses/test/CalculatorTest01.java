package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] nums = {1,2,3,4,5};
        int res1 = calculator.sumArray(nums);
        int res2 = calculator.sumArrayVarArgs(1,2,3,4,5,6,7,8,9);

        System.out.println(res1);
        System.out.println(res2);
    }
}
