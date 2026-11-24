package eu.chrost.day2.s3methods.lectures;

import java.util.Arrays;

public class VarArgsMethods {
    public static void main(String[] args) {
        //System.out.println(sum(1, 4, 7));
        //System.out.println(sum(2));
        System.out.println(sum());

        printWithPrefix("X", 1, 3);
        printWithPrefix("Y");
    }

    //uzywajac zapisu z `...` mozna wskazac ze ostatni argument metody
    //moze byc uzyty dowolna ilosc razy (w tym zero!) w zawolaniu
    //i takie argumenty o nieznanej ich liczbie
    //sa dostepne w postaci pseudotablicy w ciele metody
    public static int sum(int... values) {
//        System.out.println("Liczba argumentow " + values.length);
//        if (values.length > 0) {
//            System.out.println("Pierwszy argument " + values[0]);
//        }
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    //w jednej metodzie moga byc zarowno argumenty zwykle jak i var-args
    //ale var-args w takim przypadku musi byc zadeklarowany jako ostatni
    private static void printWithPrefix(String prefix, int... values) {
        System.out.println(prefix + Arrays.toString(values));
    }
}
