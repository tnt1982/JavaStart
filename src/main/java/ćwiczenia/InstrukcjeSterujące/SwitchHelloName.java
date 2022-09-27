package ćwiczenia.InstrukcjeSterujące;

import java.util.Scanner;

public class SwitchHelloName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jak masz na imię?");
        String name = scanner.next();

        switch (name) {
            case "Tomasz":
                System.out.println("Witamy serdecznie " + name);
                break;
            case "Rafał":
                System.out.println("Siemka " + name);
                break;
            case "Adam":
                System.out.println("Joł joł " + name);
                break;
            case "Mariusz":
                System.out.println("Cześć " + name);
                break;
            default:
                System.out.println("Dzień dobry " + name);
                break;
        }
    }
}
