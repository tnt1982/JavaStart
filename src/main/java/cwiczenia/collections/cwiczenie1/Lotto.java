package cwiczenia.collections.cwiczenie1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();

        final List<Integer> allNumbers = generate(numbers);
        System.out.println("Wszystkie liczby:" + allNumbers);
        final List<Integer> myNumbers = myNumbers();
        System.out.println("Moje wybrane liczby: " + myNumbers);
        final List<Integer> drawnNumbers = randomize(numbers);
        System.out.println("Wylosowane liczby: " + drawnNumbers);
        final List<Integer> result = checkResult(drawnNumbers, myNumbers);
        if (result.size() < 1) {
            System.out.println("Przykro mi, nie trafiłeś żadnej liczby");
        } else if (result.size() == 1) {
            System.out.println("Trafiona liczba: " + result);
        } else {
            System.out.println("Trafione liczby: " + result);
        }
    }

    private static List<Integer> generate(final List<Integer> listOfIntegers) {
        for (int i = 1; i < 50; i++) {
            listOfIntegers.add(i);
        }
        return listOfIntegers;
    }

    private static List<Integer> randomize(final List<Integer> listOfIntegers) {
        List<Integer> pickedNumbers = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            Collections.shuffle(listOfIntegers);
            final Integer randomNumber = listOfIntegers.get(0);
            pickedNumbers.add(randomNumber);
        }
        Collections.shuffle(listOfIntegers);
        return pickedNumbers;
    }

    private static List<Integer> myNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myNumbers = new LinkedList<>();
        while (myNumbers.size() < 6) {
            System.out.println("Podaj szczęśliwą liczbę:");
            int myNumber = scanner.nextInt();
            myNumbers.add(myNumber);
        }
        return myNumbers;
    }

    private static List<Integer> checkResult(final List<Integer> pickedNumbers, final List<Integer> myNumbers) {
        List<Integer> result = new LinkedList<>();
        for (Integer number : pickedNumbers) {
            if (myNumbers.contains(number)) {
                result.add(number);
            }
        }
        if (result.size() > 3) {
            System.out.println("Gratulacje, zgłoś się po wygraną!");
        }
        return result;
    }
}
