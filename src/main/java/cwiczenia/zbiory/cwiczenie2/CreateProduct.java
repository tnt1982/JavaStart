package cwiczenia.zbiory.cwiczenie2;

import java.util.Scanner;

public class CreateProduct {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Podaj nazwę produktu");
        String name = scanner.nextLine();
        System.out.println("Podaj cenę produktu");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Product product = new Product(name, price);

        System.out.println(product);
    }
}
