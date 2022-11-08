package ćwiczenia.String.TextBlocksĆwiczenie1;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wciśnij Enter, aby rzucić kostką");
            scanner.nextLine();
            String diceSide = Dice.roll();
            System.out.println(diceSide);
        }
    }
}
