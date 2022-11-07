package ćwiczenia.Enum.Ćwieczenie1;

public enum Pizza {

    MARGHERITA("sos pomidorowy", "ser"),
    CAPRICIOSA("sos pomidorowy", "ser", "pieczarki"),
    PROSCIUTTO("sos pomidorowy", "ser", "szynka");

    public String firstIngredient;
    public String secondIngredient;
    public String thirdIngredient;

    Pizza(String firstIngredient, String secondIngredient, String thirdIngredient) {
        this.firstIngredient = firstIngredient;
        this.secondIngredient = secondIngredient;
        this.thirdIngredient = thirdIngredient;
    }

    Pizza(String firstIngredient, String secondIngredient) {
        this.firstIngredient = firstIngredient;
        this.secondIngredient = secondIngredient;
    }

    public String getFirstIngredient() {
        return firstIngredient;
    }

    public String getSecondIngredient() {
        return secondIngredient;
    }

    public String getThirdIngredient() {
        return thirdIngredient;
    }

    @Override
    public String toString() {
        if (getThirdIngredient() != null) {
            return name() + ": " + getFirstIngredient() + ", " + getSecondIngredient() + ", " + getThirdIngredient();
        } else {
            return name() + ": " + getFirstIngredient() + ", " + getSecondIngredient();
        }
    }
}
