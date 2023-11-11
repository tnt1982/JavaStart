package cwiczenia.Algorytmika.Ćwiczenie2;

import java.util.Scanner;

public class Mnozenie {

    public static void main(String[] args) {

        int index = 0;
        int multi = 1;
        int next = 0;

        Scanner scanner = new Scanner(System.in);

        while (index < 5) {
            System.out.println("Podaj swoją liczbę: ");
            next = scanner.nextInt();
            multi = multi * next;
            index++;
        }

        System.out.println(multi);

        if (multi >= 0) {
            System.out.println("wpisałeś już 5 liczb, ostatnia liczba jest nieujemna");
        } else {
            System.out.println("wpisałeś już 5 liczb, ostatnia liczba ujemna");
        }
    }
}
