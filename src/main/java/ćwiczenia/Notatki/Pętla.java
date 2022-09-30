package ćwiczenia.Notatki;

public class Pętla {
    public static void main(String[] args) throws InterruptedException {

        int[] numbers = new int[10];

        System.out.println("Pętla for:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println("Wartość elementu wynosi: " + numbers[i]);
            Thread.sleep(500);
            if (numbers[i] == 10) {
                System.out.println("Tablica jest pełna!!!");
            }
        }

        System.out.println("Pętla for each:");

        for (int element : numbers) {
            System.out.println("Wartość elementu wynosi: " + element);
        }
    }
}
