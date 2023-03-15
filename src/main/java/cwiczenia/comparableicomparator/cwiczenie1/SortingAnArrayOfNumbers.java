package cwiczenia.comparableicomparator.cwiczenie1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingAnArrayOfNumbers {

    public static void main(String[] args) {

        int maxArrayCapacity = 20;
        Integer[] numbers = new Integer[maxArrayCapacity];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < maxArrayCapacity; i++) {
            System.out.println("Podaj liczbę całkowitą: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Nieposortowana tablica liczb: ");
        printArray(numbers);

        System.out.println("Tablica liczb posortowana rosnąco: ");
        Arrays.sort(numbers);
        printArray(numbers);

        System.out.println("Tablica liczb posortowana malejąco: ");
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return -Integer.compare(n1, n2);
            }
        });
        printArray(numbers);
    }

    static void printArray(Integer[] n) {
        for (int number : n) {
            System.out.println(number);
        }
    }

}
