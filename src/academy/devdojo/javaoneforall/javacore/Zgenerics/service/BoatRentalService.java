package academy.devdojo.javaoneforall.javacore.Zgenerics.service;
 
import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentalService {
    private List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Iate")));

    public Boat searchAvailableBoat() {
        System.out.println("Buscando barco disponivel...");
        Boat boat = availableBoats.remove(0);
        System.out.println("Alugando barco: " + boat);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(availableBoats);
        return boat;
    }

    public void returnRentBoat(Boat barco) {
        System.out.println("Devolvendo barco " + barco);
        availableBoats.add(barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(availableBoats);
    }
}
