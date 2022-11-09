package ćwiczenia.Wyjątki.Ćwiczenie0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dowolny tekst: ");
        String text = scanner.nextLine();

        int numberOfPrints = 0;
        boolean error = true;
        System.out.println("Ile razy chcesz go wyświetlić: ");
        do {
            try {
                numberOfPrints = scanner.nextInt();
                error = false;
                System.out.println("Wczytano poprawną liczbę.");
            } catch (InputMismatchException e) {
                System.err.print("Podana wartość jest niepoprawna. Spróbuj ponownie.\n");
                //    e.printStackTrace(); // jeśli mimo wszystko chcemy dodatkowo zobaczyć stackTrace to możemy go wywołać w ten sposób;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.print("Podana wartość jest niepoprawna. Spróbuj ponownie.\n");
            } finally {
                scanner.nextLine();
            }
        } while (error);
        System.out.printf("Wyraz: \"%s\" powtórzymy %d razy%s", text, numberOfPrints, ".");

        scanner.close();
    }
}
