package ćwiczenia.OperacjaNaPlikach.AppForAnimals;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AnimalDetailsReader {

    public static void main(String[] args) throws IOException {

        String animalDetails = "C:\\Users\\Tomasz\\OneDrive\\Pulpit\\animal_details.txt";

        Animal animalToRead = null;

        try (
        FileInputStream fileInputStream = new FileInputStream(animalDetails);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            animalToRead = (Animal) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (animalDetails != null) {
            System.out.println("Wczytano dane o zwierzęciu:");
            System.out.println(
                    "gatunek: " + animalToRead.getSpecies() +
                            ", imię: " + animalToRead.getName() +
                            ", wiek: " + animalToRead.getAge() +
                            ", kolor: " + animalToRead.getColour()
            );
        }

    }
}
