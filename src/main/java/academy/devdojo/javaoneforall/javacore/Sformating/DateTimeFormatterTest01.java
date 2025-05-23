package academy.devdojo.javaoneforall.javacore.Sformating;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s2 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s1 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20041015", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2004-10-15+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2004-10-15", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2025-05-04T11:12:27.000079538", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        //dd/MM/yyyy
        //MM/dd/yyyy
        //yyyy/MM/dd
        DateTimeFormatter brazilFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(brazilFormat);
        System.out.println(formatBR);

        LocalDate parseBR = LocalDate.parse("19/02/2025", brazilFormat);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.GERMAN);
        String formatGerman = LocalDate.now().format(formatterGR);
        System.out.println(formatGerman);
        LocalDate parseGR = LocalDate.parse("04.05.2025", formatterGR);
        System.out.println(parseGR);
    }
}
