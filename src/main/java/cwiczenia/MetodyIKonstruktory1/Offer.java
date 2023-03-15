package cwiczenia.MetodyIKonstruktory1;

public class Offer {
    Product product;
    double price;
    boolean special;

    public Offer(Product product, double price, boolean special) {
        this.product = product;
        this.price = price;
        this.special = special;

    }
    public void printDetailsProductAndOffer() {
        System.out.println(product.name + " "
                + product.producer + " "
                + price + " zł, "
                + "oferta specjalna? " + special);
    }
}
