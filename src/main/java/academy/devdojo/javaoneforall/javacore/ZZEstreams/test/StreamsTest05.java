package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String> letters2 = words.stream()
                .map(w -> w.split("")) // Stream<String[]>
                .flatMap(Arrays::stream)
                .collect(Collectors.toList()); // Stream<String>

        System.out.println(letters2);
    }
}
