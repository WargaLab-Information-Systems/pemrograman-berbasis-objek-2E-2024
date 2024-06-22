/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.util.Scanner;

public class Perpustakaan {
    private static Scanner scanner = new Scanner(System.in);

    public static Buku inputBuku() {
        System.out.println("Masukkan data buku:");
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Kategori (SU/D/R/A): ");
        String kategori = scanner.nextLine();
        System.out.print("Stok: ");
        int stok = scanner.nextInt();
        System.out.print("Tahun Terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine(); 
        
        switch (kategori) {
            case "D":
                return new BukuDewasa(judul, penulis, publisher, stok, tahunTerbit);
            case "R":
                return new BukuRemaja(judul, penulis, publisher, stok, tahunTerbit);
            case "A":
                return new BukuAnakAnak(judul, penulis, publisher, stok, tahunTerbit);
            case "SU":
                return new BukuSemuaUmur(judul, penulis, publisher, stok, tahunTerbit);
            default:
                System.out.println("Kategori tidak valid.");
                return null;
        }
    }

    public static void displayDaftarBuku(Buku[] bukuList) {
        System.out.println("=====================");
        System.out.println("Daftar Buku:");
        for (Buku buku : bukuList) {
            if (buku != null) {
                buku.displayInfo();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah buku yang ingin dimasukkan: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine(); 

        Buku[] daftarBuku = new Buku[jumlahBuku];

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nBuku ke-" + (i + 1));
            daftarBuku[i] = inputBuku();
        }

        displayDaftarBuku(daftarBuku);
    }
}
