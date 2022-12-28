package ćwiczenia.Rekurencja;

import java.util.Scanner;

public class Ćwiczenie0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();
        oddOrEven(number);

    }
    public static void oddOrEven (int number) {
        final String result = number % 2 == 0 ? "parzysta" : "nieparzysta";
        System.out.println("Liczba " + number + " jest " + result);
    }
}
