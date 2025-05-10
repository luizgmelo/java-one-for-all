package academy.devdojo.javaoneforall.javacore.ZZB.comportamento.test;

import academy.devdojo.javaoneforall.javacore.ZZB.comportamento.domain.Car;
import academy.devdojo.javaoneforall.javacore.ZZB.comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
//        List<Car> greenCars = filterCar(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });

        List<Car> greenCars = filterCar(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filterCar(cars, car -> car.getColor().equals("red"));
        List<Car> yearsBefore2015 = filterCar(cars, car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearsBefore2015);
    }

    private static List<Car> filterCar(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
