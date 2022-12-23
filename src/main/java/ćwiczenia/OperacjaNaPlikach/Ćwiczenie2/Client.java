package ćwiczenia.OperacjaNaPlikach.Ćwiczenie2;

public class Client {

    private int number;
    private String firstName;
    private String lastName;
    private String country;
    private double value;

    public Client (int number, String firstName, String lastName, String country, double value) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return number + ", " +
         firstName + ", " +
         lastName + ", " +
         country + ", " +
         value;
    }
}
