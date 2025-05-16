package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.test;

import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.Aircraft;
import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftSingletonEager singletonEager = AircraftSingletonEager.getINSTANCE();

    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft();
        System.out.println(aircraft.bookSeat(seat));
    }
}
