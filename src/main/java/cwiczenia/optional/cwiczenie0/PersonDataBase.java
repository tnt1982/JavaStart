package cwiczenia.optional.cwiczenie0;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDataBase {

    private final List<Person> people = new ArrayList<>();

    void add(Person person) {
        if (person == null) {
            throw new NullPointerException("Cannot add null reference");
        }
        findById(person.getId()).ifPresent(p -> {
            throw new IllegalArgumentException("Object with such id already exist");
        });
        people.add(person);
    }

    Optional<Person> findById(int id) {
        for (Person person : people) {
            if (person.getId() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    String findLastNameById(int id) {
        return findById(id)
                .map(Person::getLastName)
                .orElse("Anonim");
    }
}