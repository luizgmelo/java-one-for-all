package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain;

import java.util.Arrays;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void calculateSalaryAverage() {
        double average = 0;
        for (double salary : this.salaries) {
            average += salary;
        }
        average /= this.salaries.length;
        System.out.println(average);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + Arrays.toString(salaries) +
                '}';
    }
}
