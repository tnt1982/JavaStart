package cwiczenia.PrzeciążanieMetodISłowoThis2;

public class DiceTest {
    public static void main(String[] args) {

        while (true) {

            Dice dice = new Dice(5);
            dice.printActualResult();

            int secondResult = dice.roll();
            dice.printActualResult();

            int thirdResult = dice.roll();
            dice.printActualResult();

            int fourthResult = dice.roll();
            dice.printActualResult();

            if (secondResult == 4 && secondResult == thirdResult && secondResult ==  fourthResult) {
                System.out.println("Ale szczęście!!!");
                return;
            }
        }
    }
}
