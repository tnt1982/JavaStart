package ćwiczenia.PrzeciążanieMetodISłowoThis1;

public class Calculator {

    public void add(int firstNumber, int secondNumber, int thirdNumber) {
        int result = firstNumber + secondNumber + thirdNumber;
        System.out.println(result);
    }

    public void add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }

    public void add(double firstNumber, double secondNumber, double thirdNumber) {
        double result = firstNumber + secondNumber + thirdNumber;
        System.out.println(result);
    }

    public void add(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        System.out.println(result);
    }

    public void subtract(int firstNumber, int secondNumber, int thirdNumber) {
        int result = firstNumber - secondNumber - thirdNumber;
        System.out.println(result);
    }

    public void subtract(double firstNumber, double secondNumber, double thirdNumber) {
        double result = firstNumber - secondNumber - thirdNumber;
        System.out.println(result);
    }
}