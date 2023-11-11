package cwiczenia.InstrukcjeSterujące;

import java.util.Scanner;

public class SwitchExpressions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar S, M, L, lub XL");

        String yourSize = scanner.nextLine().toUpperCase();

        switch (yourSize) {
            case "S" -> System.out.println("wybrałeś rozmiar mały");
            case "M" -> System.out.println("wybrałeś rozmiar średni");
            case "L" -> System.out.println("wybrałeś rozmiar duży");
            case "XL" -> System.out.println("wybrałeś rozmiar bardzo duży");
            default -> System.out.println("wybrałeś rozmiar nieznany");
        }

        // lub:

//        String size = switch (yourSize) {
//            case "S" -> " rozmiar mały";
//            case "M" -> " rozmiar średni";
//            case "L" -> " rozmiar duży";
//            case "XL" -> " rozmiar bardzo duży";
//            default -> " rozmiar nieznany";
//        };
//        System.out.println("Wybrałeś" + size);
    }
}
