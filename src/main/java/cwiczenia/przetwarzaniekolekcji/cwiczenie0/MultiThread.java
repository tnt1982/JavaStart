package cwiczenia.przetwarzaniekolekcji.cwiczenie0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MultiThread {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ints = ints.stream()
           //     .parallel()
                .map(MultiThread::incrementValue)
                .collect(Collectors.toList());
    }

    public static int incrementValue(int x) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Przetwarzam " + x);
        return x++;
    }
}