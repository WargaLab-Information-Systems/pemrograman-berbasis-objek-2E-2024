/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyek;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Proyek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Karyawan[] karyawanArray = new Karyawan[100];
        int jumlahKaryawan = 0;

        while (true) {
            System.out.println("\nMasukkan jenis karyawan: ");
            System.out.println("1. Karyawan Tetap");
            System.out.println("2. Karyawan Kontrak");
            System.out.println("3. Keluar dan tampilkan data karyawan");
            System.out.print("Pilih nomor: ");
            int jenisKaryawan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (jenisKaryawan == 3) {
                break;
            } else if (jenisKaryawan != 1 && jenisKaryawan != 2) {
                System.out.println("Pilihan tidak valid, silakan pilih nomor 1/2/3.");
                continue;  
            }

            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Masukkan posisi: ");
            String posisi = scanner.nextLine();

            if (jenisKaryawan == 1) {
                System.out.print("Masukkan gaji bulanan: ");
                int gajiBulanan = scanner.nextInt();
                scanner.nextLine();  
                System.out.print("Masukkan jenis kelamin (P/L): ");
                String jeniskelamin = scanner.nextLine();
                scanner.nextLine(); 
                karyawanArray[jumlahKaryawan++] = new KaryawanTetap(nama, usia, posisi, gajiBulanan, jeniskelamin);
            } else if (jenisKaryawan == 2) {
                System.out.print("Masukkan upah per jam: ");
                int upahPerJam = scanner.nextInt();
                System.out.print("Masukkan jumlah jam kerja: ");
                int jumlahJamKerja = scanner.nextInt();
                scanner.nextLine();  
                System.out.print("Masukkan jenis kelamin (P/L): ");
                String jeniskelamin = scanner.nextLine();
                scanner.nextLine(); 
                karyawanArray[jumlahKaryawan++] = new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja, jeniskelamin);
            }
        }

        System.out.println("\nData Karyawan:");
        for (int i = 0; i < jumlahKaryawan; i++) {
            karyawanArray[i].tampilkanData();
            System.out.println();
        }
    }
}
