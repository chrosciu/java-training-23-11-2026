package eu.chrost.day4.s5enums.lectures;

import java.util.Arrays;

//enum jest specyficzna forma klasy
//w ktorej podajemy zamkniety zbior jakichs wartosci
//ktore to wartosci sa instancjami enuma
//tworzonymi "z urzedu" przez Jave
//oznacza to tyle ze nie mozna stworzyc instancji enuma przez new
//a istniejace instancje sa wspoldzielone w calym systemie
public enum WeekDay {
    //wartosci typu wyliczeniowego tez piszemy w formacie UPPER_KEBAB_CASE
    //i oddzielamy przecinkami
    //ta wartosc uzywa konstruktora bezparametrowego
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    //natomiast tu uzyty jest konstruktor z parametrem
    SATURDAY(true),
    SUNDAY(true);

    //enum moze miec pola i metody
    //pola oczywiscie musza byc ustawione w konstruktorze
    //co oznacza ze enum moze miec takze konstruktory
    //domyslnie oczywiscie generowany jest tylko konstruktor bezparametrowy
    private final boolean isWeekend;

    //konstruktor enuma domyslnie jest prywatny
    //bo i tak nie da sie stworzyc jego instancji z zewnatrz
    WeekDay(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    WeekDay() {
        this(false);
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public static void main(String[] args) {
        //mozna sobie pobrac tablice wszystkich wartosci enuma
        WeekDay[] weekDays = WeekDay.values();
        //dodatkowo widac ze klasa enuma implementuje niejawnie metode toString()
        System.out.println(Arrays.toString(weekDays));

        //enuma nie tworzymy tylko po prostu pobieramy jego wartosc
        WeekDay today = WeekDay.THURSDAY;
        //dla kazdego enuma jest zdefiniowana metoda name() - zwracajaca nazwe
        System.out.println(today.name());
        //toString robi to samo
        System.out.println(today);

        //oraz metoda ordinal - zwracajaca kolejny indeks (liczony od 0)
        //enuma na liscie deklaracji w klasie
        System.out.println(today.ordinal());

        //enuma mozna takze odtworzyc na podstawie lancucha tekstowego ktory go reprezentuje
        WeekDay monday = WeekDay.valueOf("MONDAY");
        System.out.println(monday);

        //jesli podamy lancuch nieodpowiadajacy enumowi to dostaniemy w runtime IllegalArgumentException
        //WeekDay unknown = WeekDay.valueOf("unknown");

        System.out.println("Is " + today + " a weekend? " + isWeekend(today));
        System.out.println("Is Sunday a weekend? " + isWeekend(WeekDay.valueOf("SUNDAY")));

        System.out.println("Is " + today + " a weekend? " + today.isWeekend());
    }

    private static boolean isWeekend(WeekDay day) {
        //poniewaz enumy nie sa tworzone przez programiste tylko przez Jave i sa wspoldzielone
        //to mozna to ich porownania bez problemu uzyc operatora ==
        return day == WeekDay.SATURDAY || day == WeekDay.SUNDAY;
    }
}
