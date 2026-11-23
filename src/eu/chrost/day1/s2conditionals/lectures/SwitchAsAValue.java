package eu.chrost.day1.s2conditionals.lectures;

import java.util.Random;

public class SwitchAsAValue {
    public static void main(String[] args) {
        int i = new Random().nextInt(10);
        System.out.println("Wylosowana liczba to: " + i);

        int remainderByFour = i % 4;

        //switch moze sluzyc takze do zwracania wartosci - to tez wprowadzono w Javie 13
        String isDivisibleByFour = switch (remainderByFour) {
            //w takim przypadku kazda galaz musi albo od razu zwracac jakas wartosc po ->
            case 1, 2, 3 -> "NIE";
            //albo jezeli chcemy dodatkowo cos zrobic w danej galezi oprocz zwrocenia wartosci
            //to uzywamy nawiasow klamrowych i slowa yield
            default -> {
                System.out.println("Trafiony!");
                yield "TAK";
            }
            //przy zwracaniu wartosci ze switcha kompilator pilnuje czy galezie pokrywaja
            //wszystkie mozliwe wartosci zmiennej wejsciowej
            //dlatego tu musielismy uzyc slowa default - inaczej bylby blad kompilacji
        };

        System.out.println("Czy liczba: " + i + " jest podzielna przez 4? -> " + isDivisibleByFour);
    }
}
