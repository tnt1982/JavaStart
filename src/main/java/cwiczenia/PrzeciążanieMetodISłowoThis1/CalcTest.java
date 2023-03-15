package cwiczenia.PrzeciążanieMetodISłowoThis1;

public class CalcTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(5,7,9);
        calculator.add(1,7);

        calculator.add(9.9, 7.7, 2.2);
        calculator.add(9.9, 7.7);

        calculator.subtract(8.8, 4.4, 2.2);
        calculator.subtract(77, 22, 11);

    }
}
