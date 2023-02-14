package ćwiczenia.operacjeNaTablicach.ćwiczenie1;

public class PersonDataBaseTest {

    public static void main(String[] args) {
        PersonDatabase personDatabase = new PersonDatabase();

        personDatabase.add(new Person("Jan", "Kowalski", "123456789"));
        personDatabase.add(new Person("Janusz", "Nowak", "987654321"));



    }
}
