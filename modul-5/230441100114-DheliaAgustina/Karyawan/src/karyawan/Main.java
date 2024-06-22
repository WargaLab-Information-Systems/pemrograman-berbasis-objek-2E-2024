package karyawan;

import java.util.Scanner;
import karyawan.Karyawan;
import karyawan.karyawankontrak;
import karyawan.karyawantetap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama karyawan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan usia karyawan: ");
        int usia = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Masukkan jabatan karyawan: ");
        String jabatan = scanner.nextLine();

        System.out.print("Masukkan jenis karyawan (1. Tetap, 2. Kontrak): ");
        int jenisKaryawan = scanner.nextInt();
        scanner.nextLine(); 

        Karyawan karyawan;

        if (jenisKaryawan == 1) {
            System.out.print("Masukkan gaji bulanan: ");
            double gaji = scanner.nextDouble();
            karyawan = new karyawantetap(nama, usia, jabatan, (int) gaji);//memanggil
        } else if (jenisKaryawan == 2) {
            System.out.print("Masukkan upah per jam: ");
            double upahPerJam = scanner.nextDouble();
            System.out.print("Masukkan jam kerja: ");
            int jamKerja = scanner.nextInt();
            karyawan = new karyawankontrak(nama, usia, jabatan, (int) upahPerJam, jamKerja);
        } else {
            System.out.println("Jenis karyawan tidak valid!");
            scanner.close();
            return;
        }

        System.out.println("\nData Karyawan:");
        karyawan.tampilkanData();

        scanner.close();
    }
}
