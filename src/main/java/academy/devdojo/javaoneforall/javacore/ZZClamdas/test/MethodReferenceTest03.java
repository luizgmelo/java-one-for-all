package academy.devdojo.javaoneforall.javacore.ZZClamdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Messias", "Dev Luiz", "Eric"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> stringToInteger = Integer::parseInt;
        Integer apply = stringToInteger.apply("20");

        BiPredicate<List<String>, String> contains = List::contains;
        System.out.println(contains.test(list, "Dev Luiz"));
    }
}
