package cwiczenia.referencjeDoMetod.cwiczenie2;

import java.util.Objects;

class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private Employment employment;

    public Employee(String firstName, String lastName, double salary, Employment employment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.employment = employment;
    }

    public static boolean isFullTime(Employee employee) {
        return Objects.equals(employee.getEmployment(), Employment.FULL_TIME);
    }

    public static String addFirstNameToLastName(Employee employee) {
        return employee.getFirstName() + " " + employee.getLastName();
    }

    public static void setBonus(Employee employee) {
        employee.setSalary(employee.getSalary() * 1.1);
    }

    public static void showLongestEmployee(String emp) {
        System.out.println("Pracownik o najdłuższym imieniu i nazwisku to " + emp);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", employment=" + employment +
                '}';
    }

}
