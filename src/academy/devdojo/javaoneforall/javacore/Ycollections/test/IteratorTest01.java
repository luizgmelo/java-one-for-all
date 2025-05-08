package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 22.3, 4));
        mangas.add(new Manga(2L, "Pokemon", 12.22, 0));
        mangas.add(new Manga(1L, "Boku no hero", 29.99, 2));
        mangas.add(new Manga(4L, "Dragon ball Z", 24.99, 0));
        mangas.add(new Manga(6L, "Berserk", 14.99, 3));

//        Iterator<Manga> iterator = mangas.iterator();
//        while(iterator.hasNext()) {
//            Manga manga = iterator.next();
//            if (manga.getQuantity() == 0) {
//                iterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantity() == 0);
        System.out.println(mangas);
    }
}
