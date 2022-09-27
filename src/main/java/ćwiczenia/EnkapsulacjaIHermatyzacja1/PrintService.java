package ćwiczenia.EnkapsulacjaIHermatyzacja1;

public class PrintService {

    public void printAllData(Client client, double price) {
        DiscountService discountService = new DiscountService();
        double priceDiscount = discountService.calculateDiscountPrice(client, price);
        if (client.getFirstName() != null && client.getLastName() != null) {
            System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        } else if (client.getFirstName() != null && client.getLastName() == null) {
            System.out.println("Witaj " + client.getFirstName());
        } else if (client.getFirstName() == null && client.getLastName() != null) {
            System.out.println("Dzień dobry panie/pani " + client.getLastName());
        } else {
            System.out.println("Witaj nieznajomy");
        }
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount);
    }
}
