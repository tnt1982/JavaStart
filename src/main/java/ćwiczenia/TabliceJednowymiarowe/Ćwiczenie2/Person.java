package ćwiczenia.TabliceJednowymiarowe.Ćwiczenie2;

public class Person {

    private int personId;
    private double weight;

    public Person(int personId, double weight) {
        this.personId = personId;
        this.weight = weight;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
