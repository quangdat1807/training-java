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

    private void add(int n1) {

        System.out.println("Number of book need import: ");
        n1 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            System.out.println("Number: " + (i + 1));
            bookService.inputBook();
        }

    }

    public void home() {
        int input, n1 = 0;
        boolean flag = true;
        do {
            System.out.println("\n1.Import info of book\n" + "2.Show imported books (sort by year publish)\n" + "3.Search books\n" + "Press any key to exit");
            System.out.println("Select:");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    this.add(n1);
                    break;
                case 2:
                    System.out.println("--Show and sort--");
                    System.out.printf("%-10s %-10s %-10s %-15s %-10s\n", "Bookname", "Author", "Producer", "Yearpublish", "Price");
                    bookService.sortBook();
                    break;
                case 3:
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
