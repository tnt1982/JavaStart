package cwiczenia.SpecyfikatoryDostępuIPakiety1.PointApplicationPackage;

import cwiczenia.SpecyfikatoryDostępuIPakiety1.PointControllerPackage.PointController;
import cwiczenia.SpecyfikatoryDostępuIPakiety1.PointPackage.Point;

import java.util.Scanner;

public class PointApplication {

    public static void main(String[] args) {

        Point point = new Point(7, 7);
        PointController pointController = new PointController();

        System.out.println("Współrzędne pierwszego punktu: (" + point.getCoordinateX() + ";" + point.getCoordinateY() + ")");
        pointController.addX(point);
        System.out.println("Punkt addX: (" + point.getCoordinateX() + ";" + point.getCoordinateY() + ")");
        pointController.addY(point);
        System.out.println("Punkt addY: (" + point.getCoordinateX() + ";" + point.getCoordinateY() + ")");
        pointController.minusX(point);
        System.out.println("Punkt minusX: (" + point.getCoordinateX() + ";" + point.getCoordinateY() + ")");
        pointController.minusY(point);
        System.out.println("Punkt minusY: (" + point.getCoordinateX() + ";" + point.getCoordinateY() + ")");

        Point point1 = new Point(5, 5);
        System.out.println("Współrzędne drugiego punktu: (" + point1.getCoordinateX() + ";" + point1.getCoordinateY() + ")");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ustawiamy nowe współrzędne, podaj: 0 - addX, 1 - addY, 2 - minusX, 3 - minusY");
        int variable = scanner.nextInt();

        switch (variable) {
            case 0 -> pointController.addX(point1);
            case 1 -> pointController.addY(point1);
            case 2 -> pointController.minusX(point1);
            case 3 -> pointController.minusY(point1);
            default -> System.out.println("Podana niepoprawna wartość.");
        }
        System.out.println("Nowe współrzędne drugiego punktu: (" + point1.getCoordinateX() + ";" + point1.getCoordinateY() + ")");
    }
}