package eu.chrost.day4.s6interfaces.lectures.names;

//interfejs moze rozszerzac inny interfejs lub interfejsy (po to aby moc dodac dodatkowe metody)
//natomiast nie moze rozszerzac zadnej klasy
public interface FullNameable extends Nameable {

    //interfejsy moga miec takze pola
    //ktore domyslnie sa traktowane jako publiczne, statyczne i finalne
    //czyli innymi slowami sa stalymi
    String DEFAULT_FULL_NAME = "Unknown";

    //metody w interfejsach moga miec tzw. implementacje domyslne
    //czyli zwykle cialo metody + slowo kluczowe default
    //jezeli jakas klasa zaimplementuje ten interfejs a nie nadpisze tej metody
    //to zostanie w niej uzyta ta implementacja domyslna
    default String getFullName() {
        return DEFAULT_FULL_NAME;
    }
}
