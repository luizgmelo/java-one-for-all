package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.CarRentalService;

public class ClassGenericsTest01 {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();
        Car car = carRentalService.searchAvailableCar();
        System.out.println("Usando o carro por um mês...");
        carRentalService.returnRentCar(car);
    }
}
