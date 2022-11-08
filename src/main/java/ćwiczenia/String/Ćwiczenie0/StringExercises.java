package ćwiczenia.String.Ćwiczenie0;

public class StringExercises {

    public static void main(String[] args) {

         long start = System.nanoTime();

        String name = "The";
        String surname = "World";
        int age = 77;
        double height = 2.22;

        System.out.println("\nWszystkie dane:");
        System.out.printf("Imię: %s, nazwisko: %s, wiek: %d, wzrost: %.3f %n", name, surname, age, height);

        String s = String.format("Imię: %s, nazwisko: %s, wiek: %d, wzrost: %.2f %n", name, surname, age, height);
        System.out.println(s);

        String format = "Imię: %s, nazwisko: %s, wiek: %d, wzrost: %.1f %n";
        String s1 = format.formatted(name, surname, age, height);
        System.out.println(s1);

        int bigNumber = 2132343454;
        double bigDouble = 123234345.237345456567;
        System.out.printf("%,d%n", bigNumber);
        System.out.printf("%,.2f%n%n", bigDouble);

        String name1 = "Anna";
        String name2 = "Paulina";
        int age1 = 18;
        int age2 = 19;

        System.out.printf("%-20s%s%n", "Imię", "Wiek");
        System.out.printf("%-20s%s%n", name1, age1);
        System.out.printf("%-20s%s%n", name2, age2);

        String manyLevelsText = """
                raz
                dwa trzy
                cztery
                pięć
                """;

        System.out.println(manyLevelsText.indent(4)); // metodą indent() dodajemy na początku wiersza dodatkowe spacje;



        String hello = "Hello ";
        String world = "World";

        StringBuilder stringBuilder = new StringBuilder(hello).append(world);
        String str = new StringBuilder(hello).append(world).toString();

        System.out.println(stringBuilder);
        System.out.println(str);

        long stop = System.nanoTime();

        long różnica = stop - start;

        System.out.println("czas wykonania całego programu w ns: " + różnica);

        String name5 = "Joanna";
        char letter = name5.charAt(name5.length()-1);
        System.out.println(letter);

        String dice = """
                
                 -----
                |     |
                |  0  |
                |     |
                 -----
                """;
        System.out.println(dice);
    }
}
