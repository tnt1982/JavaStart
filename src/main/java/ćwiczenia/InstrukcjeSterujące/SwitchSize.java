package ćwiczenia.InstrukcjeSterujące;

import java.util.Scanner;

public class SwitchSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar S, M, L, lub XL");

        String yourSize = scanner.nextLine().toUpperCase();
        String size;

        switch (yourSize) {
            case "S":
                size = " rozmiar mały";
                break;
            case "M":
                size = " rozmiar średni";
                break;
            case "L":
                size = " rozmiar duży";
                break;
            case "XL":
                size = " rozmiar bardzo duży";
                break;
            default:
                size = " rozmiar nieznany";
        }
        System.out.println("Wybrałeś" + size);
    }
}
