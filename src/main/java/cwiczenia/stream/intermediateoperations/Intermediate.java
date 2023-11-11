package cwiczenia.stream.intermediateoperations;

import cwiczenia.stream.cwiczenie0.Course;

import java.util.stream.Stream;

public class Intermediate {

    public static void main(String[] args) {

        final Stream<Course> courseStream = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "R", 449, "Programowanie"),
                new Course(3L, "Joga", 49, "Styl życia"),
                new Course(1L, "Java kurs zaawansowany", 549, "Programowanie"),
                new Course(4L, "Taniec towarzyski", 199, "Styl życia"),
                new Course(5L, "Język francuski", 499, "Styl życia"),
                new Course(1L, "Java od podstaw", 149, "Programowanie")
        );

//        final Stream<Course> distinctedCourseStream = courseStream.distinct();
//        System.out.println("Unikalne kursy:");
//        distinctedCourseStream.forEach(System.out::println);

//        final List<String> java = courseStream.map(Course::getName)
//                .filter(name -> name.toLowerCase().contains("java"))
//                .collect(Collectors.toList());
//
//        System.out.println(java);

//        // filtrowanie
//        final Stream<Course> javaCourseStream = courseStream
//                .filter(course -> course.getName().toLowerCase().contains("java"));
//        javaCourseStream.forEach(System.out::println);

//        // sortowanie (jeśli chcemy sortować malejącą należy dodać znak minus: (-Double ...)
//        final Stream<Course> sortedCourses = courseStream.
//                sorted((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()));
//
//        sortedCourses.forEach(System.out::println);

        // metoda skip - pozwala pominąć pierwszych 'n' elementów w strumieniu;
        courseStream
                .sorted((c1, c2) -> -Double.compare(c1.getPrice(), c2.getPrice()))
                .skip(2)
                .forEach(System.out::println);
    }
}
