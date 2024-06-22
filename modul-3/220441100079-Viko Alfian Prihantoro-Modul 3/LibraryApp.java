package javaapplication2;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    private final ArrayList<LibraryBook> bookList;

    public LibraryApp() {
        this.bookList = new ArrayList<>();
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Enter category (SU/D/R/A): ");
        String category = scanner.nextLine();

        System.out.print("Enter stock: ");
        int stock = scanner.nextInt();

        System.out.print("Enter year published: ");
        int yearPublished = scanner.nextInt();

        LibraryBook book = new LibraryBook(title, author, publisher, category, stock, yearPublished);
        bookList.add(book);
    }

    public void displayBookList() {
        for (LibraryBook book : bookList) {
            book.displayBookInfo();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LibraryApp libraryApp = new LibraryApp();

        Scanner scanner = new Scanner(System.in);
        int numBooks;

        System.out.print("Enter number of books to add: ");
        numBooks = scanner.nextInt();

        for (int i = 0; i < numBooks; i++) {
            libraryApp.addBook();
        }

        System.out.println("Book List:");
        libraryApp.displayBookList();
    }
}
