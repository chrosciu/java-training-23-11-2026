package eu.chrost.day4.s7comparisons.task1.trainer;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    final private String name;
    final private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.grade < o.grade) {
            return 1;
        } else if (this.grade == o.grade) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Witek", 5),
                new Student("Marcin", 6),
                new Student("Agnieszka", 4),
                new Student("Radek", 3)
        };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
