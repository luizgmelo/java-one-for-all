package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Consumer;
import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Consumer consumer = new Consumer("Luiz Guilherme");
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed());
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 22.3));
        mangas.add(new Manga(2L, "Pokemon", 12.22));
        mangas.add(new Manga(1L, "Boku no hero", 29.99));
        mangas.add(new Manga(4L, "Dragon ball Z", 24.99));
        mangas.add(new Manga(6L, "Berserk", 14.99));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
