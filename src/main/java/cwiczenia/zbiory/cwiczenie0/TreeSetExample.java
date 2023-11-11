package cwiczenia.zbiory.cwiczenie0;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> treeSetInteger = new TreeSet<>(); // zbiór uporządkowany;
        treeSetInteger.add(2);
        treeSetInteger.add(3);
        treeSetInteger.add(5);
        treeSetInteger.add(4);
        treeSetInteger.add(7);
        treeSetInteger.add(6);
        treeSetInteger.add(9);
        treeSetInteger.add(8);
        treeSetInteger.add(2);
        System.out.println(treeSetInteger.size());
        System.out.println(treeSetInteger);
        System.out.println("obiekt z pozycji pierwszej " + treeSetInteger.first());
        System.out.println("obiekt z pozycji ostatniej " + treeSetInteger.last());
        System.out.println("czy jest obiekt '3'" + treeSetInteger.contains(3));
        System.out.println("czy jest obiekt '11'" + treeSetInteger.contains(11));


        TreeSet<Person> treeSetPerson = new TreeSet<>();
        treeSetPerson.add(new Person("Jan", "Kowalski"));
        treeSetPerson.add(new Person("Krzysztof", "Duda"));
        treeSetPerson.add(new Person("Rafał", "Pies"));
        treeSetPerson.add(new Person("Jan", "Kowalski"));
        treeSetPerson.add(new Person("Jan", "Kowalski"));
        System.out.println(treeSetPerson.size());
        System.out.println(treeSetPerson);
        System.out.println("obiekt z pozycji pierwszej " + treeSetPerson.first());
        System.out.println("obiekt z pozycji ostatniej " + treeSetPerson.last());
        System.out.println("czy jest obiekt 'Rafał Pies'" + treeSetPerson.contains(new Person("Rafał", "Pies")));
        System.out.println("czy jest obiekt 'Krzysztof Duda'" + treeSetPerson.contains(new Person("Krzysztof", "Duda")));

        Set<String> stringSet = Set.of("Inka", "Azor", "Pimpuś");
        System.out.println(stringSet);
    }
}
