package cwiczenia.SpecyfikatoryDostępuIPakiety1.PointControllerPackage;

import cwiczenia.SpecyfikatoryDostępuIPakiety1.PointPackage.Point;

public class PointController {

    public void addX(Point point) {
        point.setCoordinateX(point.getCoordinateX() + 1);
    }

    public void minusX(Point point) {
        point.setCoordinateX(point.getCoordinateX() - 1);
    }

    public void addY(Point point) {
        point.setCoordinateY(point.getCoordinateY() + 1);
    }

    public void minusY(Point point) {
        point.setCoordinateY(point.getCoordinateY() - 1);
    }
}
