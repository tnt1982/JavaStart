package cwiczenia.zbiory.cwiczenie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SetOfNames {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -s1.compareTo(s2);
            }
        });
        String fileName = "C:\\Users\\Tomasz\\OneDrive\\Pulpit\\namespl.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                names.add(scanner.nextLine());
            }
            System.out.println("Ilość unikalnych imion w pliku: " + names.size());
            System.out.println("Piersze imię: " + names.first());
            System.out.println("Ostatnie imię: " + names.last());
        } catch (FileNotFoundException e) {
            System.out.print("Nie udało się wczytać pliku");
        }
    }
}