package academy.devdojo.javaoneforall.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> devLuiz = findName("Dev Luiz");
        devLuiz.ifPresent((String s) -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> strings = List.of("Dev Dojo", "Dev Luiz", "Dev Nych");
        int i = strings.indexOf(name);
        if (i > 0) {
            return Optional.of(strings.get(i));
        }
        return Optional.empty();
    }

}
