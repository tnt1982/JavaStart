package cwiczenia.SkładoweStatyczne.Ćwiczenie3;

public class CarTest {
    public static void main(String[] args) {

        Car car = new Car(77, true, true, true, true);
        car.start();
        System.out.println(car.status());
        System.out.println();

        car.setAreDoorsAndTrunkClosed(false);
        System.out.println(car.status());
        System.out.println();

        car.setAreDoorsAndTrunkClosed(true);
        System.out.println(car.status());
        System.out.println();

        car.setEngineCapable(false);
        System.out.println(car.status());
        System.out.println();

        car.setEngineCapable(true);
        System.out.println(car.status());
        System.out.println();

        car.setFuelLevel(0);
        System.out.println(car.status());
        System.out.println();
    }
}
