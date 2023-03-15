package cwiczenia.KlasyWewnętrzne.Ćwiczenie1;

public class BobbleClass {

    public static void main(String[] args) {

        int[] tab = {4, 7, 1, 55, -99, 925, 789};

        Sortable s = new Sortable() { // klasa anonimowa;
            @Override
            public void sort(int[] numbers) {

                for (int i = 0; i < numbers.length; i++) {
                    for (int j = 1; j < numbers.length - i; j++) {
                        if (numbers[j - 1] > numbers[j]) {
                            int temp = numbers[j];
                            numbers[j] = numbers[j - 1];
                            numbers[j - 1] = temp;
                        }
                    }

                }
            }
        };
        printSortedArray(tab);
        s.sort(tab);
        printSortedArray(tab);

    }

    private static void printSortedArray(int[] sortedArray) {
        for (int value : sortedArray) {
            System.out.println(value + " ");
        }
        System.out.println();
    }
}
