package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 1. Order LightNovel by title
// 2. Retrieve the first 3 light novels with price less than 4
public class StreamsTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergarden", 4.0),
            new LightNovel("No Game No Life", 2.99),
            new LightNovel("Classroom of elite", 9.99),
            new LightNovel("Fullmetal Alchemist", 5.99)
    ));

    public static void main(String[] args) {
        List<String> firstThreeLightNovelPriceLessThanFour = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(firstThreeLightNovelPriceLessThanFour);
    }
}
