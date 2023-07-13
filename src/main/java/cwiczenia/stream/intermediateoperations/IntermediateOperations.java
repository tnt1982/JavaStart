package cwiczenia.stream.intermediateoperations;

import cwiczenia.stream.cwiczenie0.Course;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SuppressWarnings("ALL")
public class IntermediateOperations {

    public static void main(String[] args) {
        final List<Integer> integerList = IntStream.rangeClosed(0, 10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(integerList);


//        final Stream<Course> courseStream = Stream.of(
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(2L, "R", 449, "Programowanie"),
//                new Course(3L, "Joga", 49, "Styl życia"),
//                new Course(4L, "Taniec towarzyski", 199, "Styl życia"),
//                new Course(5L, "Język francuski", 499, "Styl życia")
//        );
//
//        final Stream<Course> expensiveCourses = courseStream.filter(course -> course.getPrice() > 400);
//        final Stream<Course> cheapCourses = courseStream.filter(course -> course.getPrice() < 400);
//        expensiveCourses.forEach(System.out::println);

        Course[] cheapCourses = {
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(3L, "Joga", 49, "Styl życia"),
                new Course(4L, "Taniec towarzyski", 199, "Styl życia")
        };

        Course[] expensiveCourses = {
                new Course(2L, "R", 449, "Programowanie"),
                new Course(5L, "Język francuski", 499, "Styl życia")
        };

        // 1)
        final Stream<Course[]> allCourses = Stream.of(cheapCourses, expensiveCourses);
        // flatMap - przekształca daną strukturę danych na strumień;
        final Stream<Course> courseStream = allCourses.flatMap(Arrays::stream);

        // 2)
        Stream.of(cheapCourses, expensiveCourses)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);


        final List<Integer> integers = IntStream.iterate(0, n -> n + 1)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(integers);
    }
}