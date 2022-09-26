package ćwiczenia.SpecyfikatoryDostępuIPakiety1.PointApplicationPackage;

import ćwiczenia.SpecyfikatoryDostępuIPakiety1.PointControllerPackage.PointController;
import ćwiczenia.SpecyfikatoryDostępuIPakiety1.PointPackage.Point;

public class PointApplication {

    public static void main(String[] args) {

        Point point = new Point(7, 7);
        PointController pointController = new PointController();

        System.out.println("Punkt: (" + point.getCoordinateX() + ";" + point.getCoordinateY() + ")");
        pointController.addX(point);
        System.out.println("Punkt addX: (" + point.getCoordinateX() + ";" + point.getCoordinateY() + ")");
        pointController.addY(point);
        System.out.println("Punkt addY: (" + point.getCoordinateX() + ";" + point.getCoordinateY() + ")");
        pointController.minusX(point);
        System.out.println("Punkt minusX: (" + point.getCoordinateX() + ";" + point.getCoordinateY() + ")");
        pointController.minusY(point);
        System.out.println("Punkt minusY: (" + point.getCoordinateX() + ";" + point.getCoordinateY() + ")");
    }
}
