package ćwiczenia.SkładoweStatyczne.Ćwiczenie3;

public class Car {

    public static final int CAR_IS_RUNNING = 100;
    public static final int CAR_IS_NOT_RUNNING_ENGINE_PROBLEM = 200;
    public static final int CAR_IS_NOT_RUNNING_LACK_OF_FUEL = 300;
    public static final int CAR_IS_RUNNING_BUT_FUEL_FILLER_DOOR_OPEN = 400;
    public static final int CAR_IS_RUNNING_BUT_DOOR_OR_TRUNK_OPEN = 500;

    private double fuelLevel;
    private boolean isEngineCapable;
    private boolean isFuelFillerDoorClosed;
    private boolean areDoorsAndTrunkClosed;
    private boolean isEngineRunning;

    public Car (double fuelLevel, boolean isEngineCapable, boolean isFuelFillerDoorClosed, boolean areDoorsAndTrunkClosed,
                boolean isEngineRunning) {
        this.fuelLevel = fuelLevel;
        this.isEngineCapable = isEngineCapable;
        this.isFuelFillerDoorClosed = isFuelFillerDoorClosed;
        this.areDoorsAndTrunkClosed = areDoorsAndTrunkClosed;
        this.isEngineRunning = isEngineRunning;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        if (fuelLevel < 0) {
            isEngineRunning = false;
        }
        this.fuelLevel = fuelLevel;
    }

    public boolean isEngineCapable() {
        return isEngineCapable;
    }

    public void setEngineCapable(boolean engineCapable) {
        if(!engineCapable) {
            engineCapable = false;
        }
        isEngineCapable = engineCapable;
    }

    public boolean isFuelFillerDoorClosed() {
        return isFuelFillerDoorClosed;
    }

    public void setFuelFillerDoorClosed(boolean fuelFillerDoorClosed) {
        isFuelFillerDoorClosed = fuelFillerDoorClosed;
    }

    public boolean isAreDoorsAndTrunkClosed() {
        return areDoorsAndTrunkClosed;
    }

    public void setAreDoorsAndTrunkClosed(boolean areDoorsAndTrunkClosed) {
        this.areDoorsAndTrunkClosed = areDoorsAndTrunkClosed;
    }

    public boolean isEngineRunning() {
        return isEngineRunning;
    }

    public void setEngineRunning(boolean isEngineRunning) {
        int systemCheck = systemCheck();
        if (systemCheck == CAR_IS_NOT_RUNNING_ENGINE_PROBLEM || systemCheck == CAR_IS_NOT_RUNNING_LACK_OF_FUEL) {
            this.isEngineRunning = false;
        } else
        this.isEngineRunning = isEngineRunning;
    }

    int start() {
        int systemCheck = systemCheck();
        setEngineRunning(true);
        return systemCheck;
    }

    private int systemCheck() {
        if (!isEngineCapable)
            return CAR_IS_NOT_RUNNING_ENGINE_PROBLEM;
        if (fuelLevel == 0)
            return CAR_IS_NOT_RUNNING_LACK_OF_FUEL;
        if (!isFuelFillerDoorClosed)
            return CAR_IS_RUNNING_BUT_FUEL_FILLER_DOOR_OPEN;
        if (!areDoorsAndTrunkClosed)
            return CAR_IS_RUNNING_BUT_DOOR_OR_TRUNK_OPEN;
        return CAR_IS_RUNNING;
    }

    String status() {
        if (systemCheck() == CAR_IS_RUNNING)
            return "Wszystkie sytemy sprawne, możesz wyruszyć w bezpieczną podróż.";
        String status = "Status samochodu:\n";
        if (!isEngineCapable)
            status += "> Silnik uszkodzony\n";
        if (fuelLevel == 0)
            status += "> Brak paliwa\n";
        if (!isFuelFillerDoorClosed)
            status += "> Zamknij wlewa paliwa\n";
        if (!areDoorsAndTrunkClosed)
            status += "> Drzwi, lub bagażnik są otwarte\n";
        if (isEngineRunning)
            status += "> Silnik jest włączony";
        else
            status += "> Silnik jest wyłączony";
        return status;
    }
}
