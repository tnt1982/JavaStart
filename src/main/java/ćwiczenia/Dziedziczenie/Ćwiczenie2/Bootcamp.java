package ćwiczenia.Dziedziczenie.Ćwiczenie2;

final class Bootcamp extends Course {

    private String teachersNameAndSurname;
    private int amountOfHours;

    public Bootcamp(String id, double price, String name, String shortDescription, String teachersNameAndSurname, int amountOfHours) {
        setId(id);
        setPrice(price);
        setName(name);
        setShortDescription(shortDescription);
        this.teachersNameAndSurname = teachersNameAndSurname;
        this.amountOfHours = amountOfHours;
    }

    public String getTeachersNameAndSurname() {
        return teachersNameAndSurname;
    }

    public void setTeachersNameAndSurname(String teachersNameAndSurname) {
        this.teachersNameAndSurname = teachersNameAndSurname;
    }

    public int getAmountOfHours() {
        return amountOfHours;
    }

    public void setAmountOfHours(int amountOfHours) {
        this.amountOfHours = amountOfHours;
    }

    public void printData() {
        System.out.println("Informacje na temat bootcampu: ");
        System.out.println("Id: " + getId() + ", cena: " + getPrice() + " zł" + ", nazwa: " + getName() +
                ", krótki opis: " + getShortDescription() + ", imię i nazwisko nauczyciela: " + getTeachersNameAndSurname() +
                ", ilość godzin kosultacji: " + getAmountOfHours() + " godzin");
    }
}
