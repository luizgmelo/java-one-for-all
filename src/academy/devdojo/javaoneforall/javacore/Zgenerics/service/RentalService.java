package academy.devdojo.javaoneforall.javacore.Zgenerics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> availableObjects;

    public RentalService(List<T> availableObjects) {
        this.availableObjects = availableObjects;
    }

    public T searchAvailableObjects() {
        System.out.println("Buscando objeto disponivel...");
        T object = availableObjects.remove(0);
        System.out.println("Alugando objeto: " + object);
        System.out.println("Objetos disponiveis para alugar:");
        System.out.println(availableObjects);
        return object;
    }

    public void returnRentObjects(T object) {
        System.out.println("Devolvendo objeto " + object);
        availableObjects.add(object);
        System.out.println("Objetos disponiveis para alugar:");
        System.out.println(availableObjects);
    }
}
