package cwiczenia.listy.cwiczenie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfNumbers {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> listOfIntegers = new ArrayList<>();
        int number = 0;
        do {
            System.out.println("Podaj liczbę nieujemną, podzielną przez pięć");
            number = SCANNER.nextInt();
            if ((number > 0) && (number % 5 == 0)) {
                listOfIntegers.add(number);
            }
        } while ((number > 0) && (number % 5 == 0));

        int sum = 0;
        for (Integer n : listOfIntegers) {
            sum += n;
        }

        System.out.println("Ile poprawnych liczb: " + listOfIntegers.size());
        System.out.println("Ich suma wynosi: " + sum);
        System.out.println("Natomiast średnia to: " + (sum/ listOfIntegers.size()));
    }
}
