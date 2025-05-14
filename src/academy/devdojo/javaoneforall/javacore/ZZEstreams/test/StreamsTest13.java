package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

public class StreamsTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overload", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 4.0, Category.DRAMA),
            new LightNovel("No Game No Life", 2.99, Category.FANTASY),
            new LightNovel("Classroom of elite", 9.99, Category.ROMANCE),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY)
    ));

    public static void main(String[] args) {

        Map<Category, Map<Promotion, List<LightNovel>>> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                         groupingBy(getPromotion())));
        System.out.println(collect);
        //  Map<Category, Map<Promotion, List<LightNovel>>>

    }

    private static Function<LightNovel, Promotion> getPromotion() {
        return ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
