package cwiczenia.OperacjaNaPlikach.AppForAnimals;

import java.io.Serializable;

public class Animal implements Serializable {

    private String species;
    private String name;
    private int age;
    private String colour;

    public Animal (String species, String name, int age, String colour) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return species + " " + name + " " + age + " " + colour;
     }
}
