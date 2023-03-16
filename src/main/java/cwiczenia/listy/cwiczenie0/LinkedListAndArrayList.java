package cwiczenia.listy.cwiczenie0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAndArrayList {

    public static void main(String[] args) {
        LinkedList<Double> doubleLinkedList = new LinkedList<>();
        ArrayList<Double> doubleArrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            doubleLinkedList.add((double) i);
            doubleArrayList.add((double) i);
        }

        printLists(doubleLinkedList);
        printLists(doubleArrayList);

        Integer[] ints = {5, 10, 15};                      // przekształcanie tablicy na listę;
        List<Integer> list = Arrays.asList(ints);

        List<Integer> listOfIntegers = List.of(5, 10, 15); // deklaracja listy z jednoczesnym uzupełnieniem;

    }

    private static void printLists(List<Double> list) { // jedna metoda do drukowania różnych rodzajów list;
        for (Double element : list) {
            System.out.println(element);
        }
    }
}
