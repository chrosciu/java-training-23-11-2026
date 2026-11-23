package eu.chrost.day1.s1variables.lectures;

public class FloatingVariables {
    public static void main(String[] args) {
        double d = 0.5;
        System.out.println(d);

        //double jest szerszy niz int wiec tak przypisac nie mozna
        //obie ponizsze instrukcje sie nie kompiluja
        //int i = 0.5;
        //int j = d;

        //to sie skompiluje ale jest o tyle bez sensu ze utnie czesc ulamkowa
        //wyjdzie zero
        int i = (int) d;
        System.out.println(i);

        //dzielenie dwoch liczb zmiennoprzecinkowych generuje rowniez liczbe zmiennoprzecinkowa
        double a = 1;
        double b = 3;
        double quotient = a / b;
        System.out.println(quotient);

        int intA = 1;
        int intB = 3;
        //wynik bedzie double ale rowne zeru - gdyz najpierw zostanie obliczony iloraz typu int
        //a dopiero potem nastapi konwersja na double
        double quotientOfInt = intA / intB;
        System.out.println(quotientOfInt);

        //aby wynik faktycznie byl obliczony jako double to przynajmniej jeden z operandow
        //tez musi byc double
        double quotientOfConvertedInt = intA / (double) intB;
        System.out.println(quotientOfConvertedInt);

        //wartosci (literaly 1 oraz 3) jezeli nie zawieraja czesci ulamkowej
        // sa traktowane domyslnie jako int - problem jak wyzej
        double quotientOfLiterals = 1 / 3;
        System.out.println(quotientOfLiterals);

        //aby potraktowac literal jako double trzeba albo podac czesc zmiennoprzecinkowa
        //chocby i rowna 0
        //w tym przypadku 3.0 bedzie automatycznie potraktowane jako double
        //i wynik bedzie poprawny
        quotientOfLiterals = 1 / 3.0;
        System.out.println(quotientOfLiterals);

        //albo tez uzyc sufiksu `d` - zadziala jak wyzej
        quotientOfLiterals = 1 / 3d;
        System.out.println(quotientOfLiterals);

    }
}
