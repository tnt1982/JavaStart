package ćwiczenia.WprowadzanieDanych.Ćwiczenie1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Calculate calculate = new Calculate();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        double firstNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Jakie działanie chcesz wykonać?");
        String mathSign = scanner.nextLine();

        System.out.println("Podaj drugą liczbę: ");
        double secondNumber = scanner.nextDouble();

        scanner.close();

        calculate.result(firstNumber, mathSign, secondNumber);

    }
}
