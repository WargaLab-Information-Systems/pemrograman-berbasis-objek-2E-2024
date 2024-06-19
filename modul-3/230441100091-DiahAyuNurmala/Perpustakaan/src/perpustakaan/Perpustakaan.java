/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;

    public Perpustakaan() {
        daftarBuku = new Buku[100];  // Menggunakan ukuran tetap 100
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Perpustakaan penuh, tidak bisa menambah buku lagi.");
        }
    }

    public void lihatDaftarBuku() {
        System.out.println("\nDaftar Buku:");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].info();
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan data buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.next() + scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.next() + scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.next() + scanner.nextLine();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            System.out.print("jumlah Halaman: ");
            int jumlahHalaman = scanner.nextInt();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.next();

            Buku buku;
            switch (kategori.toUpperCase()) {
                case "SU":
                    buku = new BukuSemuaUmur(judul, penulis, publisher, stok, tahunTerbit, jumlahHalaman);
                    break;
                case "D":
                    buku = new BukuDewasa(judul, penulis, publisher, stok, tahunTerbit, jumlahHalaman);
                    break;
                case "R":
                    buku = new BukuRemaja(judul, penulis, publisher, stok, tahunTerbit, jumlahHalaman);
                    break;
                case "A":
                    buku = new BukuAnakAnak(judul, penulis, publisher, stok, tahunTerbit, jumlahHalaman);
                    break;
                default:
                    System.out.println("Maaf, kategori tidak tersedia.");
                    continue;  // Skip adding this book and move to the next iteration
            }

            perpustakaan.tambahBuku(buku);
        }

        System.out.println("\n=== Daftar Buku yang Telah Dimasukkan ===");
        perpustakaan.lihatDaftarBuku();
    }
}