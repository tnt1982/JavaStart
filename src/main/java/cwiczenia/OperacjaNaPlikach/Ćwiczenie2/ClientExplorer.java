package cwiczenia.OperacjaNaPlikach.Ćwiczenie2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientExplorer {
    public static void main(String[] args) {
        final String fileName = "C:\\Users\\Tomasz\\OneDrive\\Pulpit\\clients.csv";
        try {
            Client[] clients = ClientDataReader.readFile(fileName);
            printMostValuableClient(clients);
            String country = readCountryFromUser();
            printClientsFromChosenCountry(clients, country);
            printAverageValueFromChosenCountry(clients, country);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku o nazwie " + fileName);
        }
    }

    private static void printAverageValueFromChosenCountry(Client[] clients, String country) {
        double totalValue = 0;
        int clientsFromCountryCounter = 0;
        for (Client client : clients) {
            if (country.equals(client.getCountry())) {
                totalValue += client.getValue();
                clientsFromCountryCounter++;
            }
        }
        if (totalValue > 0) {
            double averageValue = totalValue / clientsFromCountryCounter;
            System.out.printf("\nŚrednia wartość klienta z kraju %s wynosi %.2f", country, averageValue);
        }
    }

    private static String readCountryFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę kraju, z którego klienci Cię interesują");
        return scanner.nextLine();
    }

    private static void printMostValuableClient(Client[] clients) {
        Client mostValuableClient = clients[0];
        for (Client client : clients) {
            if (client.getValue() > mostValuableClient.getValue()) {
                mostValuableClient = client;
            }
        }
        System.out.println("\nNajbardziej wartościowy klient to: " + mostValuableClient);
    }
    private static void printClientsFromChosenCountry(Client[] clients, String country) {
        System.out.println("Klienci z kraju: " + country + ":");
        int numberOfClients = 0;
        boolean atLeastOneClient = false;  // flaga pomocnicza, sprawdzamy, czy mamy chociaż jednego klienta z tego kraju;
        for (Client client : clients) {
            if (country.equals(client.getCountry())) {
                System.out.println(client);
                numberOfClients++;
                atLeastOneClient = true;
            }
        }
        if (!atLeastOneClient) {
            System.out.println("Brak klientów z kraju: " + country);
        }
        System.out.println("\nLiczba klientów z wybranego kraju: " + numberOfClients);
    }
}
