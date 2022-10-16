package ćwiczenia.SkładoweStatyczne.Ćwiczenie2;

public class KitchenMeasureCalculatorTest {

    public static void main(String[] args) {

        System.out.println("Jedna szklanka ile to ml?");
        System.out.println(KitchenMeasureCalculator.glassToMl(1) + " ml.");

        System.out.println("Dwie łyżki stołowe ile to ml?");
        System.out.println(KitchenMeasureCalculator.tablespoonToMl(2) + " ml.");

        System.out.println("Trzy i pół łyżeczki do herbaty ile to ml?");
        System.out.println(KitchenMeasureCalculator.teaspoonToMl(3.5) + " ml.");
    }
}
