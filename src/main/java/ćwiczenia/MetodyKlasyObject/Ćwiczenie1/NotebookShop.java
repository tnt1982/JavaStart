package ćwiczenia.MetodyKlasyObject.Ćwiczenie1;

public class NotebookShop {

    public static void main(String[] args) {

        DataStore dataStore = new DataStore();

        dataStore.add(new Computer("Toshiba", 123234));
        dataStore.add(new Computer("Asus", 123456));
        dataStore.add(new Computer("HP", 123890));
        dataStore.add(new Computer("Acer", 678234));
        dataStore.add(new Computer("Toshiba", 123234));

        System.out.println("Notebooki dostępne w magazynie: \n" +
                dataStore.printAvailableComputers());

        System.out.println("Ilość wybranych notebooków: " +
                dataStore.checkAvailability(new Computer("Acer", 678234)));
    }
}
