package eu.chrost.day2.s1loops.lectures;

public class Continue {
    public static void main(String[] args) {
        //wypisz na ekran liczby od 1 do 10 ale z pominieciem 7
        int k = 0;
        while (k < 10) {
            k += 1;

            //opcja 1 - z if
//            if (k != 7) {
//                System.out.println(k);
//            }

            //opcja 2 - instrukcja continue przerywajaca dzialanie
            //aktualnej iteracji w petli
            if (k == 7) {
                //przerwij aktualna iteracje petli
                //i od razu rozpocznij kolejna
                continue;
            }
            System.out.println(k);
        }
    }
}
