package manageBook;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Book implements Comparable<Book> {
    private String bookName;
    private String bookAuthor;
    private String producer;
    private int yearPublishing;
    private float price;

    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", producer='" + producer + '\'' +
                ", yearPublishing=" + yearPublishing +
                ", price=" + price +
                '}';
    }

    void inBook() {
        Locale localeVn = new Locale("vi", "VN");
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance(localeVn);
        String str2 = currencyEN.format(price);

        System.out.printf("%-10s %-10s %-10s %-15s %-10s\n", bookName, bookAuthor, producer, yearPublishing, str2);
    }

    @Override
    public int compareTo(Book o) {
        // TODO Auto-generated method stub
        if (getYearPublishing() == o.getYearPublishing()) {
            return 0;
        } else if (getYearPublishing() > o.getYearPublishing()) {
            return 1;
        } else {
            return -1;
        }
    }
}
