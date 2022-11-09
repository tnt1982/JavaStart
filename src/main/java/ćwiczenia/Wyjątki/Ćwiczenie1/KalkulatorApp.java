package ćwiczenia.Wyjątki.Ćwiczenie1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KalkulatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = 0;
        double secondNumber = 0;
        String symbol = null;

        boolean error = true;

        while (error) {
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                firstNumber = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Podaj operator matematyczny");
                symbol = scanner.nextLine();

                System.out.println("Podaj drugą liczbę: ");
                secondNumber = scanner.nextDouble();

                error = false;
            } catch (InputMismatchException e) {
                System.err.println("Podane wartości nie są liczbami. Spróbuj jeszcze raz.");
            }
        }

        try {
            double result = Kalkulator.calculate(firstNumber, secondNumber, symbol);
            System.out.println(firstNumber + symbol + secondNumber + " = " + result);
        } catch (UnknownOperatorException | ArithmeticException e) {
            System.err.println(e.getMessage());
            System.err.println("Nie udało się obliczyć wyniku działania " + firstNumber + symbol + secondNumber);
        }
    }
}
