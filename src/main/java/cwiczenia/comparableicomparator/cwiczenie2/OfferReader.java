package cwiczenia.comparableicomparator.cwiczenie2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OfferReader {

    static RealEstatePrices[] readOffer(String fileName) throws FileNotFoundException {

        RealEstatePrices[] realEstatePrices = new RealEstatePrices[10];

        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            for (int i = 0; i < realEstatePrices.length; i++) {
                realEstatePrices[i] = createRealEstate(scanner.nextLine());
            }
        }
        return realEstatePrices;
    }

    private static RealEstatePrices createRealEstate(String realEstate) {
        String[] data = realEstate.split(";");
        String city = data[0];
        double price = Double.parseDouble(data[1]);
        double area = Double.parseDouble(data[2]);
        return new RealEstatePrices(city, price, area);
    }
}

