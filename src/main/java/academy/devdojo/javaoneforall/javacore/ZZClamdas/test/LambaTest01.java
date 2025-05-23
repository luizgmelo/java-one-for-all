package academy.devdojo.javaoneforall.javacore.ZZClamdas.test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambaTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("Guilherme", "Dev Luiz");
        List<Integer> integers = List.of(1, 2, 3, 4);

        forEach(names, System.out::println);
        forEach(integers, (Integer i) -> System.out.println(i));
    }


    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
