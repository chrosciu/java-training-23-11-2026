package eu.chrost.day2.s3methods.task2.trainer;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(average(4.5, 7, 9));
        System.out.println(average());
    }


    public static double average(double... numbers) {
        if (numbers.length == 0) {
            return Double.NaN;
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
