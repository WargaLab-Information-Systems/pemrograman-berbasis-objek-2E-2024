/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;
import java.util.ArrayList;
import java.util.Scanner;


public class Perpustakaan {
    private final ArrayList<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void lihatDaftarBuku() {
        System.out.println("\nDaftar Buku:");
        for (Buku buku : daftarBuku) {
            buku.info();
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        System.out.println("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan data buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.next();
            System.out.print("Penulis: ");
            String penulis = scanner.next();
            System.out.print("Publisher: ");
            String publisher = scanner.next();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.next();

            Buku buku;
            buku = switch (kategori.toUpperCase()) {
                case "SU" -> new BukuSemuaUmur(judul, penulis, publisher, stok, tahunTerbit);
                case "D" -> new BukuDewasa(judul, penulis, publisher, stok, tahunTerbit);
                case "R" -> new BukuRemaja(judul, penulis, publisher, stok, tahunTerbit);
                case "A" -> new BukuAnakAnak(judul, penulis, publisher, stok, tahunTerbit);
                default -> new Buku(judul, penulis, publisher, stok, tahunTerbit);
            };

            perpustakaan.tambahBuku(buku);
        }

        System.out.println("\n=== Daftar Buku yang Telah Dimasukkan ===");
        perpustakaan.lihatDaftarBuku();
    }
   }
    

