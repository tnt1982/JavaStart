package ćwiczenia.OperacjaNaPlikach.Ćwiczenie2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientDataReader {
    static Client[] readFile(String fileName) throws FileNotFoundException {
        final int linesNumber = countLinesWithoutHeader(fileName);
        Client[] clients = new Client[linesNumber];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            for (int i = 0; i < clients.length; i++) {
                String s = scanner.nextLine();
                clients[i] = createClientFromCsv(s);
            }
        }
        return clients;
    }

    private static Client createClientFromCsv(String s) {
        String[] data = s.split(",");
        int number = Integer.parseInt(data[0]);
        String firstName = data[1];
        String lastName = data[2];
        String country = data[3];
        double value = Double.parseDouble(data[4]);
        return new Client(number, firstName, lastName, country, value);
    }

    private static int countLinesWithoutHeader(String fileName) throws FileNotFoundException {
        int lines = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lines++;
            }
        }
        return lines;
    }
}
