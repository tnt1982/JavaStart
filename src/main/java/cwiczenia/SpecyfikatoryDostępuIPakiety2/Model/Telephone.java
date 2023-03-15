package cwiczenia.SpecyfikatoryDostępuIPakiety2.Model;

public class Telephone {
    private String brand;
    private String model;
    private int batteryCapacity;
    private int chargeLevel;

    public Telephone(String brand, String model, int batteryCapacity, int chargeLevel) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public String printAllInformation() {
        return brand + ", " + model + ", bateria: " + batteryCapacity + "mAh, " +
                " poziom naładowania: " + chargeLevel + "%";
    }
}
