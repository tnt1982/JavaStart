package ćwiczenia.EnkapsulacjaIHermetyzacja2;

public class TicketService {

    int ticketId = 0;

    public void automaticTicketService(Client client, Film film) {
        String ticketPersonData = null;
        String ticketMovieTitle = null;
        if (film.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");
        } else if (client.getAge() < film.getAgeRequired()) {
            System.out.println("Nie mogę sprzedać biletu. Film dostępny dla osób powyżej " + film.getAgeRequired() + " lat");
        } else {
            System.out.println("Bardzo proszę, oto Twój bilet. Miłego seansu.");
            ticketId++;
            ticketPersonData = client.getFirstName() + " " + client.getLastName();
            ticketMovieTitle = film.getMovieTitle();
            film.setFreeSeats(film.getFreeSeats() - 1);
        }

        System.out.println("Sprzedane bilety");
        if (ticketId != 0) {
            System.out.println(ticketId + " | " + ticketPersonData + " | " + ticketMovieTitle
                    + " - " + film.getMovieType() + " - " + film.getMovieTime() + "min");
        }

        System.out.println("Liczba pozostałych miejsc: " + film.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (film.getMaxSeats() - film.getFreeSeats()));
    }
}

