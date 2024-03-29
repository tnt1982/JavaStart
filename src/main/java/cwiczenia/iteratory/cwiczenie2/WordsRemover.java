package cwiczenia.iteratory.cwiczenie2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class WordsRemover {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj wyraz nr " + (i + 1));
            words.add(scanner.nextLine());
        }

        System.out.println("Podaj tekst do odfiltrowania:");
        String filterWord = scanner.nextLine();

        final Iterator<String> wordIterator = words.iterator();
        while (wordIterator.hasNext()) {
            final String animal = wordIterator.next();
            if (animal.contains(filterWord)) {
                wordIterator.remove();
            }
        }
        System.out.println(words);
    }
}