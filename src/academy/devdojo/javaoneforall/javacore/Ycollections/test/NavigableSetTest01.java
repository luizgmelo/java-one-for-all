package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;
import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneModelComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}

class MangaPriceComparator implements Comparator<Manga> {


    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphoneModelComparator());
        smartphones.add(new Smartphone("1ABC1", "Iphone"));
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 22.3));
        mangas.add(new Manga(2L, "Pokemon", 12.22));
        mangas.add(new Manga(7L, "Naruto", 8.99));
        mangas.add(new Manga(1L, "Boku no hero", 24.99));
        mangas.add(new Manga(4L, "Dragon ball Z", 24.99));
        mangas.add(new Manga(6L, "Berserk", 14.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga berserk = new Manga(6L, "Berserk", 14.99);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("------");
        System.out.println(mangas.lower(berserk));
        System.out.println(mangas.floor(berserk));
        System.out.println(mangas.higher(berserk));
        System.out.println(mangas.ceiling(berserk));

        // lower element
        System.out.println(mangas.pollFirst());
        // higher element
        System.out.println(mangas.pollLast());
    }
}
