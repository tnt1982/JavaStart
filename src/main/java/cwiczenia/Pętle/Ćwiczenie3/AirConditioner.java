package cwiczenia.Pętle.Ćwiczenie3;

public class AirConditioner {

    public void airConditioning(int currentTemperature, int targetTemperature) {
        System.out.println("Aktualna temperatura wynosi: " + currentTemperature);
        if (currentTemperature < targetTemperature) {
            while (currentTemperature < targetTemperature) {
                currentTemperature += 1;
                if (currentTemperature == targetTemperature) {
                    System.out.println("Osiągnięto docelową temperaturę: " + currentTemperature);
                } else {
                    System.out.println("Temperatura wzrasta, aktualnie wynosi: " + currentTemperature);
                }
            }
        } else {
            while (currentTemperature > targetTemperature) {
                currentTemperature -= 1;
                if (currentTemperature == targetTemperature) {
                    System.out.println("Osiągnięto docelową temperaturę: " + currentTemperature);
                } else {
                    System.out.println("Temperatura spada, aktualnie wynosi: " + currentTemperature);
                }
            }
        }
    }
}

