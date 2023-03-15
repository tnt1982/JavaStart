package cwiczenia.Pętle.Ćwiczenie3;

import java.util.Scanner;

public class AuthorsSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj aktualną temperaturę: ");
        double currentTemperature = scanner.nextDouble();
        System.out.println("Podaj docelową temperaturę: ");
        double targetTemperature = scanner.nextDouble();

        System.out.println("Aktualna temperatura wynosi: " + currentTemperature);

        while (currentTemperature != targetTemperature) {
            double temperatureDifference = targetTemperature - currentTemperature;
            if (temperatureDifference > 0) {
                currentTemperature = currentTemperature + 0.5;
                System.out.println("Temperatura rośnie, wynosi: " + currentTemperature);
            } else if (temperatureDifference < 0) {
                currentTemperature = currentTemperature - 0.5;
                System.out.println("Temperatura spada, wynosi: " + currentTemperature);
            }
        }
        System.out.println("Osiągnięto docelową temperaturę " + currentTemperature);
    }
}
