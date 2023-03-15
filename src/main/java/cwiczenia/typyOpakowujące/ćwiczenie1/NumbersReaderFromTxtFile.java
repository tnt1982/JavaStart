package cwiczenia.typyOpakowujące.ćwiczenie1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NumbersReaderFromTxtFile {
    public static void main(String[] args) throws IOException {

        int numberOfStarts = 7;
        String newFileToTest = "C:\\Users\\Tomasz\\OneDrive\\Pulpit\\new_file_to_test.txt";

        for (int i = 1; i <= numberOfStarts; i++) {
            try (
                    var fileWriter = new FileWriter(newFileToTest, true);
                    var bufferedWriter = new BufferedWriter(fileWriter);
            ) {
                bufferedWriter.write("Druk numer: " + i);
                bufferedWriter.newLine();
                bufferedWriter.write("kot");
                bufferedWriter.newLine();
                bufferedWriter.write("piesek");
                bufferedWriter.newLine();
                bufferedWriter.write("chomik");
                bufferedWriter.newLine();
                bufferedWriter.write("drugi piesek");
                bufferedWriter.newLine();
                bufferedWriter.write("patyczak");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                bufferedWriter.flush();               // metoda .flush() wypycha dane do zapisania, zostaną również zapisane po zamknięciu FileWritera;
            }
        }

//        String fileName = "C:\\Users\\Tomasz\\OneDrive\\Pulpit\\file_to_test.txt";
//        File file = new File(fileName);
//
//        try (
//                var fileReader = new FileReader(file);
//                var bufferedReader = new BufferedReader(fileReader);
//        ) {
//
//            String nextLine = null;
//            int lines1 = 0;
//
//            while ((nextLine = bufferedReader.readLine()) != null) {
//                System.out.println(nextLine);
//                lines1++;
//            }
//            System.out.println("Liczba linii wynosi: " + lines1);
//        }


//        Scanner scanner = new Scanner(file);
//
//        if (file.exists()) {
//            System.out.println("Plik istnieje!\n");
//        } else {
//            System.out.println("Plik nie istnieje!\n");
//            file.createNewFile();
//        }
//
//        int lines = 0;
//        while (scanner.hasNextLine()) {
//            String name = scanner.nextLine();
//            System.out.println(name);
//            lines++;
//        }
//        System.out.println("Liczna wierszy w pliku: " + lines);
//        scanner.close();
    }
}
