package cwiczenia.iteratory.cwiczenie0;

import java.util.*;

public class IteratorExample {

    public static void main(String[] args) {

        // w listach mamy metodę 'get' i możemy przeglądać listy:
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(7);
        listOfIntegers.add(2);
        listOfIntegers.add(8);
        listOfIntegers.add(73);
        listOfIntegers.add(1);
        listOfIntegers.add(29);
        listOfIntegers.add(6);

        System.out.println("lista z pętli for:");
        for (int i = 0; i < listOfIntegers.size(); i++) {
            System.out.print(listOfIntegers.get(i) + " ");
        }

        System.out.println("\nlista bez pętli:");
        System.out.println(listOfIntegers);


        // w zbiorach nie ma metody 'get' i konieczne jest użycie iteratorów
        Set<Integer> setOfIntegers = new LinkedHashSet<>();
        setOfIntegers.add(7);
        setOfIntegers.add(2);
        setOfIntegers.add(8);
        setOfIntegers.add(73);
        setOfIntegers.add(1);
        setOfIntegers.add(29);
        setOfIntegers.add(7); // duplikat
        setOfIntegers.add(6);

        final Iterator<Integer> iterator = setOfIntegers.iterator();

        // metoda hasNext() sprawdza, czy jest coś w secie
        // metoda next() pobiera następny element z Seta;

        System.out.println("\nset bez pętli:");
        System.out.println(setOfIntegers);

        System.out.println("\nset z pętli 'while':");
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }


        List<String> dogs = new ArrayList<>();
        dogs.add("Pimpuś");
        dogs.add("Azorek");
        dogs.add("Azorek");
        dogs.add("Azorek");
        dogs.add("Fifa");

        final Iterator<String> dogIterator = dogs.iterator();

        System.out.println("\nlista psów z pętli z iteratorem: ");
        while (dogIterator.hasNext()) {
            String dog = dogIterator.next();
            System.out.println(dog);
        }

        for (int i = 0; i < dogs.size(); i++) {
            String dog = dogs.get(i);
            if (dog.equals("Azorek")) {
                dogs.remove("Azorek");
                i--;                                // konieczne żeby usunąć wszystkie wybrane elementy z listy;
            }
        }
        System.out.println("\nlista psów po usunięciu Azora: ");
        System.out.println(dogs);


        List<String> favouriteDogs = new ArrayList<>();
        favouriteDogs.add("Pimpuś");
        favouriteDogs.add("Azorek");
        favouriteDogs.add("Azorek");
        favouriteDogs.add("Azorek");
        favouriteDogs.add("Fifa");
        favouriteDogs.add("Fifa");
        favouriteDogs.add("Fifa");

        final Iterator<String> favouriteDogsIterator = favouriteDogs.iterator();
        while (favouriteDogsIterator.hasNext()) {
            final String name = favouriteDogsIterator.next();
            if (name.equals("Fifa")) {
                favouriteDogsIterator.remove();
            }
        }
        System.out.println("\nlista psów bez Fify:");
        System.out.println(favouriteDogs);
    }
}
