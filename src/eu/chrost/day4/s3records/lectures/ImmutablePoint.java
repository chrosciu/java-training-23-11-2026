package eu.chrost.day4.s3records.lectures;

import eu.chrost.day4.s2object.lectures.Point;

import java.util.Objects;

//slowo kluczowe final na poziomie klasy
//oznacza ze nie pozwalamy na dziedziczenie po tej klasie
public final class ImmutablePoint {
    private final double x;
    private final double y;

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ImmutablePoint that)) return false;
        return Double.compare(x, that.x) == 0 && Double.compare(y, that.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Point p1 = new Point(2.5, 3.5);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(2.5, 3.5);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("p1.equals(p2) -> " + p1.equals(p2));
        System.out.println("p1.equals(p3) -> " + p1.equals(p3));
    }
}
