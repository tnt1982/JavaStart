package cwiczenia.operacjeNaTablicach.ćwiczenie1;

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

    Person get(int index) {
        if (index >= numberOfPeopleOnTheList || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index has to be positive and lower than " + numberOfPeopleOnTheList);
        }
        return persons[index];
    }

    int size() {
        return numberOfPeopleOnTheList;
    }

    void remove(Person person) {
        if (person == null) {
            throw new NullPointerException("person cannot be null");
        }
        final int notFound = -1;
        int foundIndex = notFound;
        for (int i = 0; i < numberOfPeopleOnTheList && foundIndex == notFound; i++) {
            if (person.equals(persons[i])) {
                foundIndex = i;
            }
        }
        if (foundIndex != notFound) {
            System.arraycopy(persons, foundIndex + 1, persons, foundIndex, persons.length - foundIndex - 1);
            numberOfPeopleOnTheList--;
            persons[numberOfPeopleOnTheList] = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonalDatabase size: " + numberOfPeopleOnTheList);
        sb.append("\n");
        for (int i = 0; i < numberOfPeopleOnTheList; i++) {
            sb.append(" > ");
            sb.append(persons[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
