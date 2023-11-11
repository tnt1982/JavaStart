package cwiczenia.datyiczas.cwiczenie1;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Timer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String noEnter = "noEnter";

        System.out.println("W celu rozpoczęcia pomiaru należy wcisnąć Enter");
        waitForEnter(scanner, noEnter);
        final Instant start = Instant.now();
        System.out.println("W celu zakończenia pomiaru należy wcisnąć Enter");
        waitForEnter(scanner, noEnter);
        final Instant stop = Instant.now();
        System.out.println("Zmierzony czas w sekundach wynosi:");
        System.out.println(Duration.between(start, stop).toSeconds());
    }

    private static void waitForEnter(Scanner scanner, String noEnter) {
        if (scanner.hasNextLine()) {
            noEnter.equals(scanner.nextLine());
        }
    }
}