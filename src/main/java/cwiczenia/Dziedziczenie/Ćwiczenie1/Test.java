package cwiczenia.Dziedziczenie.Ćwiczenie1;

public class Test {

    public static void main(String[] args) {

        Tire tire = new Tire(111, "Nokian", "winter sport", "111a",
                55, 205
        );

        ExhaustPart exhaustPart = new ExhaustPart(222, "Fabryka Układów Wydechowych",
                "summer sport extra power plus", "222b", false
        );

        System.out.println("Dane na temat opon: ");
        System.out.println("rozmiar: " + tire.getSize());
        System.out.println("szerokość: " + tire.getWidth());
        System.out.println("numer części: " + tire.getPartNumber());
        System.out.println("producent: " + tire.getManufacturer());
        System.out.println("model: " + tire.getModel());
        System.out.println("numer seryjny: " + tire.getSerialNumber());

        System.out.println();

        System.out.println("Dane na temat części układu wydechowego: ");
        System.out.println("czy spełnia normy europejskie: " + exhaustPart.isCompliesWithEuropeanStandard());
        if (exhaustPart.isCompliesWithEuropeanStandard() == false) {
            System.out.println("\nUwaga, ta część nie spełnia wymogów jakościowych!!!\n");
        }
        System.out.println("numer części: " + exhaustPart.getPartNumber());
        System.out.println("producent: " + exhaustPart.getManufacturer());
        System.out.println("model: " + exhaustPart.getModel());
        System.out.println("numer seryjny: " + exhaustPart.getSerialNumber());


    }
}
