package cwiczenia.Algorytmika.Ćwiczenie1;

import java.util.Scanner;

class CheckSum {
    public static void main(String[] args) {

        int sum = 0;
        int next = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ");

        while((next = scanner.nextInt()) <= 100) {
            System.out.println("Podaj liczbę: ");
            sum += next;
        }

        int mod = sum % 2;
        if(mod == 0) {
            System.out.println(sum + " parzysta");
        } else {
            System.out.println(sum + " nieparzysta");
        }
    }
}
