package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergarden", 4.0),
            new LightNovel("No Game No Life", 2.99),
            new LightNovel("No Game No Life", 2.99),
            new LightNovel("Classroom of elite", 9.99),
            new LightNovel("Fullmetal Alchemist", 5.99)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(count);
    }
}
