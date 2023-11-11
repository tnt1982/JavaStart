package cwiczenia.mapy.cwiczenie1;

import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {

        final int ADD_EMPLOYEE = 1;
        final int FIND_EMPLOYEE = 2;
        final int EXIT = 3;

        Scanner scanner = new Scanner(System.in);
        Company company = new Company();
        int options;
        do {
            System.out.println("Wybierz opcję: ");
            System.out.println("Dodanie nowego pracownika -> 1");
            System.out.println("Wyszukanie pracownika -> 2");
            System.out.println("Wyjście z programu -> 3");
            options = scanner.nextInt();
            if (options == ADD_EMPLOYEE) {
                company.addNewEmployee();
            } else if (options == FIND_EMPLOYEE) {
                company.findEmployee(company.companyEmployee);
            } else if (options == EXIT) {
                System.out.println("Lista pracowników: ");
                System.out.println(company.companyEmployee);
                System.out.println("Dziękuję za skorzystanie z programu");
            }
        } while (options != EXIT);
    }
}
