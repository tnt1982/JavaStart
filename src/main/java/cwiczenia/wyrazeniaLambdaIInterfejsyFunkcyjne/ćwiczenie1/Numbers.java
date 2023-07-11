package cwiczenia.wyrazeniaLambdaIInterfejsyFunkcyjne.ćwiczenie1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Numbers {

    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> listOfIntegers = new ArrayList<>();
        generate(listOfIntegers, 10, () -> random.nextInt(99));

        consumer(listOfIntegers, x -> System.out.print(x + " "));
        System.out.println();

        filterList(listOfIntegers, x -> x % 2 == 0);
        consumer(listOfIntegers, x -> System.out.print(x + " "));
    }

    private static <T> void generate(List<T> list, int limit, Supplier<T> supplier) {
        for (int i = 0; i < limit; i++) {
            list.add(supplier.get());
        }
    }

    private static <T> void consumer(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    private static <T> void filterList(List<T> list, Predicate<T> predicate) {
        final Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.test(next)) {
                iterator.remove();
            }
        }
    }
}