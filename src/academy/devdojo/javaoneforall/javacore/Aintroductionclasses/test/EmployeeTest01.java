package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Midoriya");
        employee.setAge(32);
        double[] salaries = new double[]{1500.30, 2350.12, 3123.90};
        employee.setSalaries(salaries);
        employee.calculateSalaryAverage();
        System.out.println(employee);
    }
}
