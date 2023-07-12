package cwiczenia.stream.cwiczenie0;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadStream {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("testFile.txt"));

//        // 1)
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }

        // 2)
        scanner
                .tokens()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
