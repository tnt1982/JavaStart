package ćwiczenia.TypyAbstrakcyjne.Ćwiczenie2;

public class PayOutApplication {

    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        employees[0] = new FullTimeEmployee("Jan", "Pierszy", 7777.00);
        employees[1] = new PartTimeEmployee("Krzysztof", "Drugi", 70, 77);

        printEmployees(employees);
        System.out.println("Suma miesięcznych wynagrodzeń: " + totalMonthlySalaries(employees));
        System.out.println("Suma rocznych wynagrodzeń: " + totalYearlySalaries(employees));
    }

    private static void printEmployees(Employee[] employees) {
        System.out.println("Pracownicy: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double totalMonthlySalaries(Employee[] employees) {
        double totalMonthlySalary = 0;
        for (Employee employee : employees) {
            totalMonthlySalary = totalMonthlySalary + employee.calculateMonthlySalary();
        }
        return totalMonthlySalary;
    }

    private static double totalYearlySalaries(Employee[] employees) {
        double totalYearlySalary = 0;
        for (Employee employee : employees) {
            totalYearlySalary = totalYearlySalary + employee.calculateAnnualSalary();
        }
        return totalYearlySalary;
    }
}
