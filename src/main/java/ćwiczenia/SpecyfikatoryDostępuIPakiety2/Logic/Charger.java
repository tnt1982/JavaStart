package ćwiczenia.SpecyfikatoryDostępuIPakiety2.Logic;

import ćwiczenia.SpecyfikatoryDostępuIPakiety2.Model.Telephone;

public class Charger {

    public void charge(Telephone telephone) {
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
    }
}
