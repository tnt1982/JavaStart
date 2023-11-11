package cwiczenia.typyGeneryczne.ćwiczenie2;

public class Test {

    public static void main(String[] args) {

        Pair<String, Integer> firstPair = new Pair<>("Pimpuś", 3);
        firstPair.printPair();

        Pair<String, Integer> secondPair = new Pair<>("Azorek", 4);
        secondPair.printPair();

        Pair<Double, Double> thirdPair = new Pair<>(7.5, 7.1);
        thirdPair.printPair();

        double v = thirdPair.getV();
        double t = thirdPair.getV();
        System.out.println(v + t);

        System.out.println("Drukowanie z metody generycznej: ");
        printPairs(firstPair);
        printPairs(secondPair);
        printPairs(thirdPair);

        System.out.println("czy są równe: " + isEquals(thirdPair));

    }

    private static <T, V> void printPairs(Pair<T, V> pairToPrint) {
        System.out.println(pairToPrint.getT() + " " + pairToPrint.getV());
    }

    private static <T, V> boolean isEquals (Pair<T, V> pairToAdd) {
        return pairToAdd.getT().equals(pairToAdd.getV());
    }



}
