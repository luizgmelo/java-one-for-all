package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;

import java.util.List;

public class MethodsGenericsTest01 {
    public static void main(String[] args) {
        List<Boat> boats = createArrayWithOneObject(new Boat("Canoa"));
        System.out.println(boats);
    }

    private static <T> List<T> createArrayWithOneObject(T t) {
        List<T> list = List.of(t);
        return list;
    }
}


