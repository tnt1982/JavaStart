package cwiczenia.mapy.cwiczenie0;

import java.util.*;

public class NotebookStore {

    public static void main(String[] args) {
        Map<String, Notebook> notebookHashMap = new HashMap<>(); // nie zachowuje kolejności wprowadzanych wartości
        Map<String, Notebook> notebookLinkedHashMap = new LinkedHashMap<>(); // zachowuje kolejność wprowadzanych wartości
        Map<String, Notebook> notebookTreeMap = new TreeMap<>(); // sortuje wpisy na podstawie kluczy

        notebookHashMap.put("A77", new Notebook("Lenovo", "A77"));
        notebookHashMap.put("Inspiron44", new Notebook("Dell", "Inspiron44"));
        notebookHashMap.put("G11", new Notebook("Asus", "G11"));

//        String keyA = "A77";
//        System.out.println(notebookMap.get(keyA)); // metod .get pobiera wartość po wskazanym kluczu;
//
//
        Set<String> keySet = notebookHashMap.keySet();  // w wyniku otrzymamy zbiór kluczy, Set kluczy;
        System.out.println(keySet);

        for (String key : keySet) {
            System.out.println(key + " : " + notebookHashMap.get(key));
        }

//        Collection<Notebook> notebookCollection = notebookMap.values(); // w wyniku zwraca kolekcję wartości;
//        System.out.println(notebookCollection);

        final Set<Map.Entry<String, Notebook>> entrySet = notebookHashMap.entrySet();
        for (Map.Entry<String, Notebook> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // tworzenie mapy korzystając z metody .of; String - imię, Integer - numer kadrowy
        Map<String, Integer> listOfEmployee = Map.of("Jan", 11, "Rafał", 12, "Zbigniew", 15);
        System.out.println(listOfEmployee.get("Jan"));
    }
}
