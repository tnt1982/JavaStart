package cwiczenia.PolimorfizmIRzutowanieTypów.Ćwieczenie2;

public class GameCharacter {
    private String name;
    private double attackPower;

    private double defensePower;
    private double energy;

    public GameCharacter(String name, double attackPower, double defensePower, double energy) {
        this.name = name;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.energy = energy;
    }

    public double totalAttack() {
        return attackPower;
    }

    public double totalDefense() {
        return defensePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(double defensePower) {
        this.defensePower = defensePower;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }
}
