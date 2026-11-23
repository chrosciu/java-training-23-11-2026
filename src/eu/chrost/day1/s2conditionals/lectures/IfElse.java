package eu.chrost.day1.s2conditionals.lectures;

import java.util.Random;

public class IfElse {
    public static void main(String[] args) {
        //instrukcja losujaca liczby calkowite z zakresu 0..9
        int i = new Random().nextInt(10);

        System.out.println("Wylosowana liczba to: " + i);

        //chce jakis kawalek programu wykonac tylko jesli jest prawda
        //uzywam instrukcji if i przekazuje do niej warunek logiczny (prawda lub falsz)
        //do budowania takich warunkow moge wykorzystac specjalne operatory porownania
        //lub logiczne
        if (i < 5) {
            //nawet jezeli mamy do wykonania tylko jedna instrukcje zawsze uzywajmy nawiasow klamrowych
            //i wciec
            System.out.println("Wylosowana liczba jest mniejsza niz 5");
        }

        if (i <= 4) {
            System.out.println("Wylosowana liczba jest mniejsza niz lub rowna 4");
        } else {
            //opcjonalny blok do wykonania gdy warunek w if nie jest spelniony
            System.out.println("Wylosowana liczba jest wieksza od 4");
        }
    }
}
