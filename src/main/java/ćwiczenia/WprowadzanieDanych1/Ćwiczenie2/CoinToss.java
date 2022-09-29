package ćwiczenia.WprowadzanieDanych1.Ćwiczenie2;

import java.util.Scanner;

public class CoinToss {

    public static void main(String[] args) throws InterruptedException {

        CoinTossUtils coinTossUtils = new CoinTossUtils();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz jedną z dwóch opcji: \n1 - orzeł \n2 - reszka");
        int chosenOption = scanner.nextInt();

        coinTossUtils.printChosenOption(chosenOption);

        Thread.sleep(2_000);
        System.out.println("Uwaga, rzucam monetą.");
        Thread.sleep(2_000);
        System.out.println("Moneta się obraca ... i");
        Thread.sleep(2_000);

        coinTossUtils.betResult(chosenOption);

    }
}
