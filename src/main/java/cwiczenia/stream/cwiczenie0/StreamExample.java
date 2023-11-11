package cwiczenia.stream.cwiczenie0;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        final Stream<String> streamOfStrings = Stream.of("a", "b", "c");
        final Stream<Integer> streamOfIntegers = Stream.of(1, 2, 3, 4, 5, 6, 7);

        // 1)
        final IntStream intStream = IntStream.of(4, 5, 6, 7, 8, 9, 10, 11, 22, 23, 34, 35);
        final IntStream evenNumbersStream = intStream
                .filter(i -> i % 2 == 0)
                .filter(i -> !(i == 4));
        final int[] evenNumbersStreamArray = evenNumbersStream.toArray();
        System.out.println(Arrays.toString(evenNumbersStreamArray));

        // 2)
        final IntStream secondIintStream = IntStream.of(4, 5, 6, 7, 8, 9, 10, 11, 22, 23, 34, 35);
        final int[] secondIntStreamArray = secondIintStream
                .filter(i -> i % 2 == 0)
                .filter(i -> !(i == 4))
                .toArray();
        System.out.println(Arrays.toString(secondIntStreamArray));

        final Object[] upperCaseArray = streamOfStrings
                .map(String::toUpperCase)
                .toArray();

        System.out.println(Arrays.toString(upperCaseArray));

        // generowanie strumieni:

        final IntStream iterateBigger = IntStream.iterate(0, x -> x + 1).limit(701);
        final IntStream iterateSmaller = IntStream.rangeClosed(1, 78);

        final int[] biggerArray = iterateBigger.toArray();
        System.out.println(Arrays.toString(biggerArray));

        int[] smallerArray = iterateSmaller.toArray();
        System.out.println(Arrays.toString(smallerArray));

        final double[] toPower = IntStream.iterate(1, x -> x + 1)
                .limit(64)
                .filter(n -> n % 3 == 0)
                .mapToDouble(n -> Math.pow(2, n))
                .toArray();
        System.out.println(Arrays.toString(toPower));
    }
}
