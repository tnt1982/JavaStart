package ćwiczenia.Dziedziczenie.Ćwiczenie1;

final class ExhaustPart extends Part {

    private boolean compliesWithEuropeanStandard;

    public ExhaustPart (int partNumber, String manufacturer, String model, String serialNumber, boolean compliesWithEuropeanStandard) {
        setPartNumber(partNumber);
        setManufacturer(manufacturer);
        setModel(model);
        setSerialNumber(serialNumber);
        this.compliesWithEuropeanStandard = compliesWithEuropeanStandard;
    }

    public boolean isCompliesWithEuropeanStandard() {
        return compliesWithEuropeanStandard;
    }

    public void setCompliesWithEuropeanStandard(boolean compliesWithEuropeanStandard) {
        this.compliesWithEuropeanStandard = compliesWithEuropeanStandard;
    }
}
