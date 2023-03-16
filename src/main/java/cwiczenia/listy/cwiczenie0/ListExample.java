package cwiczenia.listy.cwiczenie0;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {

//        ArrayList<Double> list = new ArrayList<>();
//        list.add(33.99);
//        list.add(7.23);
//        list.add(1.77);
//        list.add(79.11);
//
//        System.out.println(list);        // metod 'toString' jest dodawana domyślnie
//        System.out.println(list.size()); // metoda size wyświetla rozmiar listy
//

        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listOfIntegers.add(i, i);
        }
        System.out.println(listOfIntegers.size());
        System.out.println(listOfIntegers);


        double firstDouble = 0.00;
        ArrayList<Double> listOfDoubles = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listOfDoubles.add(i, firstDouble);
            firstDouble++;
        }

        System.out.println("Rozmiar listy: \n" + listOfDoubles.size());
        System.out.println("Zobacz wszystkie elementy: \n" + listOfDoubles);
        System.out.println("Element na pozycji 77: \n" + listOfDoubles.get(77));
    }
}
