package cwiczenia.zbiory.cwiczenie0;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        HashSet<Integer> setOfIntegers = new HashSet<>();
        setOfIntegers.add(7);
        setOfIntegers.add(5);
        setOfIntegers.add(1);
        setOfIntegers.add(8);
        setOfIntegers.add(7);
        setOfIntegers.add(7);
        setOfIntegers.add(3);

        System.out.println(setOfIntegers);

        HashSet<String> setOfStrings = new HashSet<>();
        setOfStrings.add("Citizen");
        System.out.println("Citizen".hashCode());
        setOfStrings.add("Casio");
        System.out.println("Casio".hashCode());
        setOfStrings.add("Rolex");
        System.out.println("Rolex".hashCode());
        setOfStrings.add("Timex");
        System.out.println("Timex".hashCode());
        setOfStrings.add("Citizen");
        System.out.println("Citizen".hashCode());

        System.out.println(setOfStrings);


        HashSet<Person> personHashSet = new HashSet<>();       // nie pamięta kolejności dodawanych obiektów;
        personHashSet.add(new Person("Jan", "Kowalski"));
        personHashSet.add(new Person("Krzysztof", "Duda"));
        personHashSet.add(new Person("Rafał", "Pies"));
        personHashSet.add(new Person("Jan", "Kowalski"));
        personHashSet.add(new Person("Jan", "Kowalski"));

        System.out.println(personHashSet);
        System.out.println("rozmiar zbioru: " + personHashSet.size());
        System.out.println("czy zbiór zawiera Jan Kowalski? " + personHashSet.contains(new Person("Jan", "Kowalski")));


        LinkedHashSet<Person> personLinkedHashSet = new LinkedHashSet<>();   // pamięta kolejności dodawanych obiektów;
        personLinkedHashSet.add(new Person("Jan", "Kowalski"));
        personLinkedHashSet.add(new Person("Krzysztof", "Duda"));
        personLinkedHashSet.add(new Person("Rafał", "Pies"));
        personLinkedHashSet.add(new Person("Jan", "Kowalski"));
        personLinkedHashSet.add(new Person("Jan", "Kowalski"));

        System.out.println(personLinkedHashSet);
        System.out.println("rozmiar zbioru: " + personLinkedHashSet.size());
        System.out.println("czy zbiór zawiera Jan Kowalski? " + personLinkedHashSet.contains(new Person("Jan", "Kowalski")));
    }
}
