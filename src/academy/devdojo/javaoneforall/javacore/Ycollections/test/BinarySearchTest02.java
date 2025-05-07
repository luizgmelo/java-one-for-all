package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 22.3));
        mangas.add(new Manga(2L, "Pokemon", 12.22));
        mangas.add(new Manga(1L, "Boku no hero", 29.99));
        mangas.add(new Manga(4L, "Dragon ball Z", 24.99));
        mangas.add(new Manga(6L, "Berserk", 14.99));

        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaSearch = new Manga(6L, "Berserk", 123.12);

        int i = Collections.binarySearch(mangas, mangaSearch, mangaByIdComparator);
        System.out.println(i);
    }
}
