package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;


import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1. Order LightNovel by title
// 2. Retrieve the first 3 light novels with price less than 4
public class StreamsTest01 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergarden", 4.0),
            new LightNovel("No Game No Life", 2.99),
            new LightNovel("Classroom of elite", 9.99),
            new LightNovel("Fullmetal Alchemist", 5.99)
    ));

    public static void main(String[] args) {
        list.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> firstThreeLightNovelPriceLessThanFour = new ArrayList<>();
        for (LightNovel lightNovel : list) {
            if (lightNovel.getPrice() <= 4) {
                firstThreeLightNovelPriceLessThanFour.add(lightNovel.getTitle());
            }
            if (firstThreeLightNovelPriceLessThanFour.size() >= 3) {
                break;
            }
        }
        System.out.println(firstThreeLightNovelPriceLessThanFour);
    }
}
