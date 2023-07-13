package cwiczenia.przetwarzaniekolekcji.cwiczenie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LoremIpsum {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Tekst bez przecinków oraz kropek:");
        getScanner()
                .tokens()
                .map(s -> s.replace(",", ""))
                .map(s -> s.replace(".", ""))
                .toList()
                .forEach(s -> System.out.print(s + " "));

        final long numberOfWordsStartsWithLetterS = getScanner()
                .tokens()
                .filter(s -> s.startsWith("s"))
                .count();
        System.out.println("\nLiczba słów rozpoczynająca się znakiem 's': " + numberOfWordsStartsWithLetterS);

        final long numberOfWordWithFifeChars = getScanner()
                .tokens()
                .filter(s -> (Objects.equals(s.length(), 5)))
                .count();
        System.out.println("Liczba słów składających się z 5 znaków: " + numberOfWordWithFifeChars);
    }

    private static Scanner getScanner() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("lorem_ipsum.txt"));
        return scanner;
    }
}