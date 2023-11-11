package cwiczenia.zbiory.cwiczenie2;

import java.util.HashSet;
import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<Product> products = new HashSet<>(); // domyślna implementacja

        int option;

        do {
            System.out.println("Dostępne opcje: ");
            System.out.println(" -> dodaj nowy produkt - wciśnij 1");
            System.out.println(" -> koniec programu - wciśnij 2");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Podaj nazwę produktu: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Podaj cenę produktu: ");
                    double price = scanner.nextDouble();
                    Product product = new Product(name, price);
                    if (products.contains(product)) {
                        System.out.println("Znaleziono produkt o takiej nazwie. Wybierz co zrobić: ");
                        System.out.println(" -> nadpisz produkt - wciśnij 1");
                        System.out.println(" -> zignoruj produkt - wciśnij 2");
                        switch (scanner.nextInt()) {
                            case 1:
                                products.remove(product);
                                products.add(product);
                                System.out.println("Produkt nadpisany w zbiorze");
                                break;
                            case 2:
                                System.out.println("W bazie pozostawiono poprzedni produkt");
                                break;
                            default:
                                System.out.println("Podano nieobsługiwaną wartość");
                        }
                    }
                    products.add(product);
                    System.out.println("Produkt dodany do zbioru");
                    break;
                case 2:
                    System.out.println("Wszystkie produkty: ");
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    System.out.println("Dziękujemy za skorzystanie z programu");
                    return;
                default:
                    System.out.println("Podano nieobsługiwaną wartość");
            }
        } while (option != 2);
    }
}
