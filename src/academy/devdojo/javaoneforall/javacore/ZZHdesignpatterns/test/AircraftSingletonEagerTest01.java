package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.test;

import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        AircraftSingletonEager singletonEager = AircraftSingletonEager.getINSTANCE();
        System.out.println(singletonEager);


        AircraftSingletonEager outroEager = AircraftSingletonEager.getINSTANCE();
        System.out.println(outroEager);

    }
}
