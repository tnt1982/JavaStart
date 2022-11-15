package ćwiczenia.TypyAbstrakcyjne.Ćwiczenie1;

import java.util.Scanner;

public class ShapeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jaką figurę chcesz zbudować");
        String shape = scanner.nextLine();

        switch (shape) {
            case "prostokąt":
                System.out.println("Podaj długość pierwszego boku: ");
                double firstRectangleArm = scanner.nextDouble();
                System.out.println("Podaj długość drugiego boku: ");
                double secondRectangleArm = scanner.nextDouble();
                Shape rectangle = new Rectangle(firstRectangleArm, secondRectangleArm);
                System.out.println("pole prostokąt wynosi: " + rectangle.calculateArea());
                System.out.println("obwód prostokąt wynosi: " + rectangle.calculatePerimeter());
                break;
            case "koło":
                System.out.println("Podaj długość promienia");
                double r = scanner.nextDouble();
                Shape circle = new Circle(r);
                System.out.println("pole koła wynosi: " + circle.calculateArea());
                System.out.println("obwód koła wynosi: " + circle.calculatePerimeter());
                break;
            case "trójkąt":
                System.out.println();
                System.out.println("Podaj długość pierwszego ramienia");
                double firstArm = scanner.nextDouble();
                System.out.println("Podaj długość drugiego ramienia");
                double secondArm = scanner.nextDouble();
                System.out.println("Podaj długość trzeciego ramienia");
                double thirdArm = scanner.nextDouble();
                Shape triangle = new Triangle(firstArm, secondArm, thirdArm);
                System.out.println("pole trójkąta wynosi: " + triangle.calculateArea());
                System.out.println("obwód trójkąta wynosi: " + triangle.calculatePerimeter());
                break;
        }
    }
}
