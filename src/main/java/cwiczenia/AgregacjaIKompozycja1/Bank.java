package cwiczenia.AgregacjaIKompozycja1;

public class Bank {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.firstName = "Tezeusz";
        person1.lastName = "Mityczny";
        person1.pesel = "12233445566";
        Address address1 = new Address();
        address1.city = "Pierwsze miasto";
        address1.street = "Pierwsza";
        address1.streetNumber = 1;
        address1.flatNumber = 1;
        address1.postcode = "11-111";
        person1.livingAddress = address1;
        person1.registeredAddress = address1;

        Person person2 = new Person();
        person2.firstName = "Krzysztof";
        person2.lastName = "Manowski";
        person2.pesel = "23183602297";
        person2.registeredAddress = new Address();
        person2.registeredAddress.city = "Drugie miasto";
        person2.registeredAddress.street = "Druga";
        person2.registeredAddress.streetNumber = 2;
        person2.registeredAddress.flatNumber = 2;
        person2.registeredAddress.postcode = "22-222";
        person2.livingAddress = address1;

        BankAccount bankAccount = new BankAccount();
        bankAccount.owner = person1;
        bankAccount.balance = 10_777.77;

        Credit credit = new Credit();
        credit.borrower = person1;
        credit.cashBorrowed = 777.88;
        credit.cashReturned = 234.44;
        credit.interestRate = 0.77;
        credit.termMonths = 7;


        System.out.println("Klient pierwszy:");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("mieszka w miejscowości: " + person1.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + bankAccount.balance);
        System.out.println("oraz kredyt na kwotę: " + credit.cashBorrowed + " z czego już zwrócił: " + credit.cashReturned);

        System.out.println("Klient drugi:");
        System.out.println(person2.firstName + " " + person2.lastName + " " + person2.pesel);
        System.out.println("mieszka w miejscowości: " + person2.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + bankAccount.balance);
        System.out.println("oraz kredyt na kwotę: " + credit.cashBorrowed + " z czego już zwrócił: " + credit.cashReturned);
    }
}
