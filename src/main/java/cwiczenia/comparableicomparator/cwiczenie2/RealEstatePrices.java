package cwiczenia.comparableicomparator.cwiczenie2;

import java.util.Locale;

import static java.lang.String.format;

public class RealEstatePrices implements Comparable<RealEstatePrices> {

    private String city;
    private double price;
    private double area;

    public RealEstatePrices(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double averagePrices() {
        return (price/area);
    }

    @Override
    public String toString() {
        return city + ", "
                + String.format(Locale.FRANCE, "%,.2f", price) + " zl, "
                + area + " mk, "
                + String.format(Locale.FRANCE,"%,.2f", averagePrices())  + " zl/mk";
    }

    @Override
    public int compareTo(RealEstatePrices o) {
        return -Double.compare(averagePrices(), o.averagePrices());
    }
}
