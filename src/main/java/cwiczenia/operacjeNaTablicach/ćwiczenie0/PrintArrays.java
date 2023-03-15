package cwiczenia.operacjeNaTablicach.ćwiczenie0;

import java.util.Arrays;

public class PrintArrays {

    public static void main(String[] args) {

        String[] name = {"Gosia", "Kasia", "Basia", "Ania", "Asia"};
        Integer[] numbers = {77, 3, 1, 7, 5, 11};

        System.out.print("Imiona: ");
        printArrays(name);
        System.out.println("Imiona z Arrays" + Arrays.toString(name));
        System.out.println();
        System.out.print("Numery: ");
        printArrays(numbers);
        System.out.println("Numery z Arrays" + Arrays.toString(numbers));

        String[] copyOfNames = Arrays.copyOf(name, name.length); // metoda do kopiowania tablicy
        Integer[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(numbers); // metoda do sortowania tablicy
        Arrays.sort(name);

        System.out.println("Tablice nieposortowane:");
        printArrays(copyOfNumbers);
        printArrays(copyOfNames);
        System.out.println( );
        System.out.println("Tablice posortowane:");
        printArrays(numbers);
        printArrays(name);

        System.out.println("\nMetoda do wypełniania tablicy: ");
        String[] strings = new String[7];
        Arrays.fill(strings, "Inka");
        printArrays(strings);


        System.out.println("\nKopiowanie tablicy: ");

        int [] ints = {77, 777, 777, 7777, 77777};
        int [] intsCopy = new int[ints.length];

        System.arraycopy(ints, 2, intsCopy, 0, ints.length-2);
        System.out.println(Arrays.toString(intsCopy));

    }

    public static <T> void printArrays(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
    }
}
