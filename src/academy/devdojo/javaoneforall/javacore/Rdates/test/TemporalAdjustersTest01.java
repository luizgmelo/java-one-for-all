package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withMonth(5);;
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
