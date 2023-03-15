package cwiczenia.typyGeneryczne.ćwieczenie1;

public class Test {
    public static void main(String[] args) {
        Container<Integer> container = new Container<>();
        container.setPrivateArray(new Integer[]{1,3,5,7,11,13,17,19});

        container.printPrivateArray();

        Integer[] ints = container.getPrivateArray();
        System.out.println(ints[1] + ints[2] + ints[3]);

        printFiveTimes("drukowanie:", 5);
        printFiveTimes("drukowanie:","Diana");
    }

    private static <T> void printFiveTimes(String tekst, T i) {
        System.out.println(tekst.toUpperCase());
        for (int x = 0; x < 3; x++) {
            System.out.println(i);
        }
    }
}
