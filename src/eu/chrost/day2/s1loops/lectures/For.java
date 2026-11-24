package eu.chrost.day2.s1loops.lectures;

import java.util.Random;

public class For {
    public static void main(String[] args) {
        //petla for sklada sie z 3 czesci
        //1 - deklaracja zmiennej dostepnej wewnatrz petli oraz ustawienie jej poczatkowej wartosci
        //2 - warunek ktory jest sprawdzany przed wejsciem do petli (czyli tak jak w petli while)
        //co oznacza ze petla for moze nie wykonac sie ani razu !
        //3 - akcja jaka ma zostac wykonana po zakonczeniu kazdej iteracji petli
        //czyli ostatnia instrukcja w iteracji
        //czesci petli for sa oddzielone srednikami
        for (int i = 1; i <= 10; i++) {
            //do 3 czesci standardowo uzywa sie tutaj i++
            //ale i+=1 oraz i = i + 1 tez sa jak najbardziej poprawne
            System.out.println(i);
        }
        //w tym miejscu licznik jest juz niedostepny
        //System.out.println(i);

        System.out.println("########");

        //skladowe petli sa opcjonalne - mozna je pominac
        //jezeli pominiemy warunek z czesci 2 to uznaje sie ze jest on zawsze prawdziwy
        //iteracja ma wykonac sie zawsze
        for (int j = 1; ;) {
            if (j > 10) {
                //instrukcja break dziala dokladnie tak samo
                //jak w petli while / do-while
                break;
            }
            System.out.println(j++);
        }

        System.out.println("########");

        //ta petla wykonuje sie zawsze i jest dokladnym odpowiednikiem while(true)
        for (;;) {
            int i = new Random().nextInt(10);
            System.out.println(i);
            if (i >= 8) {
                break;
            }
        }
    }
}
