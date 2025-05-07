package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on Titan");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Boku no hero");
        mangas.add("Dragon ball Z");
        mangas.add("Berserk");

        for (String manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);

        System.out.println("------");

        for (String manga : mangas) {
            System.out.println(manga);
        }

        List<Double> moneys = new ArrayList<>();
        moneys.add(123.12);
        moneys.add(102.32);
        moneys.add(1098.11);
        moneys.add(954.12);
        moneys.add(84.12);

        System.out.println(moneys);
        Collections.sort(moneys);
        System.out.println(moneys);


    }
}
