package eu.chrost.day2.s3methods.task1.trainer;

public class Task1 {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;

        int sum = add(i, j);
        System.out.println(sum);

        double x = 2.5;
        double y = 4.8;
        double sum2 = add(x, y);
        System.out.println(sum2);

        //da sie zawolac metode add z mieszanymi typami argumentow
        //(jeden typu int, drugi typu double)
        //w takiej sytuacji kompilator dopasuje te metode
        //w jakiej sa najszersze mozliwe argumenty
        //w tym przypadku bedzie to (double, double)
        double sum3 = add(i, x);
        System.out.println(sum3);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}


