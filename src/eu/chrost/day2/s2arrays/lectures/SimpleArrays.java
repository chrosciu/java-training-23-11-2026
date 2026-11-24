package eu.chrost.day2.s2arrays.lectures;

import java.util.Arrays;

public class SimpleArrays {
    public static void main(String[] args) {
        //zmienna typu tablicowego - kazdy element w niej jest typu int
        int[] intArray;

        //zeby takiej zmiennej dalo sie uzywac to trzeba ja zainicjowac
        //podajac rozmiar - ilosc komorek w tablicy
        intArray = new int[5];

        //zazwyczaj laczy sie jedno z drugim piszac od razu tak
        int[] anotherArray = new int[3];

        //po zainicjalizowaniu w komorkach tablicy znajduja sie domyslne wartosci
        // - dla typu int sa to zera

        //element z tablicy modyfikujemy i odczytujemy za pomoca operatora indeksu [])
        intArray[2] = 1;

        //po tablicy iterujemy za pomoca indeksow
        //zaczynamy zawsze od 0 do (length - 1)
        //dlugosc tablicy mozna odczytac za pomoca property length
        //dostep do property mamy za pomoca operatora `.`
        for (int i = 0; i < intArray.length; ++i) {
            System.out.println("intArray[" + i + "] -> " + intArray[i]);
        }

        //WAZNE: nie nalezy wyjezdzac poza zakres tablicy !!!
        //kod sie skompiluje ale wyrzuci wyjatek w runtime
        //intArray[5] = 1;

        //zadziala ale wygeneruje kompletnie nieczytelny napis
        System.out.println(intArray);

        //mozna skorzystac z gotowej metody w klasie Arrays
        System.out.println(Arrays.toString(intArray));
    }
}
