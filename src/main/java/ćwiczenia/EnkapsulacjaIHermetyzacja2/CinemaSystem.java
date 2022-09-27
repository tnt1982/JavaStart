package ćwiczenia.EnkapsulacjaIHermetyzacja2;

public class CinemaSystem {
    public static void main(String[] args) {

        TicketService ticketService = new TicketService();

        Client client1 = new Client("Jan", "Kowalski", 15);
        Client client2 = new Client("Anna", "Nowacka", 22);
        Client client3 = new Client("Julia", "Azorkowa", 12);

        Film film1 = new Film("Omen", "horror", 128, 16, 72, 72);
        Film film2 = new Film("Orlen", "sensacja", 122, 7, 72, 72);


        System.out.println("Zakup numer 1:");
        ticketService.automaticTicketService(client1, film1);
        System.out.println(" ");
        System.out.println("Zakup numer 2:");
        ticketService.automaticTicketService(client2, film1);
        System.out.println(" ");
        System.out.println("Zakup numer 3:");
        ticketService.automaticTicketService(client1, film2);
        System.out.println(" ");
        System.out.println("Zakup numer 4:");
        ticketService.automaticTicketService(client3, film2);

    }
}
