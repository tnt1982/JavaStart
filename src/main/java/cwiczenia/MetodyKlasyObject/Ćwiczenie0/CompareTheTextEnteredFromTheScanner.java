package cwiczenia.MetodyKlasyObject.Ćwiczenie0;

import java.util.Scanner;

public class CompareTheTextEnteredFromTheScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą wartość:");
        String firstString = scanner.nextLine();

        System.out.println("Podaj drugą wartość:");
        String secondString = scanner.nextLine();

        System.out.println("Czy wartości są takie same?");

        boolean compare = (firstString.equalsIgnoreCase(secondString));

        if (compare == true) {
            System.out.println("Wartości są takie same!");
        } else {
            System.out.println("Wartości nie są takie same!");
        }
    }
}
