package cwiczenia.OperacjaNaPlikach.Ćwiczenie0;

import java.io.*;
import java.util.Scanner;

public class FileCreatorTest {

    public static void main(String[] args) throws IOException {

        String fileName = "testFile.txt";
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // odczytywnie plików za pomocą klasy BufferedReader:
        FileReader fileReader = new FileReader(fileName); // umożliwia odczytywanie bajt po bajcie, dlatego
        // FileReadera opakowujemy w BufferedReadera, BR pozwala odczytywać plik wiersz po wierszu;
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String nextLine = null;
        int linesB = 0;
        while ((nextLine = bufferedReader.readLine()) != null) {
            System.out.println(nextLine);
            linesB++;
        }
        System.out.println("Liczba wierszy w pliku (bufferdReader) " + linesB);


        // odczytywanie plików za pomocą klasy Scanner:
        int linesS = 0;
        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            System.out.println(name);
            linesS++;
        }
        System.out.println("Liczba wierszy w pliku (scanner) " + linesS);
        scanner.close();

        // pytanie, czy plik istnieje:
        boolean fileExists = file.exists();
        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku");
            }
        }
        if (fileExists) {
            System.out.println("\nPlik " + fileName + " istnieje, lub został utworzony");
        }
    }
}

