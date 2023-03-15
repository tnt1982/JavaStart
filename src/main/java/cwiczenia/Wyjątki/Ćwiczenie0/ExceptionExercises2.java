package cwiczenia.Wyjątki.Ćwiczenie0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercises2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean error = true;

        do {
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                numbers[0] = scanner.nextInt();
                System.out.println("Podaj drugą liczbę: ");
                numbers[1] = scanner.nextInt();

                System.out.println("Którą liczbę chcesz wyświetlić: 1, czy 2?");
                System.out.println("Wybrana liczba: " + numbers[scanner.nextInt()-1]);
                error = false;
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Podana wartość jest niepoprawna");
                scanner.nextLine();
            }
        } while (error);
        scanner.close();
    }
}
