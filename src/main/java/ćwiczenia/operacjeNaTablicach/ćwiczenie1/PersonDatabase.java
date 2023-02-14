package ćwiczenia.operacjeNaTablicach.ćwiczenie1;

import java.util.Arrays;

public class PersonDatabase {

    private static final int INITIAL_ARRAY_SIZE = 1;
    private static int numberOfPeopleOnTheList = 0;
    static Person[] persons = new Person[INITIAL_ARRAY_SIZE];

    public void add(Person person) {
        if (person == null) {
            throw new NullPointerException("person cannot be null");
        }
        if (numberOfPeopleOnTheList == persons.length) {
            persons = Arrays.copyOf(persons, (persons.length * 2));
        }
        persons[numberOfPeopleOnTheList] = person;
        numberOfPeopleOnTheList++;

    }
}
