/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buku;
import java.util.Scanner;
import java.util.ArrayList

/**
 *
 * @author Ridho
 */
public class Hasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Buku> listBuku = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah buku : ");
        int jumlahBuku = sc.nextInt();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("==========");
            System.out.println("Buku ke-" + (i + 1) + ": ");
            System.out.println("==========");
            System.out.print("Pilih kategori (A/R/D/SU): ");
            String kategori = sc.next();

            Buku buku = null;
            switch (kategori) {
                case "A" -> buku = new BukuAnak();
                case "R" -> buku = new BukuRemaja();
                case "D" -> buku = new BukuDewasa();
                case "SU" -> buku = new BukuSemuaUmur();
                default -> System.out.println("Kategori buku tidak valid!");
                
            }
            if (buku != null) {
                listBuku.add(buku);
            }
            
            System.out.println();
        }
        System.out.println("=====================");
        System.out.println("Bagian Daftar Buku");
        System.out.println("=====================");
        for (Buku buku : listBuku) {
            buku.tampilan();
            System.out.println();
        }
    }
    
}
