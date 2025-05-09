package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.BoatRentalService;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassGenericsTest03 {
    public static void main(String[] args) {
        List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));
        List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Iate")));


        RentalService<Car> carRentalService = new RentalService<>(availableCars);
        Car car = carRentalService.searchAvailableObjects();
        System.out.println("Usando o carro por um mês...");
        carRentalService.returnRentObjects(car);

        System.out.println("---------");

        RentalService<Boat> boatRentalService = new RentalService<>(availableBoats);
        Boat boat = boatRentalService.searchAvailableObjects();
        System.out.println("Usando o barco por um mês...");
        boatRentalService.returnRentObjects(boat);
    }
}
