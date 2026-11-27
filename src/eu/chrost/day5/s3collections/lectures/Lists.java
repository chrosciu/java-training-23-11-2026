package eu.chrost.day5.s3collections.lectures;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        //podstawowa kolekcja
        //(czyli obiektem pozwalajacym na przechowywanie wielu elementow tego samego typu)
        //jest cos takiego jak List<E> - odpowiednik tablicy ale o wiele bardziej elastyczny

        //poniewaz List jest interfejsem to faktyczny obiekt tego typu musi byc jedna z klas
        //ktora go implementuje - najczesciej spotykane sa dwie
        //ArrayList (elementy sa pod spodem trzymane w tablicy)
        //LinkedList (dany element ma tylko referencje do poprzedniego i nastepnego)

        //zatem tworzymy zmienna tego typu i ukonkretniamy mowiac
        //ze bedzie ona przechowywac wartosci typu String
        List<String> list = new ArrayList<>();

        //lista na starcie jest pusta, ale juz mamy pierwsza przyjemna rzecz
        //metoda toString() zwraca czytelna reprezentacje
        System.out.println(list);

        //dodawanie elementow jest banalne - add() dodaje na koniec listy
        //ale jest tez np. przeciazona wersja pozwalajaca na wstawienie pod
        //konkretny indeks
        list.add("Marcin");
        list.add("Chrost");

        System.out.println(list);

        //for-each tez da sie do listy - bo implementuje ona interfejs Iterable
        for (String s : list) {
            System.out.println(s);
        }

        //lista ma takze metode size()
        System.out.println(list.size());

        //usuwanie jest proste - w tym przpyadku usuwamy element o danym indeksie
        list.remove(1);

        System.out.println(list);

        //rowniez mozna sprawdzic czy lista zawiera konkretny obiekt
        System.out.println(list.contains("Marcin"));
        System.out.println(list.contains("Chrost"));

    }
}
