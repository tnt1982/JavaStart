package cwiczenia.String.FormatowanieTextuĆwiczenie1;

public class ProgressBarSimulator {

    private static final int PROGRESS_MAX_VALUE = 100;
    private static final String PROGRESS_BAR_SYMBOL = "#";

    public static void main(String[] args) throws InterruptedException {

        double startPoint = 0.00;

        for (double i = 0; startPoint <= PROGRESS_MAX_VALUE; i++) {
            String progressBar = getProgressBar(startPoint);
            char c = startPoint % 1 == 0 ?'\\' : '/';
            System.out.printf("Wczytywanie %c %5.2f%% (%-10s)\r", c, startPoint, progressBar);
            startPoint = startPoint + 0.5;
            Thread.sleep(200);
        }

        System.out.printf("%nProgram doszedł do %d%%!", 100);
    }

    private static String getProgressBar(double startPoint) {
        double progressBarStep = PROGRESS_MAX_VALUE / 10;
        int numberOfDots = (int) (startPoint / progressBarStep);
        return  PROGRESS_BAR_SYMBOL.repeat(numberOfDots);
    }
}
