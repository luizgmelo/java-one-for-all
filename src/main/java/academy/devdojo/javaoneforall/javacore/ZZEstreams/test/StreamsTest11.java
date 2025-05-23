package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergarden", 4.0),
            new LightNovel("No Game No Life", 2.99),
            new LightNovel("Classroom of elite", 9.99),
            new LightNovel("Fullmetal Alchemist", 5.99)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(ln -> ln.getPrice())).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(ln -> ln.getPrice()))).ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(ln -> ln.getPrice()).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        lightNovels.stream().mapToDouble(ln -> ln.getPrice()).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics doubleSummaryStatistics = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(doubleSummaryStatistics);

        String lightNovelTitles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(lightNovelTitles);
    }
}
