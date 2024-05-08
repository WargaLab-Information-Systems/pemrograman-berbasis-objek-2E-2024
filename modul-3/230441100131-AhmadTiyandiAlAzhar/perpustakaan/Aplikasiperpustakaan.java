/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Aplikasiperpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahBuku;

        System.out.print("Masukkan jumlah buku yang ingin dipinjam: ");
        jumlahBuku = scanner.nextInt();

        // Array untuk menyimpan objek Buku
        Buku[] koleksiBuku = new Buku[jumlahBuku];

        // Looping untuk memasukkan data buku
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nData Buku ke-" + (i + 1) + ";");
            System.out.print("Jenis Buku (Fiksi/Non-Fiksi): ");
            String jenisBuku = scanner.next();
            System.out.print("Judul: ");
            String judul = scanner.next();
            System.out.print("Penulis: ");
            String penulis = scanner.next();
            System.out.print("Penerbit: ");
            String penerbit = scanner.next();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.next();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();

            if (jenisBuku.equalsIgnoreCase("Fiksi")) {
                koleksiBuku[i] = new BukuFiksi(judul, penulis, penerbit, kategori, stok, tahunTerbit);
            } else if (jenisBuku.equalsIgnoreCase("Non-Fiksi")) {
                koleksiBuku[i] = new BukuNonFiksi(judul, penulis, penerbit, kategori, stok, tahunTerbit);
            } else {
                System.out.println("Jenis buku tidak valid!");
                i--; // Mengurangi i agar data buku yang salah tidak tersimpan
            }
        }

        // Menampilkan daftar buku
        System.out.println("\nDaftar Buku:");
        for (Buku buku : koleksiBuku) {
            if (buku instanceof BukuFiksi) {
                System.out.println("Jenis Buku: Fiksi");
            } else {
                System.out.println("Jenis Buku: Non-Fiksi");
            }
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Penulis: " + buku.getPenulis());
            System.out.println("Penerbit: " + buku.getPenerbit());
            System.out.println("Kategori: " + buku.getKategori());
            System.out.println("Stok: " + buku.getStok());
            System.out.println("Tahun Terbit: " + buku.getTahunTerbit());
            System.out.println();
        }
    }
}