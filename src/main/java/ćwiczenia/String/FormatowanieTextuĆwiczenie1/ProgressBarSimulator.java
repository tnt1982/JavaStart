package ćwiczenia.String.FormatowanieTextuĆwiczenie1;

public class ProgressBarSimulator {

    public static void main(String[] args) throws InterruptedException {

        double startPoint = 0.00;

        char c = '/';

        for (double i = 0; i <= 200; i++) {

            System.out.printf("Wczytywanie %c %5.2f%% %s%-10s%s \r", c, startPoint, "(", " ", ")");
            Thread.sleep(200);
            startPoint = startPoint + 0.5;
            if (startPoint % 2 == 0) {
                c = '\\';
            } else {
                c = '/';
            }
        }
    }
}
