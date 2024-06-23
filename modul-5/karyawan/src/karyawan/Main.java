/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package karyawan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Berapa banyak karyawan yang ingin Anda masukkan?");
        int jumlahKaryawan = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("Masukkan nama karyawan:");
            String nama = scanner.nextLine();

            System.out.println("Masukkan usia karyawan:");
            int usia = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Masukkan posisi karyawan:");
            String posisi = scanner.nextLine();

            System.out.println("Masukkan jenis karyawan (Tetap/Kontrak):");
            String jenis = scanner.nextLine();

            if (jenis.equalsIgnoreCase("Tetap")) {
                System.out.println("Masukkan gaji bulanan:");
                int gajiBulanan = scanner.nextInt();
                scanner.nextLine(); 
                daftarKaryawan.add(new karyawantetap(nama, usia, posisi, gajiBulanan));
            } else if (jenis.equalsIgnoreCase("Kontrak")) {
                System.out.println("Masukkan upah per jam:");
                int upahPerJam = scanner.nextInt();

                System.out.println("Masukkan jumlah jam kerja:");
                int jumlahJamKerja = scanner.nextInt();
                scanner.nextLine(); 
                daftarKaryawan.add(new karyawankontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja));
            } else {
                System.out.println("Jenis karyawan tidak valid. Data tidak ditambahkan.");
                i--; 
            }
        }

        System.out.println("\nData Semua Karyawan:");
        for (Karyawan karyawan : daftarKaryawan) {
            karyawan.tampilkanData();
            System.out.println();
        }
    }
}



  
