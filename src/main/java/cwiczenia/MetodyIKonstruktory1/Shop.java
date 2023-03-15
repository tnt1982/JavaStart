package cwiczenia.MetodyIKonstruktory1;

class Shop {
    public static void main(String[] args) {

        Product product1 = new Product("Czekolada mleczna", "Milka");
        Offer offer = new Offer(product1, 3.99, true);

        offer.printDetailsProductAndOffer();
    }
}