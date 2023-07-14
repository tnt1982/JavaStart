package cwiczenia.datyiczas.cwiczenie0;

import java.time.*;
import java.time.chrono.IsoChronology;

public class TimeTest {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Czas start!");
        final Instant now1 = Instant.now();
        System.out.println(now1);

        System.out.println("Pętla: ");
        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }

        System.out.println("Czas stop!");
        final Instant now2 = Instant.now();

        final Duration between = Duration.between(now1, now2);
        System.out.println("Proces trwał (in nano): ");
        System.out.println(between.getNano());


//        LocalTime now = LocalTime.now();
//
//        for(int i = 0; i <= 7; i++) {
//            System.out.println(now.getHour() + "~" + now.getMinute() + "~" + now.getSecond());
//            now = now.plusSeconds(1);
//            Thread.sleep(1000);
//    }


        final LocalDate today = LocalDate.now();
        final LocalDate seventhOfMarch2017 = LocalDate.of(2017, 3, 7);

        System.out.println("Dzień roku:");
        System.out.println(today.getDayOfYear());
        System.out.println("Dzień miesiąca:");
        System.out.println(today.getDayOfMonth());
        System.out.println("Dzień tygodnia:");
        System.out.println(today.getDayOfWeek());

        System.out.println("Czy dzisiejsza data jest po podanej dacie?");
        System.out.println(today.isAfter(seventhOfMarch2017));

        final LocalDateTime todayDateAndTime = LocalDateTime.now();
        System.out.println("Dzisiejsza data i czas: " + todayDateAndTime);
    }
}