package cwiczenia.SpecyfikatoryDostępuIPakiety2.Application;

import cwiczenia.SpecyfikatoryDostępuIPakiety2.Logic.Charger;
import cwiczenia.SpecyfikatoryDostępuIPakiety2.Model.Telephone;

public class PhoneTest {

    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println("Samsung Galaxy przed naładowaniem: ");
        System.out.println(telephone.printAllInformation()
        );

        Telephone telephone1 = new Telephone("iPhone", "SE II", 4578, 80);
        System.out.println("iPhone przed naładowaniem:");
        System.out.println(telephone1.printAllInformation()
        );

        Charger charger = new Charger();
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);

        System.out.println("Samsung Galaxy po naładowaniu: ");
        System.out.println(telephone.printAllInformation());

        charger.charge(telephone1);
        charger.charge(telephone1);
        charger.charge(telephone1);
        charger.charge(telephone1);
        charger.charge(telephone1);

        System.out.println("iPhone po naładowniu:");
        System.out.println(telephone1.printAllInformation()
        );
    }
}
