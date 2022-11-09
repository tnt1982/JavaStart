package ćwiczenia.Wyjątki.ĆwiczenieZCar;

public class Car {

    private static final double FUEL_CONSUMPTION = 7;
    private static final double MAX_FUEL_CAPACITY = 48;
    private double fuel;

    public void refuel(double additionalFuel) {
        if (fuel + additionalFuel > MAX_FUEL_CAPACITY) {
            throw new IllegalArgumentException("Nie możesz zatankować tyle paliwa. Zmieści się jeszcze maksymalnie " +
                    (MAX_FUEL_CAPACITY - fuel));
        } else {
            fuel = fuel + additionalFuel;
        }
    }

    public void drive() {
        if (fuel - FUEL_CONSUMPTION < 0) {
            throw new IllegalStateException("Masz za mało paliwa na podróź. Zatankuj.");
        } else {
            fuel = fuel - FUEL_CONSUMPTION;
        }
    }

    @Override
    public String toString() {
        return "Stan paliwa " + fuel;
    }
}
