package ćwiczenia.WprowadzanieDanych1.Ćwiczenie1;

public class Calculate {

    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double minus(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public void result (double firstNumber, String mathSign, double secondNumber) {
        switch (mathSign) {
            case "+":
                System.out.println("Wynik dodawania: " + firstNumber + " i "  + secondNumber +
                        " wynosi: " + add(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println("Wynik odejmowania: " + firstNumber + " i "  + secondNumber +
                        " wynosi: " + minus(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println("Wynik mnożenia: " + firstNumber + " i "  + secondNumber +
                        " wynosi: " + multiply(firstNumber, secondNumber));
                break;
            case "/":
                System.out.println("Wynik dzielenia: " + firstNumber + " i "  + secondNumber +
                        " wynosi: " + divide(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Podałeś niepoprawny znak matematyczny.");

        }
    }
}
