package service;

import model.Book;

import java.text.NumberFormat;
import java.util.*;

public class BookService {
    List<Book> bookList = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);
    public void inputBook() {
        Book book = new Book();
        System.out.println("nameBook: ");
        Scanner bookName = new Scanner(System.in);
        String name = bookName.nextLine();
        book.setBookName(name);

        System.out.println("nameAuthor: ");
        Scanner bookAuthor = new Scanner(System.in);
        String author = bookAuthor.nextLine();
        book.setBookAuthor(author);

        System.out.println("producer: ");
        Scanner producer = new Scanner(System.in);
        String Producer = producer.nextLine();
        book.setProducer(Producer);

        System.out.println("yearPublishing: ");
        book.setYearPublishing(sc.nextInt());
        sc.nextLine();
        System.out.println("price: ");
        book.setPrice(sc.nextInt());
        sc.nextLine();
        bookList.add(book);
    }
    public void inBook() {
        List<Book> books = bookList;
        Locale localeVn = new Locale("vi", "VN");
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance(localeVn);
        for (Book book: books) {
            String price = currencyEN.format(book.getPrice());
            String bookName = book.getBookName();
            String bookAuthor = book.getBookAuthor();
            String producer = book.getProducer();
            int yearPublishing = book.getYearPublishing();
            System.out.printf("%-10s %-10s %-10s %-15s %-10s\n", bookName, bookAuthor, producer, yearPublishing, price);
        }
    }
    public void sortBook(){
        List<Book> sortBook = bookList;
        Collections.sort(sortBook);
        for (Book books : sortBook) {
            System.out.println(books);
        }
    }

    public void searchBook() {
        List<Book> searchBook = bookList;
        int input = 0;
        System.out.println("--Search--");
        System.out.println("1.Search by name \n" + "2.Search by author\n" + "Press any key to back\n");
        input = sc.nextInt();
        if(input == 1) {
            Scanner findName = new Scanner(System.in);
            System.out.println("Search by name: ");
            String name = findName.nextLine();

            for (Book findBook : searchBook) {
                if (findBook.getBookName().indexOf(name) >= 0) {
                    System.out.println(findBook);
                }
            }
        }else if(input == 2) {
            Scanner findName = new Scanner(System.in);
            System.out.println("Search by author: ");
            String name = findName.nextLine();

            for (Book findBook : searchBook) {
                if (findBook.getBookAuthor().indexOf(name) >= 0) {
                    System.out.println(findBook);
                }
            }
        }
    }

}
