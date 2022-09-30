package ćwiczenia.Pętle.Ćwiczenie2;

public class Hospital {

    private final int MAX_PATIENTS_NUMBER = 10;
    Patient[] patients = new Patient[MAX_PATIENTS_NUMBER];
    private int registeredPatients = 0;

    public void addPatient(Patient patient) {
        if (registeredPatients < MAX_PATIENTS_NUMBER) {
            patients[registeredPatients] = patient;
            registeredPatients++;
        } else {
            System.out.println("Zapisano już maksymalną liczbę pacjentów.");
        }
    }

    public void printListOfPatients() {
        for (int i = 0; i < registeredPatients; i++) {
            System.out.println(patients[i].getFirstName() + " " +
                    patients[i].getLastName() + " " +
                    patients[i].getPESEL());
        }
    }
}
