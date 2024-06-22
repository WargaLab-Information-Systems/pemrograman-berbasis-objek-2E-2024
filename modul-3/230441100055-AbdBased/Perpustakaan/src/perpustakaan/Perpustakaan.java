/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AbasZ
 */
public class Perpustakaan {

    public static void main(String[] args) {
        ArrayList<Buku> listBuku = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Buku :");
        int jumlahBuku = sc.nextInt();
        
        for (int i = 0; i < jumlahBuku; i++){
            System.out.println("-----------------");
            System.out.println("Buku ke-" + (i + 1) + ": ");
            System.out.println("-----------------");
            
            // Menampilkan keterangan kategori buku
            System.out.println("------------------------------------");
            System.out.println("Keterangan Kategori Buku :");
            System.out.println("SU : Semua Umur");
            System.out.println("D : Dewasa");
            System.out.println("R : Remaja");
            System.out.println("A : Anak-anak");
            System.out.println("------------------------------------");
            
            // Loop untuk meminta kategori buku yang valid
            String kategori;
            Buku buku = null;
            do {
                System.out.println("Pilih Kategori Buku (SU/D/R/A) :");
                kategori = sc.next();
                
                switch (kategori){
                    case "SU" -> buku = new Kategori_Buku.BukuSemuaUmur();
                    case "D" -> buku = new Kategori_Buku.BukuDewasa();
                    case "R" -> buku = new Kategori_Buku.BukuRemaja();
                    case "A" -> buku = new Kategori_Buku.BukuAnak();
                    default -> System.out.println("Kategori Buku Tidak Valid! Silakan coba lagi.");
                }
            } while (buku == null);
            
            listBuku.add(buku);
            System.out.println();
        }
        
        System.out.println("------------------------------------");
        System.out.println("Daftar Buku");
        System.out.println("------------------------------------");
        for (Buku buku : listBuku){
            buku.display();
            System.out.println("------------------------------------");
            System.out.println();
        }
    }
}
