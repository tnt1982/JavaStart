package cwiczenia.PolimorfizmIRzutowanieTypów.Ćwieczenie2;

public class Defense extends GameCharacter{

    private double defenseBonus;

    public Defense(String name, double attackPower, double defensePower, double energy, double defenseBonus) {
        super(name, attackPower, defensePower, energy);
        this.defenseBonus = defenseBonus;
    }

    public double getDefenseBonus() {
        return defenseBonus;
    }

    public void setDefenseBonus(double defenseBonus) {
        this.defenseBonus = defenseBonus;
    }

    @Override
    public double totalDefense() {
        return getDefensePower() + (getDefensePower() * defenseBonus);
    }

}
