package eu.chrost.day3.s5static.task1.trainer;

public class Counter {
    private static int objectCount = 0;
    private final int id;

    public Counter() {
        objectCount++;
        this.id = objectCount;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public void print() {
        System.out.println("Counter{" + "id=" + id + '}');
    }

    public static void main(String[] args) {
        System.out.println(Counter.getObjectCount());

        Counter c1 = new Counter();
        c1.print();
        System.out.println(Counter.getObjectCount());

        Counter c2 = new Counter();
        c2.print();
        System.out.println(Counter.getObjectCount());

        Counter c3 = new Counter();
        c3.print();
        System.out.println(Counter.getObjectCount());
    }
}
