package ćwiczenia.PrzeciążanieMetodISłowoThis2;

import java.util.Random;

public class Dice {

    Random random = new Random();

    int theResultOfTheDiceRoll;

    public Dice() {
        roll();
    }

    public Dice(int handMadeResult) {
        this.theResultOfTheDiceRoll = handMadeResult;
    }

    public int roll() {
        theResultOfTheDiceRoll = random.nextInt(1, 7);
        return theResultOfTheDiceRoll;
    }

    public void printActualResult() {
        System.out.println("Liczba oczke na kostce: " + theResultOfTheDiceRoll);
    }
}
