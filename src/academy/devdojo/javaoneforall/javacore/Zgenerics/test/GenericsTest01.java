package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Midoriya");
        list.add("Goku");
        list.add("Eren");

        for (String s : list) {
            System.out.println(s);
        }

        add(list, new Consumer("Midoriya"));

        for (Object o : list) {
            System.out.println(o);
        }

    }

    private static void add(List list, Consumer consumer) {
        list.add(consumer);
    }
}
