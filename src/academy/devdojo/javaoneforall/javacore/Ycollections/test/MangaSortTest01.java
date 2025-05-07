package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 22.3));
        mangas.add(new Manga(2L, "Pokemon", 12.22));
        mangas.add(new Manga(1L, "Boku no hero", 29.99));
        mangas.add(new Manga(4L, "Dragon ball Z", 24.99));
        mangas.add(new Manga(6L, "Berserk", 14.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("--------");
        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("--------");
//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }










    }
}
