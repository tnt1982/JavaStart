package ćwiczenia.Rekurencja.ćwiczenie1;

import java.util.Scanner;

public class Ćwiczenie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną: ");
        int number = scanner.nextInt();
        System.out.println("Silnia " + number + " wynosi " + calculateTheFactorial(number));
    }

    public static int calculateTheFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Można podać tylko liczbę naturalną.");
        }
        return number > 1 ? number * calculateTheFactorial(number - 1) : 1;
//        if (number > 1) {
//            return number * calculateTheFactorial(number - 1);
//        } else {
//            return 1;
//        }
    }
}
