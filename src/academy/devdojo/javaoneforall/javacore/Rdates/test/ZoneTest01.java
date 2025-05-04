package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds.get("BET"));
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime tokyoZoneDateTime = now.atZone(tokyoZone);
        System.out.println(tokyoZoneDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime tokyoZoneInstant = nowInstant.atZone(tokyoZone);
        System.out.println(tokyoZoneInstant);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        System.out.println(now.atOffset(offsetManaus));

        OffsetDateTime offsetDateTime = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate mejiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate mejiEra = JapaneseDate.from(mejiEraLocalDate);
        System.out.println(mejiEra);
    }
}
