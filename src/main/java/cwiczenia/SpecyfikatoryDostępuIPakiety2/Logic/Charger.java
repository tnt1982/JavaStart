package cwiczenia.SpecyfikatoryDostępuIPakiety2.Logic;

import cwiczenia.SpecyfikatoryDostępuIPakiety2.Model.Telephone;

public class Charger {

    public void charge(Telephone telephone) {
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
    }
}
