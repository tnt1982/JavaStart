package cwiczenia.optional.cwiczenie1;

import java.util.Scanner;

class ContactApp {
    public static void main(String[] args) {
        ContactReader.readFile("contacts.csv")
                .ifPresentOrElse(ContactApp::findByEmail, ContactApp::fileNotFoundMessage);
    }

    private static void findByEmail(ContactManager contactManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        contactManager
                .findByEmail(email)
                .ifPresentOrElse(
                        ContactApp::showInfoByEmail,
                        () -> System.out.println("Brak kontaktu o wskazanym adresie email")
                );
    }

    private static void fileNotFoundMessage() {
        System.out.println("Brak pliku z danymi");
    }

    private static void showInfoByEmail(Contact contact) {
        System.out.println("Kontakt o wskazanym adresie email");
        System.out.println(contact.toString());

    }
}

