package ćwiczenia.WprowadzanieDanych.Ćwiczenie2;

import java.util.Random;

public class CoinTossUtils {
    int head = 1;
    int tail = 2;
    Random random = new Random();
    int toss = random.nextInt(1, 3);

    public void betResult(int chosenOption) {
        if (chosenOption == toss) {
            if (toss == head) {
                System.out.println("Brawo, wypadł orzeł, wygrywasz!");
            } else {
                System.out.println("Brawo, wypadła reszka, wygrywasz!");
            }
        } else {
            System.out.println("Niestety, Twój wybór nie był prawidłowy, przegrywasz.");
        }
    }

    public void printChosenOption(int chosenOption) {
        if (chosenOption == 1) {
            System.out.println("Wybrałeś orła.");
        } else {
            System.out.println("Wybrałeś reszkę.");
        }
    }
}
