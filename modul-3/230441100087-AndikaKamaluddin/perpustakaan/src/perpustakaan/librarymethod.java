/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.util.Scanner;

/**
 *
 * @penulis ASUS
 */
public class librarymethod extends Buku {
    private static final int MAX_BOOKS = 5;
    public Scanner scanner;
    public Buku[] books;
    private int numBooks;

public librarymethod(String judul, String penulis, String publisher, String kategori, int stok, int tahun, Scanner scanner) {
        super(judul, penulis, publisher, kategori, stok, tahun);
        this.scanner = scanner;
        this.books = new Buku[MAX_BOOKS];
        this.numBooks = 0;
    }

    public void run() {
        System.out.println("Selamat datang di peron(perpustakaan online)!");

        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> displayAllBooks();
                case 3 -> System.out.println("Terimakasih telah menggunakan si peron! :)");
                default -> System.out.println("Pilih sesuai nomor yang ada !!! ");
            }
        } while (choice != 3);
    }

    private void displayMenu() {
        System.out.println("\nMenu perpus:");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Display semua buku");
        System.out.println("3. Keluar");
        System.out.print("Silahkan masukkan pilihan anda: ");
    }

    private void addBook() {
        if (numBooks < MAX_BOOKS) {
            Buku book = input.getInput(scanner);
            books[numBooks] = book;
            numBooks++;
            System.out.println("Buku berhasil ditambah !");
        } else {
            System.out.println("Perpus sudah full, anda tidak dapat menambah buku lagi !!!");
        }
    }

    private void displayAllBooks() {
        System.out.println("\nList Buku:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println("\nBuku " + (i + 1) + ":");
            System.out.println(books[i]);
        }
    }
}



