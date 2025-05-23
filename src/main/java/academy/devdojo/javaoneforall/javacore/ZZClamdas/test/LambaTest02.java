package academy.devdojo.javaoneforall.javacore.ZZClamdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Allucard");
        List<Integer> integers = map(strings, String::length);
        List<String> upperCase = map(strings, String::toUpperCase);
        System.out.println(integers);
        System.out.println(upperCase);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }

        return result;
    }
}
