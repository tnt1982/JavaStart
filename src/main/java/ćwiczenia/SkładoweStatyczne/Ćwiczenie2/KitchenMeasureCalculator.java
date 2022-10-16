package ćwiczenia.SkładoweStatyczne.Ćwiczenie2;

public class KitchenMeasureCalculator {

    private static final int MUG_CAPACITY = 250;
    private static final int TABLESPOON_CAPACITY = 15;
    private static final int TEASPOON_CAPACITY = 5;


    public static double glassToMl(double glass) {
        return glass * MUG_CAPACITY;
    }

    public static double tablespoonToMl(double tablespoon) {
        return tablespoon * TABLESPOON_CAPACITY;
    }

    public static double teaspoonToMl(double teaspoon) {
        return teaspoon * TEASPOON_CAPACITY;
    }
}
