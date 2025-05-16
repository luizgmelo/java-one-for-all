package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.test;

import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.AircraftSingletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        AircraftSingletonLazy singletonLazy = AircraftSingletonLazy.getINSTANCE();
        System.out.println(singletonLazy);

        AircraftSingletonLazy outroLazy = AircraftSingletonLazy.getINSTANCE();
        System.out.println(outroLazy);
    }
}
