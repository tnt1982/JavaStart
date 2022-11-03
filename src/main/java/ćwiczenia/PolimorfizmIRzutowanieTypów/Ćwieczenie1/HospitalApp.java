package ćwiczenia.PolimorfizmIRzutowanieTypów.Ćwieczenie1;

public class HospitalApp {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.add(new Doctor("Jan", "Kowalski", 7777.77, 5555.55));
        hospital.add(new Nurse("Anna", "Kowalska", 7777.77, 55));
        hospital.add(new Nurse("Hanna", "Ocean", 7777.11, 77));

        System.out.println("Wszyscy pracownicy szpitala:");
        System.out.println(hospital.getInfo());

    }
}
