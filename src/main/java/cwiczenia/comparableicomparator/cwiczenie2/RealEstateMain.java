package cwiczenia.comparableicomparator.cwiczenie2;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class RealEstateMain {

    public static void main(String[] args) throws FileNotFoundException {
        RealEstatePrices[] realEstatePrices = OfferReader.readOffer("offers.csv");
        Arrays.sort(realEstatePrices);
        for (RealEstatePrices offer : realEstatePrices) {
            System.out.println(offer);
        }
        Arrays.toString(realEstatePrices);
    }
}
