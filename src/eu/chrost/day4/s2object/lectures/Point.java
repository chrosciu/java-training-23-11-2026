package eu.chrost.day4.s2object.lectures;

import java.util.Objects;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point point)) return false;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Point p1 = new Point(2.5, 3.5);
        System.out.println(p1);

        Point p2 = new Point(2.5, 3.5);
        Point p3 = new Point(1, 2);

        Point p4 = p1;

        //chce porownac ze soba punkty
        //zalozmy ze z biznesowego punktu widzenia
        //dwa punkty o tych samych wspolrzednych
        //powinny byc sobie rowne

        //jezeli porownujemy dwa obiekty za pomoca operatora ==
        //to porownywane jest wtedy to czy obie referencje wskazuja
        //na ten sam obiekt w pamieci
        System.out.println("p1 == p2 : " + (p1 == p2));
        System.out.println("p1 == p4 : " + (p1 == p4));

        //obiekty biznesowo mozna porownywac tylko za pomoca
        //metody equals()
        //natomiast trzeba wziac pod uwage ze jej domyslna wersja
        //tez dziala jak operator ==
        //wiec musimy ja nadpisac zeby dalo sie z tego skorzystac
        System.out.println("p1.equals(p2) : " + (p1.equals(p2)));
        System.out.println("p1.equals(p3) : " + (p1.equals(p3)));
        System.out.println("p1.equals(p4) : " + (p1.equals(p4)));

    }

    private static String toString(Object obj) {
        //operator 3 stanowy pozwala na przypisanie jedenj z dwoch wartosci
        //w zaleznosci od tego czy warunek jest prawdziwy (wartosc 1) czy falszywy (wartosc 2)
        return (obj == null) ? "null" : obj.toString();
    }
}
