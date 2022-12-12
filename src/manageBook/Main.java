package manageBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void inputBook(Book book) {
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
    }

    static void inputAptech(AptechBook aptechBook) {
        System.out.println("nameBook: ");
        Scanner bookName = new Scanner(System.in);
        String name = bookName.nextLine();
        aptechBook.setBookName(name);

        System.out.println("nameAuthor: ");
        Scanner bookAuthor = new Scanner(System.in);
        String nameAuthor = bookAuthor.nextLine();
        aptechBook.setBookAuthor(nameAuthor);

        System.out.println("producer: ");
        Scanner producer = new Scanner(System.in);
        String Producer = producer.nextLine();
        aptechBook.setProducer(Producer);

        System.out.println("yearPublishing: ");
        aptechBook.setYearPublishing(sc.nextInt());
        sc.nextLine();

        System.out.println("price: ");
        aptechBook.setPrice(sc.nextInt());
        sc.nextLine();

        System.out.println("language: ");
        Scanner language = new Scanner(System.in);
        String Language = language.nextLine();
        aptechBook.setLanguage(Language);

        System.out.println("semester: ");
        aptechBook.setSemester(sc.nextInt());
        sc.nextLine();
    }

    public static void main(String[] args) {
        int input, n1 = 0, n2 = 0;
        String name;
        Book[] book = null;
        AptechBook[] aptechBook = null;
        List<Book> listBook = new ArrayList<>();
        List<AptechBook> listAptech = new ArrayList<>();
        boolean flag = true;
        do {

            System.out.println("\n1.Nhập thông tin sách\n" + "2.Hiển thị thông tin vừa nhập\n" + "3.Sắp xếp thông tin\n" + "4.Tìm kiếm theo tên sách\n" + "5.Tìm kiếm thông tin tác giả\n" + "6.Thoát");
            System.out.println("Mời chọn:");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("1.Book \n" + "2.AptechBook\n" + "Phim bat ki de tro ve\n");
                    int a1 = sc.nextInt();
                    System.out.println("So luong sach muon nhap: ");
                    switch (a1) {
                        case 1:
                            n1 = sc.nextInt();
                            book = new Book[n1];
                            for (int i = 0; i < n1; i++) {
                                System.out.println("Sach số: " + (i + 1));
                                book[i] = new Book();
                                inputBook(book[i]);
                                listBook.add(book[i]);
                            }
                            break;
                        case 2:
                            n2 = sc.nextInt();
                            aptechBook = new AptechBook[n2];
                            for (int i = 0; i < n2; i++) {
                                System.out.println("Sach số: " + (i + 1));
                                aptechBook[i] = new AptechBook();
                                inputAptech(aptechBook[i]);
                                listAptech.add(aptechBook[i]);
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("--Display--");
                    System.out.println("1.Book \n" + "2.AptechBook\n" + "Phim bat ky de tro ve\n");
                    int a2 = sc.nextInt();
                    switch (a2) {
                        case 1:
                            System.out.println("--Book--");
                            System.out.printf("%-10s %-10s %-10s %-15s %-10s\n", "Bookname", "Author", "Producer", "Yearpublish", "Price");
                            for (int i = 0; i < n1; i++) {
                                book[i].inBook();
                            }
                            break;
                        case 2:
                            System.out.println("--Book author--");
                            System.out.printf("%-10s %-10s %-10s %-15s %-10s %-10s %-10s\n", "Bookname", "Author", "Producer", "Yearpublish", "Price", "Language", "Semester");
                            for (int i = 0; i < n2; i++) {
                                aptechBook[i].inBook();
                            }
                            break;
                        default:
                            break;
                    }

                    break;
                case 3:
                    System.out.println("--Sắp xếp--");
                    System.out.println("1.Book \n" + "2.AptechBook\n" + "Phim bat ky de tro ve\n");
                    int a3 = sc.nextInt();
                    System.out.println("Tăng dần theo năm sản xuất: ");
                    switch (a3) {
                        case 1:
                            Collections.sort(listBook);
                            for (Book books : listBook) {
                                System.out.println(books);
                            }
                            break;
                        case 2:
                            Collections.sort(listAptech);
                            for (AptechBook aptech : listAptech) {
                                System.out.println(aptech);
                            }
                            break;
                        default:
                            break;
                    }

                    break;
                case 4:
                    System.out.println("--Tìm kiếm theo tên--");
                    System.out.println("1.Book \n" + "2.AptechBook\n" + "Phim bat ky de tro ve\n");
                    int a4 = sc.nextInt();
                    Scanner findName = new Scanner(System.in);
                    System.out.println("Nhap ten ban muon tim: ");
                    switch (a4) {
                        case 1:
                            name = findName.nextLine();
                            book = new Book[n1];
                            for (Book findBook: listBook) {
                                if(findBook.getBookName().indexOf(name)>=0) {
                                    System.out.println(findBook);
                                }
                            }
                            break;
                        case 2:
                            name = findName.nextLine();
                            aptechBook = new AptechBook[n2];
                            for (AptechBook find: listAptech) {
                                if(find.getBookName().indexOf(name)>=0) {
                                    System.out.println(find);
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("--Tìm kiếm theo tên tác giả--");
                    System.out.println("1.Book \n" + "2.AptechBook\n" + "Phim bat ky de tro ve\n");
                    int a5 = sc.nextInt();
                    Scanner findAuthor = new Scanner(System.in);
                    System.out.println("Nhap ten ban muon tim: ");
                    switch (a5) {
                        case 1:
                        name = findAuthor.nextLine();
                        book = new Book[n1];
                        for (Book findBook: listBook) {
                            if(findBook.getBookAuthor().indexOf(name)>=0) {
                                System.out.println(findBook);
                            }
                        }
                        break;
                    }
                    break;
                default:
                    System.out.println("Thoát");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
