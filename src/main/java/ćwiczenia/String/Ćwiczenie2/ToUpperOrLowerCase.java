package ćwiczenia.String.Ćwiczenie2;

import java.util.Scanner;

public class ToUpperOrLowerCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz dowolny tekst:");
        String text = scanner.nextLine();

        char firstChar = text.charAt(0);

        System.out.println("Tekst po transformacji:");

        if (Character.isUpperCase(firstChar)) {
            System.out.println(text.toUpperCase());
        } else if (Character.isLowerCase(firstChar)) {
            System.out.println(text.toLowerCase());
        } else {
            System.out.println(text);
        }
    }
}
