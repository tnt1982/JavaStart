package cwiczenia.PolimorfizmIRzutowanieTypów.Ćwieczenie2;

public class Attacker extends GameCharacter{

    private double attackBonus;

    public Attacker(String name, double attackPower, double defensePower, double energy, double attackBonus) {
        super(name, attackPower, defensePower, energy);
        this.attackBonus = attackBonus;
    }

    public double getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(double attackBonus) {
        this.attackBonus = attackBonus;
    }

    @Override
    public double totalAttack() {
        return getAttackPower() + (getAttackPower() * attackBonus);
    }
}
