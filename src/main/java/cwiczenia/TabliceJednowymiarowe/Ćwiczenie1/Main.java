package cwiczenia.TabliceJednowymiarowe.Ćwiczenie1;

import cwiczenia.TabliceJednowymiarowe.Ćwiczenie2.Elevator;
import cwiczenia.TabliceJednowymiarowe.Ćwiczenie2.Person;

public class Main {

    public static void main(String[] args) {

        Elevator elevator = new Elevator();

        elevator.add(new Person(1, 151));
        elevator.add(new Person(2, 151));
        elevator.add(new Person(3, 151));
        elevator.add(new Person(4, 121));
        elevator.start();

        elevator.clear();

        elevator.add(new Person(2, 88));
        elevator.start();
        elevator.add(new Person(3, 99));
        elevator.start();
        elevator.add(new Person(4, 110));
        elevator.start();
        elevator.add(new Person(5, 121));
        elevator.start();

        elevator.clear();

        elevator.add(new Person(1, 13.2));
        elevator.start();
        elevator.add(new Person(2, 99));
        elevator.start();
        elevator.add(new Person(3, 11.0));
        elevator.start();
        elevator.add(new Person(4, 12.1));
        elevator.start();
        elevator.add(new Person(5, 12.1));
    }
}
