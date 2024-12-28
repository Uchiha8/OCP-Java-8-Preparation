package Chapter5.sample;

import java.time.*;
import java.util.Locale;

public class Example {

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }

    private static void typesOfPeriodClass() {
        Period annually = Period.ofYears(1);
        Period quarterly = Period.ofMonths(3);
        Period everyThreeWeeks = Period.ofWeeks(3);
        Period everyOtherDay = Period.ofDays(2);
        Period everyYearAndWeek = Period.of(1, 0, 7);
    }

    private static void savingDayLight() {
        LocalDate localDate = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime localTime = LocalTime.of(1, 30);
        ZoneId zoneId = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zoneId);
        System.out.println(zonedDateTime);
        zonedDateTime = zonedDateTime.plusHours(1);
        System.out.println(zonedDateTime);
    }

    private static void commonStringMethods() {
        String s = "abcde  ";
        System.out.println(s.trim().length());
        System.out.println(s.charAt(4));
        System.out.println(s.indexOf('e'));
        System.out.println(s.indexOf("de"));
        System.out.println(s.substring(2, 4).toUpperCase());
        System.out.println(s.contains("DE"));
    }

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);

        Locale locale1 = new Locale("fr");
        Locale locale2 = new Locale("hi","OO");
        System.out.println(locale1);
        System.out.println(locale2);

    }
}
