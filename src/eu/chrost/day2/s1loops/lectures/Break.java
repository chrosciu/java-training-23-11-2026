package eu.chrost.day2.s1loops.lectures;

public class Break {
    public static void main(String[] args) {
        //wypisz na ekran liczby od 1 do 10
        int i = 1;

        //nieskonczona petla - musimy recznie zdefiniowac w srodku warunek wyjscia
        while (true) {
            System.out.println(i);
            i += 1;

            if (i > 10) {
                //nie wykonuj juz pozostalych instrukcji w petli
                //i nie uruchamiaj juz kolejnej iteracji
                break;
            }

            //ta linia nie wykona sie juz w ostatniej iteracji petli
            //break przerwie wykonanie zanim program do niej dojdzie
            System.out.println("Wypisalem liczbe: " + (i - 1));
        }
    }
}
