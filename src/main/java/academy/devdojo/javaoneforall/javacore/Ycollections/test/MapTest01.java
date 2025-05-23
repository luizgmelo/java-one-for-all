package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> phones = new HashMap<>();
        phones.put("Eduardo", "1111-1111");
        phones.put("Eduardo", "2222-2222");
        phones.put("Maria", "3333-3333");
        phones.put("Lucas", "4444-4444");
        System.out.println(phones);

        for (String key : phones.keySet()) {
            System.out.println(key);
        }

        System.out.println("--------");

        for (String value : phones.values()) {
            System.out.println(value);
        }

        System.out.println("--------");

        for (Map.Entry<String, String > entry : phones.entrySet()) {
            System.out.println(entry);
        }
    }
}
