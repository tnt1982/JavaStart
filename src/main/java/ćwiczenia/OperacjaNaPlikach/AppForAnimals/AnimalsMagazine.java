package ćwiczenia.OperacjaNaPlikach.AppForAnimals;

import java.io.Serializable;

public class AnimalsMagazine implements Serializable {

    public static int maxNumberOfAnimals = 7;
    public Animal[] animalsLists = new Animal[maxNumberOfAnimals];

    public int index = 0;

    public void addNewAnimal(Animal animal) {
        animalsLists[index] = animal;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Animal animal : animalsLists) {
            stringBuilder.append(animal.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
