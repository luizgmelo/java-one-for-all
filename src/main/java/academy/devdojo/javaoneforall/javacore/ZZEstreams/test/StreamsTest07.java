package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import java.util.List;

public class StreamsTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::sum));

        System.out.println("-------");

        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));
        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);

        System.out.println("-------");

        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::max).ifPresent(System.out::println);
    }
}
