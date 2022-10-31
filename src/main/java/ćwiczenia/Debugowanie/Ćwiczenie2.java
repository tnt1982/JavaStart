package ćwiczenia.Debugowanie;

import java.util.Scanner;

public class Ćwiczenie2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] evenNumbers = new int[3];
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println("Podaj liczbę: ");
            int number = scanner.nextInt();
            if ((number % 2) == 0 && (number >78)) {
                evenNumbers[i] = number;
            } else {
                i--;
            }
        }
        for (int element : evenNumbers) {
            System.out.println(element);
        }
    }
}


