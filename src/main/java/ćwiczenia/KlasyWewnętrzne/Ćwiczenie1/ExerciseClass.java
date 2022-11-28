package ćwiczenia.KlasyWewnętrzne.Ćwiczenie1;

import java.util.Scanner;

public class ExerciseClass {

    public static void main(String[] args) {

        int tabCapacity = 7;
        int[] tab = new int[tabCapacity];
        int numberOfNumber = 0;

        Scanner scanner = new Scanner(System.in);

        while (numberOfNumber < tabCapacity) {
            System.out.println("Podaj liczbę, którą dodamy do tablicy");
            int number = scanner.nextInt();
            tab[numberOfNumber] = number;
            numberOfNumber++;
        }

        Sortable s = new Sortable() { // klasa anonimowa;
            @Override
            public void sort(int[] numbers) {
                if (tab == null)
                    throw new NullPointerException();
                if (tab.length == 0)
                    throw new IllegalArgumentException();

                int biggerNumber = tab[0];
                for (int i = 0; i < tab.length; i++) {
                    if (biggerNumber < tab[i]) {
                        biggerNumber = tab[i];
                    }
                }
                System.out.println(biggerNumber);
            }
        };
        printArray(tab);
        System.out.println("\nNajwyższą wartością z tablicy jest:");
        s.sort(tab);

    }

    private static void printArray(int[] tab) {
        System.out.println("\nWszystkie wpisane liczby z tablicy: ");
        for (int value : tab) {
            System.out.println(value);
        }
    }

}

