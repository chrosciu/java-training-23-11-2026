package eu.chrost.day2.s2arrays.lectures;

import java.util.Arrays;

public class PredefinedArrays {
    public static void main(String[] args) {
        //tablica o z gory zdefiniowanych elementach - bedzie miala dlugosc 3
        int[] predefinedArray = {3, 4, 7};

        //jest to odpowiednik zapisu
        /*
        int[] predefinedArray = new int[3];
        predefinedArray[0] = 3
        predefinedArray[1] = 4
        predefinedArray[2] = 7
        */

        System.out.println(Arrays.toString(predefinedArray));

        //predefiniowana tablice tez mozna modyfikowac
        predefinedArray[1] = 6;

        System.out.println(Arrays.toString(predefinedArray));

        //mozna tez tablice zadeklarowac tak - uzywamy new ale nie podajemy rozmiaru
        //zostanie on wziety z listy elementow
        int[] anotherPredefinedArray = new int[]{3, 5};

        System.out.println(Arrays.toString(anotherPredefinedArray));
    }
}
