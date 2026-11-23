package eu.chrost.day1.s1variables.lectures;

public class IntegerVariables {
    public static void main(String[] args) {
        //zadeklarowanie zmiennej typu calkowitego
        //int - typ calkowity
        //i - nazwa zmiennej
        int i; //kazda instrukcja musi konczyc sie srednikiem
        // komentarz za pomoca znakow // - do konca linii kompilator ignoruje co jest dalej

        //nie da sie uzywac zmiennych bez ich deklaracji
        // x = 7; - blad kompilacji - nie wiadomo co to jest x

        /*
           Komentarz wielolinijkowy
           za pomoca znakow / oraz *
        */

        //samo zadeklarowanie zmiennej nie pozwala jej uzyc, potrzebne jest
        //przypisane wartosci poprzez operator =
        i = 123;

        //metoda println jest na tyle zreczna ze pozwala wypisac zawartosc dowolnego
        //typu, nie tylko znakowego
        System.out.println(i);

        //mozna polaczyc deklaracje z przypsdianiem wartosic
        int j = 7;
        System.out.println(j);

        //wartosc zmiennej co do zasady mozna modyfikowac
        j = 9;
        System.out.println(j);
    }
}
