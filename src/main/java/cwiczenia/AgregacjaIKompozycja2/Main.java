package cwiczenia.AgregacjaIKompozycja2;

public class Main {

    public static void main(String[] args) {
        Auction auction1 = new Auction();
        auction1.title = "Xbox One";
        auction1.description = "Konsola dla wymagających graczy";
        auction1.price = 7777;

        auction1.seller = new Seller();
        auction1.seller.firstName = "Jan";
        auction1.seller.lastName = "Kowalski";

        auction1.seller.address = new Address();
        auction1.seller.address.city = "Wrocław";
        auction1.seller.address.postalCode = "50-500";
        auction1.seller.address.street = "Kościuszki";
        auction1.seller.address.homeNo = "24A";
        auction1.seller.address.flatNo = "21";

        Auction auction2 = new Auction();
        auction2.title = "Samsung S20";
        auction2.description = "Niesamowity telefon z trzema obiektywami";
        auction2.price = 2222.77;

        auction2.seller = new Seller();
        auction2.seller.firstName = "Justyna";
        auction2.seller.lastName = "Adamczyk";

        System.out.println("Szczegóły aukcji numer 1:");
        System.out.println("tytuł: " + auction1.title + ", opis: " + auction1.description + ", cena: " + auction1.price);
        System.out.println("sprzedawca: " + auction1.seller.firstName + " " + auction1.seller.lastName);
        System.out.println("");
        System.out.println("Szczegóły aukcji numer 2:");
        System.out.println("tytuł: " + auction2.title + ", opis: " + auction2.description + ", cena: " + auction2.price);
        System.out.println("sprzedawca: " + auction2.seller.firstName + " " + auction2.seller.lastName);
    }
}
