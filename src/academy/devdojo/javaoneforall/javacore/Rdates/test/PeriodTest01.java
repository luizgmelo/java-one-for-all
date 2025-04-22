package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(9);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.between(now, now.plusDays(480));
        Period p3 = Period.ofDays(1000);
        Period p4 = Period.ofWeeks(58);
        Period p5 = Period.ofMonths(2);
        Period p6 = Period.ofYears(3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(Period.between(now, now.plusDays(p4.getDays())));
        System.out.println(now.until(now.plusDays(p4.getDays()), ChronoUnit.YEARS));
    }
}
