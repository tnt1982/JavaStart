package ćwiczenia.Metody;

public class Calculate2 {

    public static void main(String[] args) {

        double firstNumber = 4.3;
        double secondNumber = 8.9;

        Calculator calculator = new Calculator();

        double sum = calculator.add(firstNumber, secondNumber);
        double sub = calculator.subtract(firstNumber, secondNumber);
        double mul = calculator.multiply(firstNumber, secondNumber);
        double div = calculator.divide(firstNumber, secondNumber);

        System.out.println("Suma dodawania wynosi: " + sum);
        System.out.println("Suma odejmowania wynosi: " + sub);
        System.out.println("Suma mnożenia wynosi: " + mul);
        System.out.println("Suma dzielenia wynosi: " + div);

    }
}
