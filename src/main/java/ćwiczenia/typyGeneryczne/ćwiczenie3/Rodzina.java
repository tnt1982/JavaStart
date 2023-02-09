package ćwiczenia.typyGeneryczne.ćwiczenie3;

public class Rodzina {

    public static void main(String[] args) {

        Mama<String> mama = new Mama<>("Janina");
        Tata<String> tata = new Tata<>("Jan");

        Dzieci<String, String, String> dzieci = new Dzieci<>("Maryla", "Tomasz", "Agnieszka");

        System.out.println("Rodzina w komplecie: ");
        mama.printMama();
        tata.printTata();
        dzieci.printDzieci();
    }

}
