package cwiczenia.Metody;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Podaj pierwszą liczbę: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Jakie działanie ma zostać wykonane? ");
        String symbol = scanner.next();

        System.out.println("Podaj drugą liczbę: ");
        double secondNumber = scanner.nextDouble();

        if (symbol.equals("+")) {
            System.out.println("Wynik " + firstNumber + " " + symbol + " " + secondNumber + " wynosi " + calculator.add(firstNumber, secondNumber));
        }

        if (symbol.equals("-")) {
            System.out.println("Wynik " + firstNumber + " " + symbol + " " + secondNumber + " wynosi " + calculator.subtract(firstNumber, secondNumber));
        }

        if (symbol.equals("*")) {
            System.out.println("Wynik " + firstNumber + " " + symbol + " " + secondNumber + " wynosi " + calculator.multiply(firstNumber, secondNumber));
        }

        if (symbol.equals("/")) {
            System.out.println("Wynik " + firstNumber + " " + symbol + " " + secondNumber + " wynosi " + calculator.divide(firstNumber, secondNumber));
        }
    }
}
