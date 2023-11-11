package cwiczenia.Pętle.Ćwiczenie3;

import java.util.Scanner;

public class TemperatureChanging {
    public static void main(String[] args) {

        AirConditioner airConditioner = new AirConditioner();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj aktualną temperaturę: ");
        int currentTemperature = scanner.nextInt();

        System.out.println("Podaj docelową temperaturę: ");
        int targetTemperature = scanner.nextInt();

        airConditioner.airConditioning(currentTemperature, targetTemperature);

    }
}