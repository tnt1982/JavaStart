package ćwiczenia.operacjeNaTablicach.ćwiczenie2;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoTexts {

    public static void main(String[] args) throws InterruptedException {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj napisa 1: ");
//        String firstText = scanner.nextLine().toUpperCase();
//
//        System.out.println("Podaj napis 2:");
//        String secondText = scanner.nextLine().toUpperCase();
//
//        System.out.println("Pobrane napisy to: " + firstText + " " + secondText);
//        System.out.println("Czy napisy składają się z tych samych liter?");
//        Thread.sleep(3000);

        String[] firstTextArray = {"A", "S", "D", "F"};
        String[] secondTextArray = {"F", "D", "S", "A"};

        System.out.println("Tablica nieposortowane:");
        printArrays(firstTextArray);
        printArrays(secondTextArray);

        System.out.println("\n");
        System.out.println("Tablice posortowane:");
        Arrays.sort(firstTextArray);
        Arrays.sort(secondTextArray);
        printArrays(firstTextArray);
        printArrays(secondTextArray);

        containsTheSameChars(firstTextArray, secondTextArray);
    }

    private static boolean containsTheSameChars (String[] firstText, String[] secondText) {
        Arrays.sort(firstText);
        Arrays.sort(secondText);

        printArrays(firstText);
        printArrays(secondText);

        boolean marker = false;
        if (Arrays.equals(firstText, secondText)) {
            marker = true;
        } else {
            marker = false;
        }
        System.out.println(marker);
        return marker;
    }

    public static <T> void printArrays(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
    }
}

