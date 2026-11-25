package eu.chrost.day3.s5static.task2.trainer;

public class Calculator {
    public static final double PI = 3.14159;
    public static final double E =  2.71828;

    public static double add(double a,double b ){
        return a + b;
    }

    public static double subtract(double a,double b ){
        return a - b;
    }

    public static double multiply(double a,double b ){
        return a * b;
    }

    public static double divide(double a,double b ){
        return a / b;
    }

    public static double circleArea(double r) {
        return multiply(2, multiply(PI, r));
    }

    private Calculator() {}

    public static void main(String[] args) {
        System.out.println("Dodawanie : " + add(PI,E));
        System.out.println("Pole koła : " + circleArea(3));
    }
}
