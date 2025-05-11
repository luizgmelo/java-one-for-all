package academy.devdojo.javaoneforall.javacore.ZZB.comportamento.interfaces;

import academy.devdojo.javaoneforall.javacore.ZZB.comportamento.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
