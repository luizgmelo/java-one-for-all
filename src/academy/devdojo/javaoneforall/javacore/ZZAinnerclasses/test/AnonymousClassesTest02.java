package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Iate")));

        availableBoats.sort(new Comparator<Boat>(){
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(availableBoats);
    }
}
