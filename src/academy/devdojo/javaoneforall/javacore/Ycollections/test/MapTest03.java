package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Consumer;
import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MapTest03 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Luiz Guilherme");
        Consumer consumer2 = new Consumer("Dev Luiz");

        Manga manga1 = new Manga(5L, "Attack on Titan", 19.9);
        Manga manga2 = new Manga(3L, "Hellsing Ultimate", 22.3);
        Manga manga3 = new Manga(2L, "Pokemon", 12.22);
        Manga manga4 = new Manga(1L, "Boku no hero", 29.99);
        Manga manga5 = new Manga(4L, "Dragon ball Z", 24.99);
        Manga manga6 = new Manga(6L, "Berserk", 14.99);

        List<Manga> mangaConsumer1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumer2List = List.of(manga4, manga5);
        Map<Consumer, List<Manga>> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, mangaConsumer1List);
        consumerMangaMap.put(consumer2, mangaConsumer2List);

        for (Map.Entry<Consumer, List<Manga>> entry : consumerMangaMap.entrySet()) {
            System.out.println("--- " + entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println("------ " + manga.getName());
            }
        }
    }
}
