package cwiczenia.TypyAbstrakcyjne.Ćwiczenie2;

class PartTimeEmployee extends Employee {

    private int numberOfHoursWorkedInMonth;
    private double hourlyRate;

    public PartTimeEmployee(String firstName, String lastName, int numberOfHoursWorked, double hourlyRate) {
        super(firstName, lastName);
        this.numberOfHoursWorkedInMonth = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlySalary() {
        return numberOfHoursWorkedInMonth * hourlyRate;
    }

    @Override
    public double calculateAnnualSalary() {
        return 12 * (numberOfHoursWorkedInMonth * hourlyRate);
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + ", " + "wypłata miesięczna " + calculateMonthlySalary() + ", " +
                "wypłata roczna " + calculateAnnualSalary();
    }
}
