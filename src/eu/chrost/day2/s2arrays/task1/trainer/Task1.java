package eu.chrost.day2.s2arrays.task1.trainer;

public class Task1 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5};

        int suma = 0;

        for (int element : tab) {
            suma = suma + element;
        }

        System.out.println("Suma : " + suma);
    }

}
