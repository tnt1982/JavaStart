package ćwiczenia.operacjeNaTablicach.ćwiczenie2;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoGivenTexts {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj napis numer jeden:");
        String firstText = scanner.nextLine();
        System.out.println("podaj napis numer dwa:");
        String secondText = scanner.nextLine();

        boolean comparisonResult = compareTwoTexts(firstText, secondText);

        System.out.println("Czy dwa wprowdzone teksty są równe?");
        Thread.sleep(1000);
        System.out.println(comparisonResult);

    }

    private static boolean compareTwoTexts(String firstText, String secondText) {
        if (firstText == null && secondText == null) {
            return true;
        }
        if (firstText == null || secondText == null || (firstText.length() != secondText.length())) {
            return false;
        }
        char[] firstCharArray = firstText.toLowerCase().toCharArray();
        char[] secondCharArray = secondText.toLowerCase().toCharArray();

        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);

        return Arrays.equals(firstCharArray, secondCharArray);
    }
}

