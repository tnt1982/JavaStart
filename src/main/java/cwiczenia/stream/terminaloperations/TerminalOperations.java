package cwiczenia.stream.terminaloperations;

import cwiczenia.stream.cwiczenie0.Course;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("ALL")
public class TerminalOperations {

    public static void main(String[] args) {
        final Stream<Course> courseStream = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "R", 399, "Programowanie")
        );

        final Double sumPrice = courseStream.map(Course::getPrice).reduce(0.0, Double::sum);
        System.out.println("Wszystkie kursy kosztują " + sumPrice);

//        courseStream.forEach(System.out::println);

//
//        final long countElements = courseStream.count();
//        System.out.println(countElements);

//        final Optional<Course> cheapestCourse = courseStream.min(Comparator.comparingDouble(Course::getPrice));
//        cheapestCourse.ifPresent(System.out::println);

//        final boolean isPriceUnder100 = courseStream.anyMatch(c -> c.getPrice() < 100);
//        System.out.println("Czy chociaż jeden z kursów jest tańszy niż 100 zł? " + isPriceUnder100);

//        final boolean isPriceUnder500 = courseStream.allMatch(c -> c.getPrice() < 500);
//        System.out.println("Czy wszystkie kursy są tańsze niż 500 zł? " + isPriceUnder500);

//        final boolean noPriceUnder300 = courseStream.noneMatch(c -> c.getPrice() < 300);
//        System.out.println("Czy żaden z krusów nie jest tańszy niż 300 zł " + noPriceUnder300);

//        final Course[] streamArray = courseStream.toArray(Course[]::new);
//        System.out.println(Arrays.toString(streamArray));

//        final List<Course> courseList = courseStream.collect(Collectors.toList());
//        System.out.println(courseList);

        final Stream<String> namesString = Stream.of("Ania", "Kasia", "Basia");
        final String allNames = namesString.reduce("", (result, next) -> result + next + ", ");
        System.out.println(allNames);

    }
}