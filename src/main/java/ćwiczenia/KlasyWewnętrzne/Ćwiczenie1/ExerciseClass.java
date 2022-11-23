package ćwiczenia.KlasyWewnętrzne.Ćwiczenie1;

public class ExerciseClass {

    public static void main(String[] args) {

        int[] tab = {7777, 4, 7, 1, 55, -99, 925, 789};

        Sortable s = new Sortable() { // klasa anonimowa;
            @Override
            public void sort(int[] numbers) {
                if (tab == null)
                    throw new NullPointerException();
                if (tab.length == 0)
                    throw new IllegalArgumentException();

                int biggerNumber = tab[0];
                for (int i = 0; i < tab.length; i++) {
                    if (biggerNumber < tab[i]) {
                        biggerNumber = tab[i];
                    }
                }
                System.out.println(biggerNumber);
            }
        };
        printArray(tab);
        System.out.println("Najwyższą wartością jest:" );
        s.sort(tab);

    }

    private static void printArray(int[] tab) {
        for (int value : tab) {
            System.out.println(value);
        }
    }

}

