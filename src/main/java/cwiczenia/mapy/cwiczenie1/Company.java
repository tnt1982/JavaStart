package cwiczenia.mapy.cwiczenie1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Company {

    Scanner scanner = new Scanner(System.in);
    Map<String, Employee> companyEmployee = new HashMap<>();

    public void addNewEmployee() {
        System.out.println("Podaj imię pracownika: ");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko pracownika: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj dochód: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        companyEmployee.put(firstName + " " + lastName, new Employee(firstName, lastName, salary));
        System.out.println("Dodano nowego pracownika");
    }

    public void findEmployee(Map<String, Employee> companyEmployee) {
        System.out.println("Podaj imię oraz nazwisko pracownika: ");
        String key = scanner.nextLine();
        if (companyEmployee.containsKey(key)) {
            System.out.println(companyEmployee.get(key));
        } else {
            System.out.println("Nie znaleziono pracownika o podanym identyfikatorze");
        }
    }
}
