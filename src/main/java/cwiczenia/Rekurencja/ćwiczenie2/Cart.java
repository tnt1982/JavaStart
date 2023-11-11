package cwiczenia.Rekurencja.ćwiczenie2;

public class Cart {

    private static final int MAX_PRODUCTS_NUMBER = 10;
    Product[] products = new Product[MAX_PRODUCTS_NUMBER];
    int productsCount = 0;

    void add(Product product) {
        if (productsCount < MAX_PRODUCTS_NUMBER) {
            products[productsCount] = product;
            productsCount++;
        }
    }

    double totalCost() {
        return sumPrices(0);
    }

    private double sumPrices(int counter) {
        if (productsCount == 0) {
            return 0;
        } else if (counter < (productsCount - 1)) {
            return products[counter].getPriceOfProduct() + sumPrices(++counter);
        } else {
            return products[counter].getPriceOfProduct();
        }
    }
}
