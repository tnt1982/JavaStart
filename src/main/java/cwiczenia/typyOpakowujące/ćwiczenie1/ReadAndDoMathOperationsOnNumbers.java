package cwiczenia.typyOpakowujące.ćwiczenie1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class ReadAndDoMathOperationsOnNumbers {
    public static void main(String[] args) throws IOException {

        String fileWithNumbers = "C:\\Users\\Tomasz\\OneDrive\\Pulpit\\cwiczenie_jeden.txt";
        File file = new File(fileWithNumbers);

        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            int firstNumber = Integer.parseInt(bufferedReader.readLine());
            int secondNumber = Integer.parseInt(bufferedReader.readLine());
            int thirdNumber = Integer.parseInt(bufferedReader.readLine());
            BigInteger firstBigInteger = new BigInteger(bufferedReader.readLine());
            BigInteger secondBigInteger = new BigInteger(bufferedReader.readLine());

            System.out.println("Suma trzech pierwszych liczb to: "
                    + sumOfNumbers(firstNumber, secondNumber, thirdNumber)
            );
            System.out.println("Suma dwóch ostatnich liczb to: " + firstBigInteger.and(secondBigInteger));
        }

    }

    public static int sumOfNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }
}

