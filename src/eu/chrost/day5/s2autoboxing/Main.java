package eu.chrost.day5.s2autoboxing;

public class Main {
    public static void main(String[] args) {
        //w Javie 5 wprowadzono klasy pozwalajace na modelowanie dotychczasowych typow prymitywnych
        //long -> Long
        //boolean -> Boolean
        //double -> Double
        //etc...
        //oczywiscie wyjatkiem jest int -> Integer

        //konwersja z typu primtywnego na obiekt wyglada tak
        //(uzywamy metody statycznej bo konstruktor jest uznawany za deprecated)
        Integer intAsObject = Integer.valueOf(5);

        //konwersja w druga strone tez jest prosta
        //(uzywamy metody instancyjnej na duzym Integer)
        int intAsPrimitive = intAsObject.intValue();

        //tego typu konwersje sa jednak uciazliwe wiec przyjeto zalozenie
        //ze w miejsu w ktorym oczekiwany jest obiekt Integer mozna przekazac wartosc int
        //i odwrotnie - tam gdzie chcemy int mozna przekazac duzy Integer
        //konwersja miedzy nimi zostanie zrobiona automatycznie - przez tzw. autoboxing

        //dzieki temu mozliwe sa takie przypisania
        Integer xObj = 7;
        int xInt = xObj;
        System.out.println(xInt);
        Integer xObj2 = xInt;
        System.out.println(xObj2);

        //uwaga - pulapka jest przy wartosci null
        Integer nullObj = null;
        //kod sie skompiluje ale w runtime rzuci NPE
        //int nullInt = nullObj;
    }
}
