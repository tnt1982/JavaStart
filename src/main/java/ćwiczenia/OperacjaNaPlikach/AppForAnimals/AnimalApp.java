package ćwiczenia.OperacjaNaPlikach.AppForAnimals;

import java.io.*;
import java.util.Scanner;

public class AnimalApp {

    private static final String FILE_NAME = "C:\\Users\\Tomasz\\OneDrive\\Pulpit\\animal_details.txt";
    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("Wprawadzenie danych nowego zwierzątka " + READ_FROM_USER);
        System.out.println("Wczytanie i wyświetlenie danych z pliku " + READ_FROM_FILE);

        int option = scanner.nextInt();
        scanner.nextLine();
        if (option == READ_FROM_USER) {
            AnimalsMagazine animalsMagazine = createAnimalMagazin();
            writeFile(animalsMagazine);
        } else if (option == READ_FROM_FILE) {
            AnimalsMagazine animalsMagazine = readFile();
            System.out.println(animalsMagazine);
        } else {
            throw new IllegalArgumentException("niepoprawna wartość");
        }
    }

    private static AnimalsMagazine createAnimalMagazin() {
        AnimalsMagazine animalsMagazine = new AnimalsMagazine();
        for (int i = 0; i < AnimalsMagazine.maxNumberOfAnimals; i++) {
            System.out.println("Wprawadź gatunek: ");
            String gatunek = scanner.nextLine();
            System.out.println("Wprowadź imię: ");
            String imię = scanner.nextLine();
            System.out.println("Wprowadź wiek: ");
            int wiek = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Wprowadź kolor: ");
            String kolor = scanner.nextLine();
            Animal animal = new Animal(gatunek, imię, wiek, kolor);
            animalsMagazine.addNewAnimal(animal);
        }
        return animalsMagazine;
    }

    private static void writeFile(AnimalsMagazine animalsMagazine) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(animalsMagazine);
            System.out.println("Dane o zwierzątkach zostały zapisane do pliku.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static AnimalsMagazine readFile() throws IOException, ClassNotFoundException {
        try (
                FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            return (AnimalsMagazine) objectInputStream.readObject();
        }
    }
}



