package cwiczenia.mapy.cwiczenie2;

import java.io.FileNotFoundException;
import java.util.*;

public class ProductManager {

    public static void main(String[] args) {
        try {
            Map<String, TreeSet<Product>> productsMap = ProductImporter.readFile("products.csv");
            String category = readCategoryFromUser();
            printCategoryStats(productsMap, category);
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku z danymi produktów");
        }
    }

    private static String readCategoryFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę kategorii dla wyświetlenia statystyk:");
        return scanner.nextLine();
    }

    private static void printCategoryStats(Map<String, TreeSet<Product>> productsMap, String category) {
        TreeSet<Product> products = productsMap.get(category);
        if (products == null) {
            System.out.println("Brak produktów z danej kategorii");
        } else {
            printAllProductsFromCategory(products);
            printAveragePriceFromCategory(products);
            printCheapestAndExpensiveProduct(products);
        }
    }

    private static void printCheapestAndExpensiveProduct(TreeSet<Product> products) {
        System.out.println("Najtańszy produkt to: " + products.first());
        System.out.println("Najdroższy produkt to: " + products.last());
    }

    private static void printAveragePriceFromCategory(TreeSet<Product> products) {
        double sumPrice = 0;
        for(Product product : products) {
           sumPrice += product.getPrice();
        }
        int count = products.size();
        double averagePrice = sumPrice/count;
        System.out.printf("Średnia wartość produktów z kategorii wynosi: %.2f\n", averagePrice);
    }

    private static void printAllProductsFromCategory(TreeSet<Product> products) {
        for(Product product : products) {
            System.out.println(product);
        }
    }
}
