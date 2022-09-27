package ćwiczenia.StrukturySterujące;

import java.util.Random;

public class RandomFourDigitNumberV2 {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(0, 10_000);

        if (randomNumber < 5_000) {
            System.out.println(randomNumber + " jest mniejsza od 5 000");
        } else if (randomNumber == 5_000) {
            System.out.println(randomNumber + " jest równa 5 000");
        } else {
            System.out.println(randomNumber + " jest większa od 5 000");
        }

        if (randomNumber % 2 == 0) {
            System.out.println(randomNumber + " jest liczbą parzystą");
        } else {
            System.out.println(randomNumber + " jest liczbą nieparzystą");
        }

        System.out.println("Uzupełniona do 4 cyfr: " + printFullNumber(randomNumber));
    }
    public static int printFullNumber (int randomNumber) {
        if (randomNumber == 0) {
            randomNumber = randomNumber;
        } else if (randomNumber / 10 == 0) {
            randomNumber = randomNumber * 1_000;
        } else if (randomNumber / 100 == 0) {
            randomNumber = randomNumber * 100;
        } else if (randomNumber / 1000 == 0) {
            randomNumber = randomNumber * 10;
        } else if (randomNumber / 10_000 == 0) {
            randomNumber = randomNumber;
        }
        return randomNumber;
    }
}
