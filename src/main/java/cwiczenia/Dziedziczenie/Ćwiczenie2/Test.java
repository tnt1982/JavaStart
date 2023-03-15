package cwiczenia.Dziedziczenie.Ćwiczenie2;

public class Test {

    public static void main(String[] args) {

        Online online = new Online("1 o", 99.99, "online", "szkolenie online numer 1 Java",
                47, 120);
        online.printData();

        Stationary stationary = new Stationary("1 s", 3777.99, "stacjonarne", "szkolenie " +
                "stacjonarne numer 1 Java", "Łódź", 52);
        stationary.printData();

        Bootcamp bootcamp = new Bootcamp("1 b", 7777.99, "bootcamp", "bootcamp numer 1 " +
                "Java ", "Jan Szkoleniowy", 120);
        bootcamp.printData();

    }
}
