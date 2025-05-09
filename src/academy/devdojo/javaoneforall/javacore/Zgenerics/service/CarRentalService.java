package academy.devdojo.javaoneforall.javacore.Zgenerics.service;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRentalService {
    private List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));

    public Car searchAvailableCar() {
        System.out.println("Buscando carro disponivel...");
        Car car = availableCars.remove(0);
        System.out.println("Alugando carro: " + car);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(availableCars);
        return car;
    }

    public void returnRentCar(Car car) {
        System.out.println("Devolvendo carro " + car);
        availableCars.add(car);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(availableCars);
    }
}
