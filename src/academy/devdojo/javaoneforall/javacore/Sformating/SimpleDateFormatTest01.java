package academy.devdojo.javaoneforall.javacore.Sformating;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Amsterdam' dd 'of' MMMM, yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            System.out.println(simpleDateFormat.parse("Amsterdam 15 of April, 2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
