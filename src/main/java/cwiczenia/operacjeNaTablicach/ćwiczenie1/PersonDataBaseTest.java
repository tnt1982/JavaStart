package cwiczenia.operacjeNaTablicach.ćwiczenie1;

public class PersonDataBaseTest {

    public static void main(String[] args) {

        PersonDatabase personDatabase = new PersonDatabase();

        personDatabase.add(new Person("Jan", "Kowalski", "123456789"));
        personDatabase.add(new Person("Janusz", "Nowak", "987654321"));
        personDatabase.add(new Person("Jerzy", "Wąsik", "654543432"));
        personDatabase.add(new Person("Julian", "Puszczyk", "567123890"));

        Person person = personDatabase.get(1);
        System.out.println(person);
        System.out.println(personDatabase);
        personDatabase.remove(new Person("Janusz", "Nowak", "987654321"));
        System.out.println();
        System.out.println(personDatabase);
        System.out.println(personDatabase.get(2));



    }
}
