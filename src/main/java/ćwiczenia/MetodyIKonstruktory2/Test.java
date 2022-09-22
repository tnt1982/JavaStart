package ćwiczenia.MetodyIKonstruktory2;

public class Test {
    public static void main(String[] args) {

        House house = new House(500, 500);

        house.stockStatus();

        house.watchTv(3);
        house.stockStatus();

        house.takeShower();
        house.boilWater();
        house.takeBath();
        house.makeDinner();
        house.takeBath();
        house.takeBath();
        house.boilWater();
        house.boilWater();
        house.stockStatus();


    }
}
