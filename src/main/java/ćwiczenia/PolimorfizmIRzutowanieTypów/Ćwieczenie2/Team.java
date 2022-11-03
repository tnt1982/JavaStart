package ćwiczenia.PolimorfizmIRzutowanieTypów.Ćwieczenie2;

public class Team {

    private static final int MAX_TEAM_CAPACITY = 3;

    private GameCharacter[] teamMember = new GameCharacter[MAX_TEAM_CAPACITY];

    private int teamMemberNumber = 0;

    public void add(GameCharacter character) {
        if (teamMemberNumber < MAX_TEAM_CAPACITY) {
            teamMember[teamMemberNumber] = character;
            teamMemberNumber++;
        }
    }

    public double sumOfEnergy() {
        double sum = 0;
        for(int i = 0; i < teamMemberNumber; i++) {
            sum = sum + teamMember[i].getEnergy();
        }
        return sum;
    }

    public double sumOfAttackPower() {
        double sum = 0;
        for (int i = 0; i < teamMemberNumber; i++) {
            sum = sum + teamMember[i].totalAttack();
        }
        return sum;
    }

    public double sumOfDefensePower() {
        double sum = 0;
        for (int i = 0; i < teamMemberNumber; i++) {
            sum = sum + teamMember[i].totalDefense();
        }
        return sum;
    }
}
