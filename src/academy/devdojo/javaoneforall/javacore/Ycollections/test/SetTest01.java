package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 22.3));
        mangas.add(new Manga(2L, "Pokemon", 12.22));
        mangas.add(new Manga(1L, "Boku no hero", 29.99));
        mangas.add(new Manga(4L, "Dragon ball Z", 24.99));
        mangas.add(new Manga(4L, "Dragon ball Z", 25));
        mangas.add(new Manga(6L, "Berserk", 14.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }

}
