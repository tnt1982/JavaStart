package cwiczenia.optional.cwiczenie0;

import java.util.Optional;

public class PersonTest {
    public static void main(String[] args) {
        PersonDataBase pdb = new PersonDataBase();
        pdb.add(new Person(1, "Jan", "Kowalski"));
        pdb.add(new Person(2, "Inka", "Kowalska"));
        pdb.add(new Person(3, "Robert", "Kowal"));
        pdb.add(new Person(4, "Rafał", "Kowalik"));

        final Optional<Person> optionalPerson = pdb.findById(3);
//        System.out.println(optionalPerson);
//        if (optionalPerson.isPresent()) {
//            System.out.println(pdb.findById(3).get().getLastName());
//        }
        optionalPerson.ifPresent(person -> System.out.println(person.getFirstName()));


        final Optional<Person> optionalPerson1 = pdb.findById(77);
//        if (optionalPerson1.isPresent()) {
//            System.out.println(optionalPerson1.get().getLastName());
//        } else {
//            System.out.println("Brak osoby o podany Id");
//        }

//        optionalPerson1.ifPresent(person -> System.out.println(person));

        optionalPerson1.ifPresentOrElse(
                person -> System.out.println(person),
                () -> System.out.println("Brak osoby o podany Id")
        );

        final String lastNameById1 = pdb.findLastNameById(2);
        System.out.println(lastNameById1);
    }

    private static void printLastName(Person person) {
        System.out.println(person.getLastName());
    }
}