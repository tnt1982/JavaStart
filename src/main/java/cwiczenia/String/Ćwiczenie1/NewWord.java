package cwiczenia.String.Ćwiczenie1;

import java.util.Scanner;

public class NewWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile wyrazów chcesz wprowadzić?");
        int number = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Podaj słowo: ");
            words[i] = scanner.nextLine();
        }

        System.out.println("Lista zapisanych słów:");
        for (String s : words) {
            System.out.println(s);
        }

        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < number; i++) {
            strB.append(words[i].charAt(words[i].length()-1));
        }

        System.out.println("Nowe słowo: " + strB);

        scanner.close();
    }
}
