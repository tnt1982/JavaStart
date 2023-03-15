package cwiczenia.TypyAbstrakcyjne.Ćwiczenie2;

class FullTimeEmployee extends Employee {

    private double monthlyWage;

    public FullTimeEmployee(String firstName, String lastName, double monthlyWage) {
        super(firstName, lastName);
        this.monthlyWage = monthlyWage;
    }

    @Override
    public double calculateAnnualSalary() {
        double annualSalary = monthlyWage * 12;
        return annualSalary + (annualSalary * 0.05);
    }

    @Override
    public double calculateMonthlySalary() {
        return monthlyWage;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + ", " + "wypłata miesięczna " + monthlyWage + ", " +
                "wypłata roczna " + calculateAnnualSalary();
    }
}
