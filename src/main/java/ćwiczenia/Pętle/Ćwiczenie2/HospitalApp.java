package ćwiczenia.Pętle.Ćwiczenie2;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {

        final int EXIT = 0;
        final int ADD_PATIENT = 1;
        final int PRINT_PATIENTS = 2;

        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

        int option = -1;

        while (option != EXIT) {
            System.out.println("Wybierz jedną z opcji: " +
                    "\n" + EXIT + " - wyjście z programu " +
                    "\n" + ADD_PATIENT + " - dopisanie pacjenta " +
                    "\n" + PRINT_PATIENTS + " - wyświetlenie listy zapisanych pacjentów"
            );
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case ADD_PATIENT:
                    Patient patient = new Patient();
                    System.out.println("Podaj imię pacjenta: ");
                    patient.setFirstName(scanner.nextLine());
                    System.out.println("Podaj nazwisko pacjenta: ");
                    patient.setLastName(scanner.nextLine());
                    System.out.println("Podaj PESEL pacjenta: ");
                    patient.setPESEL(scanner.nextLine());
                    hospital.addPatient(patient);
                    break;
                case PRINT_PATIENTS:
                    System.out.println("Lista pacjentów:");
                    hospital.printListOfPatients();
                    break;
                case EXIT:
                    System.out.println("Wychodzimy z programu.");
                    break;
                default:
                    System.out.println("Wybrano złą opcję.");
            }
        }
        scanner.close();
    }
}

