package eu.chrost.day4.s7comparisons.task2.trainer;

import java.util.Arrays;
import java.util.Comparator;

class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

class YearComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYear() - o2.getYear();
    }
}

public class Book {
    final private String title;
    final private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Pierwsza", 1830),
                new Book("Druga", 1834),
                new Book("Trzecia", 1997),
                new Book("Czwarta", 1823)
        };

        System.out.println("Stan poczatkowy");

        for (Book book : books) {
            System.out.println(book);
        }

        Arrays.sort(books, new TitleComparator());

        System.out.println("Posortowane po tytule");

        for (Book book : books) {
            System.out.println(book);
        }

        Arrays.sort(books, new YearComparator());

        System.out.println("Posortowane po roku");

        for (Book book : books) {
            System.out.println(book);

        }
    }
}
