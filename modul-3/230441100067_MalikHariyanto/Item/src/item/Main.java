/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package item;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.print("Masukkan jumlah buku yang ingin di-entri: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Masukkan data buku ke-" + (i + 1));

            System.out.print("Judul: ");
            String judul = scanner.nextLine();

            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();

            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();

            System.out.print("Kategori (SU = Semua Umur, D = Dewasa, R = Remaja, A = Anak-anak): ");
            String kategori = scanner.nextLine();

            System.out.print("Stok: ");
            int stok = scanner.nextInt();

            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine(); 

            Book book = new Book(judul, penulis, publisher, kategori, stok, tahunTerbit);
            library.addItem(book);
        }

        System.out.println("\nDaftar buku yang telah di-entri:");
        library.listItems();

        scanner.close();
    }
}

