/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class BukuPerpustakaan extends Perpustakaan {
    private List<Perpustakaan> daftarBuku;

    public BukuPerpustakaan(String judul, String penulis, String publisher, char kategori, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, kategori, stok, tahunTerbit);
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Perpustakaan buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        for (Perpustakaan buku : daftarBuku) {
            System.out.println("Judul: " + buku.getjudul());
            System.out.println("Penulis: " + buku.getpenulis());
            System.out.println("Publisher: " + buku.getpublisher());
            System.out.println("Kategori: " + buku.getkategori());
            System.out.println("Stok: " + buku.getstok());
            System.out.println("Tahun Terbit: " + buku.gettahunTerbit());
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BukuPerpustakaan perpustakaan = new BukuPerpustakaan("", "", "", ' ', 0, 0);
        boolean tambahBuku = true;

        while (tambahBuku) {
            // Input data buku dari user
            System.out.println("Masukkan data buku:");
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();
            System.out.print("Kategori (SU/Dewasa/Remaja/Anak): ");
            char kategori = scanner.nextLine().charAt(0);
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline dari buffer

            Perpustakaan buku = new Perpustakaan(judul, penulis, publisher, kategori, stok, tahunTerbit);
            perpustakaan.tambahBuku(buku);

            System.out.print("Tambahkan buku lagi? (Ya/Tidak): ");
            char pilihan = scanner.nextLine().charAt(0);
            tambahBuku = (pilihan == 'y' || pilihan == 'Y');
        }

        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.tampilkanDaftarBuku();
    }
}