/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package karyawan;
import java.util.Scanner;

/**
 *
 * @author Safira
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data karyawan:");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Usia: ");
        int usia = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Posisi: ");
        String posisi = scanner.nextLine();
        System.out.print("Jenis Karyawan (Tetap/Kontrak): ");
        String jenisKaryawan = scanner.nextLine();

        Karyawan karyawan;

        if (jenisKaryawan.equalsIgnoreCase("Tetap")) {
            System.out.print("Gaji Bulanan: ");
            int gajiBulanan = scanner.nextInt();
            karyawan = new KaryawanTetap(nama, usia, posisi, gajiBulanan);
        } else if (jenisKaryawan.equalsIgnoreCase("Kontrak")) {
            System.out.print("Upah Per Jam: ");
            int upahPerJam = scanner.nextInt();
            System.out.print("Jumlah Jam Kerja: ");
            int jumlahJamKerja = scanner.nextInt();
            karyawan = new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja);
        } else {
            System.out.println("Jenis karyawan tidak dikenal.");
            scanner.close();
            return;
        }

        System.out.println("\nData Karyawan:");
        karyawan.tampilkanData();

        scanner.close();
    }
}
