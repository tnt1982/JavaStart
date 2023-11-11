package cwiczenia.iteratory.cwiczenie1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PersonalDataFactory {

    public static void main(String[] args) {

        Map<String, PersonalData> personalDataTreeMap = new TreeMap<>();

        personalDataTreeMap.put("Lewandowski", new PersonalData("Rafał", "Lewandowski", 35));
        personalDataTreeMap.put("Błaszczykowski", new PersonalData("Jakub", "Błaszczykowski", 37));
        personalDataTreeMap.put("Piszczek", new PersonalData("Łukasz", "Piszczek", 36));
        personalDataTreeMap.put("Lato", new PersonalData("Grzegorz", "Lato", 69));
        personalDataTreeMap.put("Zima", new PersonalData("Władysław", "Zima", 72));
        personalDataTreeMap.put("Wiosna", new PersonalData("Kamil", "Wiosna", 17));

        final Collection<PersonalData> personalDataCollection = personalDataTreeMap.values();
        final Iterator<PersonalData> personalDataIterator = personalDataCollection.iterator();

        while (personalDataIterator.hasNext()) {
            System.out.println(personalDataIterator.next());
        }
    }

}
