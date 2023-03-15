package cwiczenia.Algorytmika.Ćwiczenie1;

import java.util.Scanner;

public class SumOfNumbersLowerThanHundred {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("\nPodaj liczbę całkowitą");
            int number = scanner.nextInt();
            sum += number;

            if (sum >= 100) {
                System.out.println("Suma cyfr wynosi " + sum + ", jest równa, lub większa niż 100!!!. " +
                        "Muszę zakończyć program.");
                return;
            }
            if (sum % 2 == 0) {
                System.out.println("Suma liczb jest parzysta");
            } else {
                System.out.println("Suma liczb jest nieparzysta");
            }
            System.out.println("Suma liczb wynosi " + sum);

        }
    }
}

