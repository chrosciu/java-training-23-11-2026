package eu.chrost.day1.s1variables.lectures;

public class StringVariables {
    public static void main(String[] args) {
        //deklaracja jest podobna do zmiennych typow primitywnych
        //glowna roznica polega na tym ze String jest jednak typem obiektowym
        //i dlatego zaczyna sie z duzej litery
        String name = "Marcin";
        System.out.println(name);

        //mozna tez najpierw zdeklarowac a potem przypisac
        String surname;
        surname = "Chrost";
        System.out.println(surname);

        //mozliwe nazwy zmiennych:
        //full_name - tego nie stosujemy !
        //FullName - tak nazywamy klasy (wszystkie czlony zaczynaja sie z duzych liter)
        //fullName - konwencja uzywana w Javie do zmiennych -
        // pierwszy czlon z malej litery, pozostale - z duzej, bez podkreslnikow

        //mozna zdeklarowac wprost - ale to bez sensu - powtarzamy sie
        //String fullName = "Marcin Chrost";

        //zmienne tekstowe mozna laczyc za pomoca operatora +
        String fullName = "Marcin" + "Chrost";
        System.out.println(fullName);

        //mozna tak - ale to nie wyglada ladnie
        //String fullNameWithSpace = "Marcin " + "Chrost";

        //lepiej dac te spacje oddzielnie
        String fullNameWithSpace = "Marcin" + " " + "Chrost";
        System.out.println(fullNameWithSpace);

        //mozna laczyc operatorem `+` zmienne roznych typow
        // - wystarczy ze jeden z nich to String
        //wtedy calosc bedzie traktowana jak String
        int i = 3;
        String description = "i = " + i;
        System.out.println(description);

        //Wszystkie te ulatwienia w postaci:
        //mozliwosci przypisania wartosci przez operator =
        //mozliwosci laczenia wartosci przez operator +
        //dzialaja TYLKO i WYLACZNIE dla typu String
        //natomiast nie da sie ich uzyc w zadnym innym typie obiektowym !!!


    }
}
