package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain;

import java.util.Arrays;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;

    public void calculateSalaryAverage() {
        double average = 0;
        for (double salary : salaries) {
            average += salary;
        }
        average /= salaries.length;
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

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries(double[] salaries) {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }
}
