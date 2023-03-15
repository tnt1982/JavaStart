package cwiczenia.Wyjątki.ĆwiczenieZCar;

public class CarTest {

    public static void main(String[] args) {

        Car car = new Car();

        try {
            car.refuel(39);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(car);

        try {
            car.drive();
            car.drive();
            car.drive();
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(car);
    }
}
