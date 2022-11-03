package ćwiczenia.PolimorfizmIRzutowanieTypów.Ćwieczenie2;

public class Game {

    public static void main(String[] args) {

        Team team1 = new Team();

        team1.add(new Attacker("Attac", 400, 50, 200.0, 0.1));
        team1.add(new Attacker("Attack", 100, 5, 100.0, 0.5));
        team1.add(new Defense("Defen", 1, 150, 200.0, 0.2));

        System.out.println("Drużyna 1 ma energię: " + team1.sumOfEnergy() + ", siłę ataku: " + team1.sumOfAttackPower() +
                ", siłę obrony: " + team1.sumOfDefensePower());

        Team team2 = new Team();

        team2.add(new Attacker("Attac", 400, 50, 200.0, 0.2));
        team2.add(new Attacker("Defe", 100, 5, 100.0, 0.5));
        team2.add(new Defense("Defen", 1, 150, 200.0, 0.2));

        System.out.println("Drużyna 2 ma energię: " + team2.sumOfEnergy() + ", siłę ataku: " + team2.sumOfAttackPower() +
                ", siłę obrony: " + team2.sumOfDefensePower());

        double finalOfFirstFight = getFinalOfFight(team1, team2, "Wynik pierwszego starcia. Suma energii drużyny 2 wynosi: ");

        double finalOfSecondFight = getFinalOfFight(team2, team1, "Wynik drugiego starcia. Suma energii drużyny 1 wynosi: ");

        if (finalOfFirstFight > finalOfSecondFight) {
            System.out.println("Wygrała drużyna numer 2");
        } else if (finalOfFirstFight == finalOfSecondFight) {
            System.out.println("Remis");;
        } else {
            System.out.println("Wygrała drużyna numer 1");
        }
    }

    private static double getFinalOfFight(Team attack, Team defense, String x) {
        double theResultOfFight = attack.sumOfAttackPower() - defense.sumOfDefensePower();
        double finalOfSecondFight;
        if (theResultOfFight > 0) {
            finalOfSecondFight = defense.sumOfEnergy() - theResultOfFight;
        } else {
            finalOfSecondFight = defense.sumOfEnergy();
        }
        System.out.println(x + finalOfSecondFight);
        return finalOfSecondFight;
    }
}
