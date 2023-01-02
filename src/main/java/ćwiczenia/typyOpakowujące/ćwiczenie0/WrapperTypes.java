package ćwiczenia.typyOpakowujące.ćwiczenie0;

/*

byte - Byte
short - Short
int - Integer
float - Float
double - Double
char - Character
boolean - Boolean

*/

import java.math.BigDecimal;
import java.math.BigInteger;

public class WrapperTypes {

    public static void main(String[] args) {

        String numberStr = "25";
        int value = Integer.parseInt(numberStr);
        Integer value2 = Integer.valueOf(numberStr);

        System.out.println("Integer.parseInt(numberStr) " + value);
        System.out.println("Integer.valueOf(numberStr) " + value2);

        BigInteger bigInteger = new BigInteger("999999999999999999999999999999999999999999");
        BigInteger bigInteger2 = new BigInteger("777777777777777777777777777777777777777777");

        System.out.println(bigInteger.add(bigInteger2));


        double a = 0.7;
        double b = 0.4;
        System.out.println("różnica double wynosi: " + (a - b));

        BigDecimal bigDecimal1 = BigDecimal.valueOf(0.7);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(0.4);
        System.out.println("różnica bigDecimal wynosi: " + (bigDecimal1.subtract(bigDecimal2)));

        BigDecimal bigDecimal3 = new BigDecimal (0.7);
        BigDecimal bigDecimal4 = new BigDecimal (0.4);
        System.out.println("różnica bigDecimal wynosi " + (bigDecimal3.subtract(bigDecimal4)));
    }
}
