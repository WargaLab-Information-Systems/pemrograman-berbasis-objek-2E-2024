/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

import java.util.Scanner;

public class Main {
    private static Karyawan[] karyawanArray = new Karyawan[10];
    private static int jumlahKaryawan = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Masukkan data karyawan:");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Posisi: ");
            String posisi = scanner.nextLine();
            System.out.print("Jenis Karyawan (1: Tetap, 2: Kontrak): ");
            int jenis = scanner.nextInt();

            if (jenis == 1) {
                System.out.print("Gaji Bulanan (Rupiah): ");
                double gajiBulanan = scanner.nextDouble();
                scanner.nextLine();
                tambahKaryawan(nama, usia, posisi, gajiBulanan);
            } else if (jenis == 2) {
                System.out.print("Upah Per Jam (Rupiah): ");
                double upahPerJam = scanner.nextDouble();
                System.out.print("Jumlah Jam Kerja: ");
                int jumlahJamKerja = scanner.nextInt();
                scanner.nextLine(); 
                tambahKaryawan(nama, usia, posisi, upahPerJam, jumlahJamKerja);
            } else {
                System.out.println("Jenis karyawan tidak valid.");
                continue;
            }

            System.out.print("Apakah Anda ingin menambah data karyawan lagi? (y/n): ");
            String lanjut = scanner.nextLine();
            if (!lanjut.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("\nData Karyawan yang Telah Dimasukkan:");
        for (int i = 0; i < jumlahKaryawan; i++) {
            karyawanArray[i].tampilkanData();
            System.out.println();
        }
    }

    public static void tambahKaryawan(String nama, int usia, String posisi, double gajiBulanan) {
        if (jumlahKaryawan < karyawanArray.length) {
            karyawanArray[jumlahKaryawan] = new KaryawanTetap(nama, usia, posisi, gajiBulanan);
            jumlahKaryawan++;
        } else {
            System.out.println("Array karyawan penuh!");
        }
    }

    public static void tambahKaryawan(String nama, int usia, String posisi, double upahPerJam, int jumlahJamKerja) {
        if (jumlahKaryawan < karyawanArray.length) {
            karyawanArray[jumlahKaryawan] = new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja);
            jumlahKaryawan++;
        } else {
            System.out.println("Array karyawan penuh!");
        }
    }
}