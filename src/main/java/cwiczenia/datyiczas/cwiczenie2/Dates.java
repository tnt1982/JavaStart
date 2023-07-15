package cwiczenia.datyiczas.cwiczenie2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Dates {

    public static void main(String[] args) {

        try{
        final LocalDate firstDate = createLocalDate();
        final LocalDate secondDate = createLocalDate();
        whichDateIsLater(firstDate, secondDate);
        calculateDifferenceBetweenTwoDates(firstDate, secondDate);
    } catch (DateTimeParseException e) {
            System.err.println("Podano datę w nieprawidłowym formacie");
        }
    }

    private static void calculateDifferenceBetweenTwoDates(LocalDate firstDate, LocalDate secondDate) {
        final Period between = Period.between(firstDate, secondDate);
        System.out.println("Podane daty dzieli " +
                Math.abs(between.getYears()) + " lat " +
                Math.abs(between.getMonths()) + " miesięcy " +
                Math.abs(between.getDays()) + " dni"
        );
    }

    private static void whichDateIsLater(LocalDate firstDate, LocalDate secondDate) {
        if (firstDate.isAfter(secondDate)) {
            System.out.println("Późniejsza data to: " + firstDate);
        } else if (firstDate.isBefore(secondDate)) {
            System.out.println("Późniejsza data to: " + secondDate);
        } else {
            System.out.println("Obie daty są równe");
        }
    }

    private static LocalDate createLocalDate() {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj dzień miesiąca:");
//        int day = scanner.nextInt();
//        System.out.println("Podaj miesiąc:");
//        int month = scanner.nextInt();
//        System.out.println("Podaj rok:");
//        int year = scanner.nextInt();
//        return LocalDate.of(year, month, day);

        System.out.println("Podaj datę w formacie rrrr-mm-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String givenDate = scanner.nextLine();
        return LocalDate.parse(givenDate, dateTimeFormatter);
    }
}