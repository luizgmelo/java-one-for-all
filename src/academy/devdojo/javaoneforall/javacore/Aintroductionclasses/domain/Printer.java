package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain;

public class Printer {
    public void print(Car car) {
        System.out.println("------------");
        System.out.println(car.name);
        System.out.println(car.model);
        System.out.println(car.year);
    }
}
