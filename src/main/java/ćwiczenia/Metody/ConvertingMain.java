package ćwiczenia.Metody;

public class ConvertingMain {

    public static void main(String[] args) {

        ConvertingUnitsOfTime convertingUnitsOfTime = new ConvertingUnitsOfTime();

        int numberOfHours = 14;

        int numberOfMinutes = convertingUnitsOfTime.hToM(numberOfHours);
        int numberOfSeconds = convertingUnitsOfTime.mToS(numberOfMinutes);
        int numberOfMilliseconds = convertingUnitsOfTime.sToMs(numberOfSeconds);

        System.out.println(numberOfHours + " godzin to " + numberOfMilliseconds + " milisekund");

    }
}
