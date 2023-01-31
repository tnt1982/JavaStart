package ćwiczenia.typyOpakowujące.ćwiczenie2;

import java.io.IOException;
import java.util.Scanner;

public class ReadAndCalculateNumberOfLettersAndDigits {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dowolne zdanie zawierające cyfry i litery: ");
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        final char[] chars = sentence.toCharArray();
        int numberOfLetters = 0;
        int numberOfDigits = 0;
        int biggestDigit = 0;
        for (char character : chars) {
            if (Character.isLetter(character)) {
                numberOfLetters++;
            }
            if (Character.isDigit(character)) {
                numberOfDigits++;
            }
            if (Character.isDigit(character)) {
                int digit = Character.getNumericValue(character);
                biggestDigit = Integer.max(biggestDigit, digit);
            }
        }
        System.out.println("Liczba liter w tekście wynosi: " + numberOfLetters);
        if ((biggestDigit == 0) && (numberOfDigits < 1)) {
            System.out.println("W tekście nie znalazła się ani jedna cyfra.");
        } else {
            System.out.println("Liczba cyfr w tekście wynosi: " + numberOfDigits);
            System.out.println("Najwyższa cyfra w tekście to: " + biggestDigit);
        }
    }
}

