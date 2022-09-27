package ćwiczenia.EnkapsulacjaIHermatyzacja1;

public class DiscountApp {
    public static void main(String[] args) {

        PrintService printService = new PrintService();

        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 3000;

        Client client3 = new Client(null, "Głośnikowski", true);
        double price3 = 110;

        Client client4 = new Client("Wiesław", null, false);
        double price4 = 2100;

        Client client5 = new Client(null, null, true);
        double price5 = 700;

        System.out.println("Klient numer 1:");
        printService.printAllData(client1, price1);
        System.out.println("Klient numer 2:");
        printService.printAllData(client2, price2);
        System.out.println("Klient numer 3:");
        printService.printAllData(client3, price3);
        System.out.println("Klient numer 4:");
        printService.printAllData(client4, price4);
        System.out.println("Klient numer 5:");
        printService.printAllData(client5, price5);

    }
}
