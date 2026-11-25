package eu.chrost.day3.s4references.lectures;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void print() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}
