package eu.chrost.day1.s1variables.lectures;

public class LongVariables {
    public static void main(String[] args) {
        int bigA = 1000000;
        //to samo co bigA ale w zapisie z grupowaniem
        int bigB = 1_000_000;

        int bigProduct = bigA * bigB;
        //przekroczenie zakresu int - wychodza jakies ujemne smieci
        System.out.println(bigProduct);

        //bigA i bigB sa typu int
        //dlatego mnozenie bedzie wykonane rowniez do typu int (z utrata wartosci)
        //a nastepnie dopiero przypisane do typu long
        long longBigProduct = bigA * bigB;
        System.out.println(longBigProduct);

        //przy mnozeniu typ wynikowy jest brany jako najszerszy z typow operandow
        //poniewaz long > int to uzyjemy long
        //i wynik bedzie poprawny
        long longA = 1000000;
        long longBigProduct2 = longA * bigB;
        System.out.println(longBigProduct2);

        //mozna zawsze przypisac z wezszego typu do szerszego
        long longCastedA = bigA;
        long longBigProduct3 = longCastedA * bigB;
        System.out.println(longBigProduct3);

        //przypisanie z typu szerszego do wezszego jest mozliwe tylko
        //jesli poprosimy o to wprost
        //int intA = longA; - nie kompiluje sie - ryzyko utraty wartosci
        //jezeli wprost uzyjemy operatora rzutowania (cast) - to mozna tak zrobic
        int intA = (int) longA;
        System.out.println(intA);

        //mozna rzutowac do typu szerszego ale jest to zbedne
        //zbedne rzeczy sa wyszarzane przez IntelliJ
        long explicitlyCastedA = (long) bigA;


        //kilka krokow pod spodem
        //bigA jest najpierw konwertowane na long
        //tworzona jest anonimowa zmienna typu long i do niej przypisywana jest wartosc bigA
        //nastepnie wykonywane jest mnozenie - poniewaz mamy typy long (anonimowa zmienna) i int (bigB)
        //to wynik bedzie typu long - i bedzie poprawny
        long longBigProduct5 = (long) bigA * bigB;
        System.out.println(longBigProduct5);

        //literal z wartoscia calkowita jest traktowany jako int
        //czyli problem jak wyzej
        long longBigProduct6 = bigA * 1_000_000;
        System.out.println(longBigProduct6);

        //sufiks L powoduje potraktowanie wartosci jako long
        //wynik bedzie poprawny
        long longBigProduct7 = bigA * 1_000_000L;
        System.out.println(longBigProduct7);

    }
}
