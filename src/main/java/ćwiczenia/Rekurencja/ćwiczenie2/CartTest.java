package ćwiczenia.Rekurencja.ćwiczenie2;

public class CartTest {

    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.add(new Product("sok pomidorowy", 4));
        cart.add(new Product("sok jabłokowy", 7));
        cart.add(new Product("sok wiśniowy", 6));
        cart.add(new Product("sok gruszkowy", 7));

        System.out.println(cart.totalCost());
    }
}
