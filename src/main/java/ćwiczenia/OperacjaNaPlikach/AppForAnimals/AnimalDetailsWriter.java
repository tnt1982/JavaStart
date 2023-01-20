package ćwiczenia.OperacjaNaPlikach.AppForAnimals;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AnimalDetailsWriter {

    public static void main(String[] args) throws IOException {

        String animalDetails = "C:\\Users\\Tomasz\\OneDrive\\Pulpit\\animal_details.txt";

        Animal animal = new Animal("dog", "Pimpuś", 3, "black, braun");



        try (
        FileOutputStream fileOutputStream = new FileOutputStream(animalDetails);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(animal);
            System.out.println("Zwierzątko dodane do listy.");
        }
    }
}
