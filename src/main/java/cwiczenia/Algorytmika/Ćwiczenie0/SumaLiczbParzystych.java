package cwiczenia.Algorytmika.Ćwiczenie0;

public class SumaLiczbParzystych {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 19, 20};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.print("Suma liczb parzystych z pętli for wynosi: " + sum);

        System.out.println(" ");

        System.out.println("Iterujemy wszystkie liczby z tablicy:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println(" ");

        for (int element : numbers) {
            if (element % 2 == 0) {
                sum = sum + element;
            }
        }
        System.out.println("Suma liczb parzystych z pętli for-each wynosi: " + (sum - 50));
    }
}
