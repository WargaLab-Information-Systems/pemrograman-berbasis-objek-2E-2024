/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        System.out.println("Masukkan judul buku");

        // Input data buku
        System.out.print("Jumlah buku yang akan dimasukkan: ");
        int jumlahB = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlahB; i++) {
            System.out.println("\nData buku ke-" + (i + 1));
            System.out.print("Judul buku : ");
            String judul = scanner.nextLine();

            System.out.print("Penulis buku : ");
            String penulis = scanner.nextLine();

            System.out.print("Penerbit buku : ");
            String penerbit = scanner.nextLine();

            System.out.print("Kategori (SU = Semua Umur, D = Dewasa, R = Remaja, A = Anak-anak) : ");
            String kategoriInput = scanner.nextLine();
            String kategori = null;
            while (true) {
                if (kategoriInput.equalsIgnoreCase("SU")){
                    kategori = "Semua umur";
                    break;
                } else if (kategoriInput.equalsIgnoreCase("D")){
                    kategori = "Dewasa";
                    break;
                } else if (kategoriInput.equalsIgnoreCase("R")){
                    kategori = "Remaja";
                    break;
                } else if (kategoriInput.equalsIgnoreCase("A")){
                    kategori = "Anak-anak";
                    break;
                } else {
                    System.out.println("Kategori tidak valid, masukkan lagi: ");
                    kategoriInput = scanner.nextLine();
                }
            }

            System.out.print("Stok buku yang tersedia : ");
            int stok = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Tahun terbit buku : ");
            String tahunT = scanner.nextLine();

            Buku buku = new Buku (judul, penulis, penerbit, kategori, stok, tahunT);
            daftarBuku.add(buku);
        }

        // Menampilkan daftar buku yang dipilih
        System.out.println("\n=====> Daftar buku yang telah dipilih <====");
        System.out.println("_______________________________________________");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println("\nBuku ke-" + (i + 1));
            daftarBuku.get(i).displayInfo();
        }

        scanner.close();
    }
}

