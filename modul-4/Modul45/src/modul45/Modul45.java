/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul45;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JOIS
 */
public class Modul45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Karyawan> karyawanList = new ArrayList<>();

        while (true) {
            System.out.println("===== Masukkan Data Karyawan =====");
            System.out.print("Nama Karyawan : ");
            String nama = scanner.nextLine();

            System.out.print("Usia Karyawan : ");
            int usia = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Posisi Karyawan : ");
            String posisi = scanner.nextLine();

            System.out.print("Jenis Karyawan (1. Tetap, 2. Kontrak): ");
            int jenisKaryawan = scanner.nextInt();

            if (jenisKaryawan == 1) {
                System.out.print("Gaji Bulanan : ");
                double gajiBulanan = scanner.nextDouble();
                scanner.nextLine();  

                Karyawan karyawan = new KaryawanTetap(nama, usia, posisi, gajiBulanan);
                karyawanList.add(karyawan);
            } else if (jenisKaryawan == 2) {
                System.out.print("Upah per Jam : ");
                double upahPerJam = scanner.nextDouble();

                System.out.print("Jumlah Jam Kerja : ");
                int jumlahJamKerja = scanner.nextInt();
                scanner.nextLine();  

                Karyawan karyawan = new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja);
                karyawanList.add(karyawan);
            } else {
                System.out.println("Jenis karyawan tidak valid!");
            }

            System.out.print("Apakah Anda ingin menambahkan karyawan lagi? (y/n): ");
            String lagi = scanner.nextLine();
            if (!lagi.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("\nData Karyawan :");
        for (Karyawan karyawan : karyawanList) {
            karyawan.tampilkanData();
            System.out.println();
        }
        scanner.close();
    }
}

