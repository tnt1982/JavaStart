package cwiczenia.wyrazeniaLambdaIInterfejsyFunkcyjne.ćwiczenie0;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functions {
    public static void main(String[] args) throws InterruptedException {

        // interfejs funkcyjny Function

        String original = "    WIELKI NAPIS     ";

        Function<String, String> func = s -> s.toLowerCase().trim();

        final String changed = original.toLowerCase().trim();
        final String changed2 = lowerCaseTrim(changed);
        final String changed3 = func.apply(original);

        // interfejs funkcyjny Consumer

        printTextThreeTimes(changed);
        Consumer<String> printThreeTimes = s -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };
        printThreeTimes.accept(changed);

        // interfejs funkcyjny Predicate

        int personAge = 19;
        boolean check = checkIfAdult(personAge);
        Predicate<Integer> checkIfAdult = age -> age >= 18;

        final boolean test = checkIfAdult.test(personAge);

        System.out.println("Czy jest pełnoletni: " + check);
        System.out.println("Czy jest pełnoletni: " + test);

        // interfejs funkcyjny Supplier

        String[] firstNames = {"Jan", "Antoni", "Roman"};
        String[] lastNames = {"Jankowski", "Bogusławski", "Powiatowy"};
        int[] ages = {27, 31, 48};
        Random random = new Random();
        Supplier<Person> randomPersonGenerator = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };

        Person person = randomPersonGenerator.get();
        System.out.println(person);
        System.out.println("Powołania otrzymują: ");
        for (int i = 0; i < 3; i ++) {
            System.out.println("Osoba numer " + i + " " + randomPersonGenerator.get());
            Thread.sleep(1000);
        }
    }

    static boolean checkIfAdult (int age) {
        return age >= 18;
    }

    private static void printTextThreeTimes(final String changed) {
        System.out.println(changed);
        System.out.println(changed);
        System.out.println(changed);
    }

    static String lowerCaseTrim(String source) {
        return source.toLowerCase().trim();
    }
}
