package ćwiczenia.OperacjaNaPlikach.Ćwiczenie0;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) throws IOException {

        String fileName = "testFile.txt";
        FileWriter fileWriter = new FileWriter(fileName, true); // jeśli w pliku chcemy dopisywać,
        // a nie napisywać to należy dodać new FileWriter(fileName, true)
        // 'true' zapewni dopisywanie, a nie nadpisywanie;
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Jola");
        bufferedWriter.newLine();
        bufferedWriter.write("Ola");
        bufferedWriter.newLine();
        bufferedWriter.write("Ela");
        bufferedWriter.newLine();
        bufferedWriter.flush(); // metoda .flush wymusza zapisanie nowych danych;

    }
}
