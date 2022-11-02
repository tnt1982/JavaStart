package ćwiczenia.Dziedziczenie.Ćwiczenie2;

final class Stationary extends Course {

    private String localization;
    private int amountOfLessons;

    public Stationary(String id, double price, String name, String shortDescription, String localization, int amountOfLessons) {
        setId(id);
        setPrice(price);
        setName(name);
        setShortDescription(shortDescription);
        this.localization = localization;
        this.amountOfLessons = amountOfLessons;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public int getAmountOfLessons() {
        return amountOfLessons;
    }

    public void setAmountOfLessons(int amountOfLessons) {
        this.amountOfLessons = amountOfLessons;
    }

    public void printData() {
        System.out.println("Informacje na temat szkolenia stacjonarnego: ");
        System.out.println("Id: " + getId() + ", cena " + getPrice() + " zł" + ", nazwa: " + getName() +
                ", krótki opis: " + getShortDescription() + ", lokalizacja kursu: " + getLocalization() +
                ", ilość lekcji: " + getAmountOfLessons() + " godzin");
    }
}
