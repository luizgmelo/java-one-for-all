package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Car;
import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Printer;

public class CarTest01 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Car car1 = new Car();
        car1.name = "Mustang";
        car1.model = "Ford";
        car1.year = 1995;

        Car car2 = new Car();
        car2.name = "Camaro";
        car2.model = "Chevrolet";
        car2.year = 1997;

        printer.print(car1);

        printer.print(car2);
    }
}
