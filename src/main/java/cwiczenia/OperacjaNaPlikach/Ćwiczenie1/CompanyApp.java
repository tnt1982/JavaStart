package cwiczenia.OperacjaNaPlikach.Ćwiczenie1;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {

    private static final String FILE_NAME = "employees.info";
    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wprowadzanie danych pracowników - " + READ_FROM_USER);
        System.out.println("Wczytaj i wyświetl dane z pliku - " + READ_FROM_FILE);

        int option = scanner.nextInt();
        scanner.nextLine();
        if (option == READ_FROM_USER) {
            Company company = createCompany();
            writeFile(company);
        } else if (option == READ_FROM_FILE) {
            Company company = null;
            try {
                company = readFile();
                System.out.println(company);
            } catch (IOException | RuntimeException | ClassNotFoundException e) {
                System.err.println("Błąd odczytu danych");
            }
        }
        scanner.close();
    }


    private static Company readFile() throws IOException, ClassNotFoundException {
        try (
                var fileInputStream = new FileInputStream(FILE_NAME);
                var objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            return (Company) objectInputStream.readObject();
        }
    }

    private static void writeFile(Company company) {
        try (
                var fileOutputStream = new FileOutputStream(FILE_NAME);
                var objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(company);
            System.out.println("Plik z danymi pracowników został zapisany");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }
    }

    private static Company createCompany() {
        Company company = new Company();
        for (int i = 0; i < Company.MAX_EMPLOYEE; i++) {
            System.out.println("Wprowadź imię: ");
            String firstName = scanner.nextLine();
            System.out.println("Wprowadż nazwisko: ");
            String lastName = scanner.nextLine();
            System.out.println("Wprowadź zarobki: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            company.add(new Employee(firstName, lastName, salary));
        }
        return company;
    }
}
