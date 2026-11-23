package eu.chrost.day1.s2conditionals.lectures;

import java.util.Random;

public class IfElseNested {
    public static void main(String[] args) {
        int i = new Random().nextInt(10);
        System.out.println("Wylosowana liczba to: " + i);

        int remainderByFour = i % 4;

        //dziala ale zaczyna byc za bardzo zagniezdzone
        if (remainderByFour == 0) {
            System.out.println("Wylosowana liczba jest podzielna przez 4");
        } else {
            if (remainderByFour == 1) {
                System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 1");
            } else {
                if (remainderByFour == 2) {
                    System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 2");
                } else {
                    System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 3");
                }
            }
        }

        //Java nie ma instrukcji elseif znanej z innych jezykow
        //ale pozwala na zapis laczacy else z zagniezdzonym if
        //w ten sposob ze wykonana bedzie pierwsza galaz ktora spelni jakis warunek
        //a wszystkie ponizej niej zostana zignorowane
        if (remainderByFour == 0) {
            System.out.println("Wylosowana liczba jest podzielna przez 4");
        } else if (remainderByFour == 1) {
            System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 1");
        } else if (remainderByFour == 2) {
            System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 2");
        } else {
            System.out.println("Wylosowana liczba przy dzieleniu przez 4 daje reszte 3");
        }
    }
}
