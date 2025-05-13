package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamsTest10 {
    public static void main(String[] args) {
//        Stream.iterate(2, n -> n + 2).limit(10).forEach(System.out::println);
        // (0, 1) (1, 1) (1, 2) (2, 3) (3, 5)
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                    .limit(10)
                    .forEach(n -> System.out.println(Arrays.toString(n)));

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(n -> n[0])
                .forEach(System.out::println);

        ThreadLocalRandom current = ThreadLocalRandom.current();
        Stream.generate(() -> current.nextInt(1, 10_000)).limit(5).forEach(System.out::println);
    }
}
