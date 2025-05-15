package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;

public class StreamsTest15 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overload", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 4.0, Category.DRAMA),
            new LightNovel("No Game No Life", 2.99, Category.FANTASY),
            new LightNovel("Classroom of elite", 9.99, Category.ROMANCE),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                         summarizingDouble(LightNovel::getPrice)));

        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(
                groupingBy(LightNovel::getCategory, mapping(StreamsTest15::getPromotion, toSet())));

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream().collect(
                groupingBy(LightNovel::getCategory, mapping(StreamsTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));

        System.out.println(collect2);
    }

    public static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
