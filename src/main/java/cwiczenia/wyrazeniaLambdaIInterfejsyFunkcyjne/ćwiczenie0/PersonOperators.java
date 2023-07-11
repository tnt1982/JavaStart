package cwiczenia.wyrazeniaLambdaIInterfejsyFunkcyjne.ćwiczenie0;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonOperators {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski", 32));
        people.add(new Person("Andrzej", "Nowak", 42));
        people.add(new Person("Janusz", "Miły", 37));
        people.add(new Person("Krzysztof", "Owczarek", 22));
        people.add(new Person("Rafał", "Bogusławski", 18));
        people.add(new Person("Marek", "Miodowicz", 14));
        people.add(new Person("Arkadiusz", "Owalny", 43));
        people.add(new Person("Robert", "Leniwy", 52));
        people.add(new Person("Jan", "Umowny", 22));

        System.out.println(">>>> People");
        printListOfPeople(people);
        System.out.println(">>>> People");
        consumerList(people, p -> System.out.println(p));
        System.out.println(">>>> People with age + 1");
        consumerList(people, p -> p.setAge(p.getAge()+1));
        consumerList(people, p -> System.out.println(p));

        System.out.println(">>>> Adults");
        List<Person> adults = filterAdults(people);
        consumerList(adults, p -> System.out.println(p));

        System.out.println(">>>> Jan");
        List<Person> janList = filterByPredicate(people, p -> p.getFirstName().equals("Jan"));
        consumerList(janList, p -> System.out.println(p));

        System.out.println(">>>> FirstNames");
        List<String> firstNames = convertList(people, p -> p.getFirstName());
        consumerList(firstNames, p -> System.out.println(p));
    }

    private static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List <T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    private static <T, R> List<R> convertList(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            R result = function.apply(t);
            resultList.add(result);
        }
        return resultList;
    }

    private static List<Person> filterName(List<Person> people) {
        List<Person> jan = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equals("Jan")) {
                jan.add(person);
            }
        }
        return jan;
    }

    private static List<Person> filterAdults(List<Person> people) {
        List<Person> adults = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() > 18) {
                adults.add(person);
            }
        }
        return adults;
    }

    private static void printListOfPeople(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static <T> void consumerList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}