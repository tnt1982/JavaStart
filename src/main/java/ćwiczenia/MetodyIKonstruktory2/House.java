package ćwiczenia.MetodyIKonstruktory2;

public class House {

    double amountOfWater;
    double amountOfOil;

    public House (double water, double oil) {
        amountOfOil = water;
        amountOfWater = oil;
    }

    public void takeShower() {
        amountOfWater = amountOfWater - 48.0;
    }

    public void takeBath() {
        amountOfWater = amountOfWater - 86.0;
    }

    public void makeDinner() {
        amountOfOil = amountOfOil - 0.01;
        amountOfWater = amountOfWater - 4;
    }

    public void boilWater() {
        amountOfOil = amountOfOil - 0.05;
        amountOfWater = amountOfWater - 0.5;
    }

    public void watchTv(int hourOfWatchingTv) {
        amountOfOil =  amountOfOil - (hourOfWatchingTv * 0.06);
    }

    public void stockStatus () {
        System.out.println("Zapas wody wynosi: " + amountOfWater +
                " zapas ropy wynosi: " + amountOfOil);
    }
}
