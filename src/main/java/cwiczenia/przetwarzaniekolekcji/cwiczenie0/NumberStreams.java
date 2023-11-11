package cwiczenia.przetwarzaniekolekcji.cwiczenie0;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class NumberStreams {

    private static final int DIVIDER = 10;

    private static String name = "ToJestMojeImię";

    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);

        final IntStream range = IntStream.range(0, 250);

        final List<Integer> integerList = range.map(NumberStreams::square)
                .boxed()
                .toList();


        // lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers = numStream
                .map(NumberStreams::square)
                .limit(100)
                .toList();

        // zbiór kwadratów liczb
        Set<Integer> biggerThan5 = squareNumbers.stream()
                .filter(NumberStreams::isDividedByDivider)
                .map(NumberStreams::divideByDivider)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("List");
        squareNumbers.forEach(x -> System.out.print(x + " ; "));
        System.out.println("\nSet");
        biggerThan5.forEach(x -> System.out.print(x + " ; "));

        final int sum = name.chars().sum();
        System.out.println(sum);
    }

    private static int square(int x) {
        return x * x;
    }

    private static boolean isDividedByDivider(int x) {
        return x % DIVIDER == 0;
    }

    private static int divideByDivider(int x) {
        return x / DIVIDER;
    }
}