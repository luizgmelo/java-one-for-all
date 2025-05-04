package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class getNextBusinessDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;
        switch (dayOfWeek) {
            case THURSDAY: addDays = 4; break;
            case FRIDAY: addDays = 3; break;
            case SATURDAY: addDays = 2; break;
            default: addDays = 1; break;
        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new getNextBusinessDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }

    private static void getNextBusiness(LocalDate date) {
        switch (date.getDayOfWeek()) {
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:
                LocalDate nextMonday = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
                System.out.println(nextMonday);
                System.out.println(nextMonday.getDayOfWeek());
                break;
            default:
                LocalDate nextDay = date.plusDays(1);
                System.out.println(nextDay);
                System.out.println(nextDay.getDayOfWeek());
        }
    }
}
