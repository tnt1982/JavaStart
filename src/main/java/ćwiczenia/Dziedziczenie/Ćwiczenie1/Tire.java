package ćwiczenia.Dziedziczenie.Ćwiczenie1;

final class Tire extends Part{

    private int size;
    private int width;

    public Tire (int partNumber, String manufacturer, String model, String serialNumber, int size, int width) {
        setPartNumber(partNumber);
        setManufacturer(manufacturer);
        setModel(model);
        setSerialNumber(serialNumber);
        this.width = width;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return  width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
