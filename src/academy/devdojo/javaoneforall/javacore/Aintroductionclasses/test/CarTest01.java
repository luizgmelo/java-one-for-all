package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Mustang";
        car1.model = "Ford";
        car1.year = 1995;

        Car car2 = new Car();
        car2.name = "Camaro";
        car2.model = "Chevrolet";
        car2.year = 1997;

        car1 = car2;

        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);

    }
}
