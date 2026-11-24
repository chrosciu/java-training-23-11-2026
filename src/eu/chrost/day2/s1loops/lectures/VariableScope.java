package eu.chrost.day2.s1loops.lectures;

public class VariableScope {
    public static void main(String[] args) {
        //zadeklarowana zmienna jest dostepna od momentu jej zadeklarowania
        //az do konca bloku w ktorym nastapila deklaracja

        //blok - kawalek kodu zawierajacy sie w nawiasach klamrowych {}
        //dla zmiennej x - blokiem w ktorym jest widoczna jest cala metoda main
        int x = 7;

        if (x > 5) {
            //zmienna y jest widoczna wylacznie w bloku zdefiniowanym przez instrukcje if
            int y = 3;
            //nie ma mozliwosci "zasloniecia" zmiennej przez jej ponowna deklaracje
            //w zagniezdzonym bloku
            //int x = 7;

            System.out.println(y);

            //zmienna z zewnetrznego bloku jest widoczna w wewnetrznym
            System.out.println(x);
        }

        //to sie juz nie skompiluje - bo opuscilismy blok w ktorym zostalo zadeklarowane y
        //System.out.println(y);
    }
}
