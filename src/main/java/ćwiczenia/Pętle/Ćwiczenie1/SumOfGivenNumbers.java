package ćwiczenia.Pętle.Ćwiczenie1;

import java.util.Scanner;

public class SumOfGivenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sumOfDigits = 0;

        System.out.println("Ile liczb chcesz wprowadzić?");
        int numberOfDigits = scanner.nextInt();

        for (int i = 0; i < numberOfDigits; i++) {
            System.out.println("Wprowadź liczbę numer " + (i + 1));
            int givenNumber = scanner.nextInt();
            sumOfDigits = sumOfDigits + givenNumber;
        }
        System.out.println("Suma liczb wynosi " + sumOfDigits);
        scanner.close();
    }
}
