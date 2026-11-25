package eu.chrost.day3.s2visibility.lectures.sub;

//klasy z innych pakietow musza byc wprost zaimportowane jesli chcemy ich tu uzyc
import eu.chrost.day3.s2visibility.lectures.Point;

//tego nie da sie zaimportowac - nie ma widocznosci publicznej tylko pakietowa
//import eu.chrost.day3.s2visibility.lectures.PackagePoint;

public class SubMain {
    public static void main(String[] args) {
        Point p1 = new Point(2.5, 3.5);

        //pole x ma widocznosc pakietowa wiec nie da sie do niego dostac z innego pakietu.
        //System.out.println(p1.x);


    }
}
