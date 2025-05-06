package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain;

public class Calculator {
    public int sumArray(int[] nums) {
        int accumulator = 0;
        for (int i = 0; i < nums.length; i++) {
            accumulator += nums[i];
        }
        return accumulator;
    }

    public int sumArrayVarArgs(int... nums) {
        int accumulator = 0;
        for (int i = 0; i < nums.length; i++) {
            accumulator += nums[i];
        }
        return accumulator;
    }
}
