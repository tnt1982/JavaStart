package cwiczenia.collections.cwiczenie0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionOperations {
    public static void main(String[] args) {
        String sentence = "Chrząszcz o wydłużonym, wąskim ciele długości od 8 do 13 mm. Głowa jest duża, czarna, o " +
                "równoległych bokach, zaopatrzona w wyraźne bruzdy środkowe i pozbawiona bruzd czołowych " +
                "zewnętrznych, pokryta dużymi, głównie owalnymi punktami, pozbawiona mikrorzeźby.";

        final List<String> stringList = Arrays.asList(sentence.split(" "));

        System.out.println("Lista wyrazów ze zdania: ");
        printStringList(stringList);

        System.out.println("Lista wymieszana - 'shuffle':");
        Collections.shuffle(stringList);
        printStringList(stringList);

        Collections.sort(stringList, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Lista posortowania alfabetycznie: ");
        printStringList(stringList);

        System.out.println("Pierwsze wystąpienie słowa 'jest' jest na indeksie: ");
        final int binarySearch = Collections.binarySearch(stringList, "jest");
        System.out.println(binarySearch);

        final int frequency = Collections.frequency(stringList, "pozbawiona");
        System.out.println("Słowo 'pozbawiona' wystąpiło w tekście " + frequency + " razy");

        System.out.println("Najmniejszy element na liście: " + Collections.min(stringList));
        System.out.println("Największy element na liście: " + Collections.max(stringList));
    }

    static void printStringList(List<String> stringList) {
        for(String word : stringList) {
            System.out.print(word + "; ");
        }
        System.out.println();
    }


}
