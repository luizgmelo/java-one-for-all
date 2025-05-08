package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Consumer;
import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Luiz Guilherme");
        Consumer consumer2 = new Consumer("Dev Luiz");

        Manga manga1 =new Manga(5L, "Attack on Titan", 19.9);
        Manga manga2 = new Manga(3L, "Hellsing Ultimate", 22.3);
        Manga manga3 = new Manga(2L, "Pokemon", 12.22);
        Manga manga4 = new Manga(1L, "Boku no hero", 29.99);
        Manga manga5 = new Manga(4L, "Dragon ball Z", 24.99);
        Manga manga6 = new Manga(6L, "Berserk", 14.99);

        Map<Consumer, Manga> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, manga1);
        consumerMangaMap.put(consumer2, manga4);

        for (Map.Entry<Consumer, Manga> entry : consumerMangaMap.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }
    }
}
