package cwiczenia.referencjeDoMetod.cwiczenie0;

import java.util.List;
import java.util.function.Consumer;

public class ComputerMethod {

    public static void main(String[] args) {
        List<Computer> computers = List.of(
                new Computer("Dell", 3700, 29),
                new Computer("HP", 2500, 49),
                new Computer("Lenovo", 3200, 37),
                new Computer("Asus", 2900, 45)
        );

        consume(computers, ComputerMethod::printComputerWithTemperature);
        consume(computers, Computer::overclock);
        consume(computers, ComputerMethod::printComputerWithTemperature);

        Computer compaq = new Computer("Compaq", 3000, 45);
        compaq.overclock();
        System.out.println(compaq.getCpu() + " " + compaq.getTemperature());
    }

    private static void printComputerWithTemperature(Computer computer) {
        String textToPrint = computer.getName() + " " + computer.getCpu() + " " + computer.getTemperature();
        if (computer.getTemperature() > 40) {
            textToPrint += " hot";
        } else {
            textToPrint += " cold";
        }
        System.out.println(textToPrint);
    }

    private static void consume(List<Computer> computers, Consumer<Computer> consumer) {
        for (Computer computer : computers) {
            consumer.accept(computer);
        }
    }
}