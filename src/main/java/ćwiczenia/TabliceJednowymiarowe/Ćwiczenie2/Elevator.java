package ćwiczenia.TabliceJednowymiarowe.Ćwiczenie2;

public class Elevator {

    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final double MAX_WEIGHT = 400.0;
    private double sumOfWeight = 0;

    public void add(Person person) {
        if (peopleNumber == 4) {
            System.out.println("W windzie nie ma już miejsca.");
            return;
        }
        people[peopleNumber] = person;
        sumOfWeight = sumOfWeight + people[peopleNumber].getWeight();
        System.out.println("Wsiada osoba numer: " + (peopleNumber + 1));
        peopleNumber++;
    }

    public void start() {
        if (sumOfWeight > MAX_WEIGHT) {
            System.out.println("Winda jest przeciążona o " + (sumOfWeight - MAX_WEIGHT));
        } else {
            System.out.println("Winda wystartowała.");
        }
    }

    public void clear() {
        people[0] = null;
        people[1] = null;
        people[2] = null;
        people[3] = null;
        peopleNumber = 0;
        sumOfWeight = 0;
        System.out.println("Winda jest pusta.");
    }
}
