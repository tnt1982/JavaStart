package ćwiczenia.MetodyKlasyObject.Ćwiczenie1;

public class DataStore {

    private static final int MAX_STORE_CAPACITY = 100;

    private Computer[] computers = new Computer[MAX_STORE_CAPACITY];

    private int computerNumber = 0;

    public void add(Computer computer) {
        if (computerNumber < MAX_STORE_CAPACITY && computer != null) {
            computers[computerNumber] = computer;
            computerNumber++;
        }
    }

    public String printAvailableComputers() {
        String comp = "";
        for (int i = 0; i < computerNumber; i++) {
            comp = comp + computers[i] + "\n";
        }
        return comp;
    }

    public int checkAvailability(Computer computer) {
        int numberOfAvailableComputers = 0;
        for (Computer comp : computers) {
            if (computer.equals(comp)) {
                numberOfAvailableComputers++;
            }
        }
        return numberOfAvailableComputers;
    }

}
