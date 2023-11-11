package cwiczenia.Enum.Ćwieczenie1;

import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pizze możliwe do zamówienia:");

        Pizza[] pizzas = Pizza.values();

        for (int i = 0; i < pizzas.length; i++) {
            System.out.println(pizzas[i].toString());
            Thread.sleep(500);
        }

        System.out.println("Wybierz swoją pizzę: ");
        Pizza chosenPizza = Pizza.valueOf(scanner.nextLine().toUpperCase());

        System.out.println("Sprawdzam, czy mamy wszystkie składniki. Poczekaj na potwierdzenie.");
        Thread.sleep(3000);
        System.out.println("Potwierdzamy zamówienie. Wybrana pizza: " + chosenPizza.name());

        scanner.close();
    }
}
