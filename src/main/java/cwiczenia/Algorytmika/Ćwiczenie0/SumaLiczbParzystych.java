package cwiczenia.Algorytmika.Ćwiczenie0;

import java.util.Arrays;

public class SumaLiczbParzystych {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 19, 20};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.print("Suma liczb parzystych z pętli for wynosi: " + sum);

        System.out.println("\n");

        System.out.println("Iterujemy wszystkie liczby z tablicy:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.println("\n");

        System.out.println("drukujemy wszystkie liczby z tablicy numbers przy użyciu streamów");
        Arrays.stream(numbers).forEach(System.out::print);

        System.out.println("\n");

        int sumFromLoop = 0;
        for (int element : numbers) {
            if (element % 2 == 0) {
                sumFromLoop += element;
            }
        }
        System.out.println("Suma liczb parzystych z pętli for-each wynosi: " + (sumFromLoop));
    }
}