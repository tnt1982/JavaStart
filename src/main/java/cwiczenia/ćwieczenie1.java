package cwiczenia;

class Stats {
    public static void main(String[] args) {

        double netPrice = 7.0;
        double vatRate = 0.07;
        double vatValue = netPrice * vatRate;
        double grossPrice = netPrice + vatValue;

        System.out.println("Cena netto towaru wynosi: " + netPrice);
        System.out.println("Wysokość podatku dla tego towaru wynosi: " + vatValue);
        System.out.println("Cena brutto towaru wynosi: " + grossPrice);

        System.out.println("");

        System.out.println("Cena netto towaru wynosi: " + netPrice);
        System.out.printf("Wysokość podatku dla tego towaru wynosi: %.2f", vatValue);
        System.out.println("\nCena brutto towaru wynosi: " + grossPrice);

    }
}