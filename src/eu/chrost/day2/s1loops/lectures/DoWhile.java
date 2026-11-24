package eu.chrost.day2.s1loops.lectures;

public class DoWhile {
    public static void main(String[] args) {
        //wypisz na ekran liczby od 1 do 10
        int i = 1;
        //petla do..while rowniez wykonuje w kolko dany blok kodu
        //dopoki jest spelniony jakis warunek podany w klauzuli while
        //na koncu petli
        do {
            //warunek nie jest sprawdzany na pierwszym wejsciu
            //petla wykona sie co najmniej raz
            System.out.println(i);
            i += 1;
            //warunek jest sprawdzany na koncu petli
            //jezeli jest falszywy nie nastapi juz kolejna iteracja
        } while (i <= 10);
    }
}
