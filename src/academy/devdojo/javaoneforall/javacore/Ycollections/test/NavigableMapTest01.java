package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import academy.devdojo.javaoneforall.javacore.Ycollections.domain.Consumer;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Luiz Guilherme");
        Consumer consumer2 = new Consumer("Dev Luiz");

        NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("A", "Letra A");
        navigableMap.put("C", "Letra C");
        navigableMap.put("E", "Letra E");
        navigableMap.put("D", "Letra D");
        navigableMap.put("B", "Letra B");
        navigableMap.put("F", "Letra F");

        System.out.println(navigableMap.headMap("D"));
        navigableMap.tailMap("D").put("G", "Letra G");
        System.out.println(navigableMap.tailMap("D"));
    }
}
