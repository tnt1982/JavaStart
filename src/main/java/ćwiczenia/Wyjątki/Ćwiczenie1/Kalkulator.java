package ćwiczenia.Wyjątki.Ćwiczenie1;

class Kalkulator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    static double calculate(double firstNumber, double secondNumber, String symbol) {
        double result = 0;
        switch (symbol) {
            case PLUS:
                result = firstNumber + secondNumber;
                break;
            case MINUS:
                result = firstNumber - secondNumber;
                break;
            case MULTIPLY:
                result = firstNumber * secondNumber;
                break;
            case DIVIDE:
                if (secondNumber == 0)
                    throw new ArithmeticException("Nie wolno dzielić przez 0");
                else
                    result = firstNumber / secondNumber;
                break;
            default:
                throw new UnknownOperatorException("Użyłeś niewłaściwego operatora. Użyj +, -, *, lub /");
        }
        return result;
    }
}