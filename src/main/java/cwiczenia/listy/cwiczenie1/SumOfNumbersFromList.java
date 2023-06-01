package cwiczenia.listy.cwiczenie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfNumbersFromList {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> listOfIntegers = new ArrayList<>();
        String givenData = "";

        do {
            System.out.println("podaj liczbę całkowitą, lub wpisz 'exit' jeśli chcesz zakończyć program: ");
            givenData = scanner.nextLine();
            if (!givenData.equalsIgnoreCase("exit")) {
                listOfIntegers.add(Integer.valueOf(givenData));
            }
        } while (!givenData.equalsIgnoreCase("exit"));

        System.out.println("Lista wprowadzony liczb: " + listOfIntegers);
        System.out.println("Rozmiar listy: " + listOfIntegers.size());

//        for (int i = 0; i < listOfIntegers.size(); i++) {
//            System.out.print(listOfIntegers.get(i));
//            if (i < listOfIntegers.size()) {
//                System.out.print(" + ");
//            }
//        }
//        int sum = 0;
//        for (Integer element : listOfIntegers) {
//            sum = sum + element;
//        }
//        System.out.print(" = " + sum);

        if (!listOfIntegers.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            int sum = 0;
            for (Integer d : listOfIntegers) {
                stringBuilder.append(d);
                stringBuilder.append(" + ");
                sum = sum + d;
            }
            stringBuilder.replace(stringBuilder.length()-2, stringBuilder.length()-1, "=");
            stringBuilder.append(sum);
            System.out.print(stringBuilder);
        }
    }
}
