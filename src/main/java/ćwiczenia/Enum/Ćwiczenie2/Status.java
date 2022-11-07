package ćwiczenia.Enum.Ćwiczenie2;

public enum Status {

    NEW("złożone"),
    PAID("opłacone"),
    SHIPPED("wysłane"),
    DELIVERED("dostarczone"),
    CANCELLED("anulowane");

    private String description;

    Status(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
