package cwiczenia.datyiczas.cwiczenie0;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CreateDate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj rok:");
//        int year = scanner.nextInt();
//        System.out.println("Podaj miesiąc");
//        int month = scanner.nextInt();
//        System.out.println("Podaj dzień");
//        int day = scanner.nextInt();
//        final LocalDate givenDate = LocalDate.of(year, month, day);
//        System.out.println("Podana data: " + givenDate);


        System.out.println("Podaj datę w formacie: rrrr-mm-dd");
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        final String input = scanner.nextLine();
        System.out.println("Podana przez Ciebie data: " + LocalDate.parse(input, dateTimeFormatter));
    }
}
