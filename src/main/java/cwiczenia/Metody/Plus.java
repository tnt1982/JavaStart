package cwiczenia.Metody;

import java.util.Random;

public class Plus {

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();

        while (true) {
            int x = 7 * random.nextInt(1,777);
            int y = 6 * random.nextInt(2,77);
            if (plus(x, y) < 5_400) {
                System.out.println(plus(x, y) + " to za mało");
                Thread.sleep(1000);
            } else {
                System.out.println(plus(x, y) + " no dobra, już starczy tego drukowania");
                return;
            }
        }


    }

    public static int plus (int x, int y) {
        return x + y;
    }

}
