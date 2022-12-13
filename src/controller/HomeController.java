package controller;

import model.Book;
import service.BookService;

import java.util.Scanner;

public class HomeController {
    static Scanner sc = new Scanner(System.in);
    static BookService bookService;

    public HomeController() {
        this.bookService = new BookService();
    }

    private void add(int n1, Book[] book) {
        System.out.println("1.Book \n" + "2.AptechBook\n" + "Press any key to back\n");
        int a1 = sc.nextInt();
        System.out.println("Number of book need import: ");
        switch (a1) {
            case 1:
                n1 = sc.nextInt();
                book = new Book[n1];
                for (int i = 0; i < n1; i++) {
                    System.out.println("Number: " + (i + 1));
                    book[i] = new Book();
                    bookService.inputBook();
                }
        }
    }

    public void home() {
        int input, n1 = 0;
        Book[] book = null;
        boolean flag = true;
        do {
            System.out.println("\n1.Import info of book\n" + "2.Show imported books\n" + "3.Sort by year publish\n" + "4.Search books\n" + "6.Thoát");
            System.out.println("Select:");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    this.add(n1, book);
                    break;
                case 2:
                    System.out.println("--Show imported books--");
                    System.out.printf("%-10s %-10s %-10s %-15s %-10s\n", "Bookname", "Author", "Producer", "Yearpublish", "Price");
                    bookService.inBook();
                    break;
                case 3:
                    System.out.println("--Sort by year publish--");
                    bookService.sortBook();
                    break;
                case 4:
                    bookService.searchBook();
                    break;
                default:
                    System.out.println("Exit");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
