package ćwiczenia.dodatkoweĆwiczenia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DwudziestyLuty {

    public static final List<String> LISTA = new ArrayList<>(Arrays.asList(
            "JEDEN", "DWA", "TRZY", "CZTERY"
    ));

    public static String jeden = null;
    public static String dwa = "CZTEry";

    public static void main(String[] args) {

        System.out.println(isTrue(jeden, dwa));
    }

    public static boolean isTrue (String jeden, String dwa) {
        if (Objects.nonNull(jeden)) {
            jeden = jeden.toUpperCase();
        }
        if (Objects.nonNull(dwa)) {
            dwa = dwa.toUpperCase();
        }
        if (Objects.isNull(jeden) && Objects.isNull(dwa)) {
            return false;
        }
        return LISTA.contains(jeden) ||
                LISTA.contains(dwa);
    }
}
