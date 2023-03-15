package cwiczenia;

public class Company {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.firstName = "Jan";
        employee1.lastName = "Kowalski";
        employee1.yearOfBirth = 1980;
        employee1.jobSeniority = 20;

        System.out.println("imię: " + employee1.firstName + ", nazwisko: " + employee1.lastName
                + ", rok urodzenia: " + employee1.yearOfBirth + ", staż pracy: " + employee1.jobSeniority);

        employee2.firstName = "Krzysztof";
        employee2.lastName = "Duda";
        employee2.yearOfBirth = 1985;
        employee2.jobSeniority = 15;

        System.out.println("imię: " + employee2.firstName + ", nazwisko: " + employee2.lastName
                + ", rok urodzenia: " + employee2.yearOfBirth + ", staż pracy: " + employee2.jobSeniority);

        employee3.firstName = "Marian";
        employee3.lastName = "Janowicz";
        employee3.yearOfBirth = 1978;
        employee3.jobSeniority = 27;

        System.out.println("imię: " + employee3.firstName + ", nazwisko: " + employee3.lastName
                + ", rok urodzenia: " + employee3.yearOfBirth + ", staż pracy: " + employee3.jobSeniority);
    }
}
