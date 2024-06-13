/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah buku yang ingin dimasukkan: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine();
                

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Masukkan detail buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Penerbit: ");
            String penerbit = scanner.nextLine();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.nextLine();

            Buku buku = BukuFactory.createBuku(judul, penulis, penerbit, stok, tahunTerbit, kategori);
            
            System.out.println("\nDetail buku:");
            buku.displayInfo();
            System.out.println();
        }
    }
}
