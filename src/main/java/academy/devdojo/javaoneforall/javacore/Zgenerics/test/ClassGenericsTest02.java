package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.BoatRentalService;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.CarRentalService;

public class ClassGenericsTest02 {
    public static void main(String[] args) {
        BoatRentalService boatRentalService = new BoatRentalService();
        Boat boat = boatRentalService.searchAvailableBoat();
        System.out.println("Usando o barco por um mês...");
        boatRentalService.returnRentBoat(boat);
    }
}
