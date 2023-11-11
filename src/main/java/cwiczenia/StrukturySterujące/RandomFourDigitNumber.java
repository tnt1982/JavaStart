package cwiczenia.StrukturySterujące;

import java.util.Random;

public class RandomFourDigitNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int counter = 0;

        while (true) {
            int randomNumber = random.nextInt(0, 10_000);
            counter = counter + 1;
            System.out.println(counter + " " + randomNumber);
            if (randomNumber == 9_999) {
                System.out.println("Nareszcie!!!");
                return;
            }
        }
    }
}
