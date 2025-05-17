package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.test;

import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person = Person.PersonBuilder
                .builder()
            .firstName("William")
                .lastName("Suane")
                .username("viradonojiraya")
                .email("william.suane@gmail.com")
                .build();

        System.out.println(person);
    }
}
