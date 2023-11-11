package cwiczenia.comparableicomparator.cwiczenie0;

import java.util.Arrays;

public class ProductCatalog {

    public static void main(String[] args) {

//        Product product1 = new Product("Citizen", "zegarek", 1777.77);
//        Product product2 = new Product("Apple", "iPhone", 999.99);
//
//        System.out.println(product1.compareTo(product2));
//
//        int comparingResult = "abc".compareTo("xyz");
//        System.out.println(comparingResult);

        Product[] products = new Product[7];
        products[0] = new Product("Puma", "buty", 399.00);
        products[1] = new Product("Asus", "tablet", 299.00);
        products[2] = new Product("Wydawnictwo", "książka", 9.99);
        products[3] = new Product("Stolarnia", "biurko", 777.99);
        products[4] = new Product("Ikea", "lampa", 9.99);
        products[5] = new Product("Natura", "roślinka", 7.55);
        products[6] = new Product("Bytom", "sweter", 299.00);

        System.out.println("Nieposortowane: ");
        for (Product p : products) {
            System.out.println(p);
        }

        ProductNameComparator productNameComparator = new ProductNameComparator();

        Arrays.sort(products, productNameComparator);
        System.out.println("Posortowane: ");
        for (Product p : products) {
            System.out.println(p);
        }

    }
}
