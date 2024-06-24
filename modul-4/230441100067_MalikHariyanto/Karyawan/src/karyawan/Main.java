/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;
    import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Masukkan nama karyawan: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan usia karyawan: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Masukkan posisi karyawan: ");
            String posisi = scanner.nextLine();

            System.out.print("Masukkan jenis karyawan (1 = Tetap, 2 = Kontrak): ");
            int jenisKaryawan = scanner.nextInt();
            scanner.nextLine(); 

            if (jenisKaryawan == 1) {
                System.out.print("Masukkan gaji bulanan: ");
                double gajiBulanan = scanner.nextDouble();
                scanner.nextLine(); 

                Karyawan karyawan = new KaryawanTetap(nama, usia, posisi, gajiBulanan);
                karyawan.tampilkanData();
            } else if (jenisKaryawan == 2) {
                System.out.print("Masukkan upah per jam: ");
                double upahPerJam = scanner.nextDouble();

                System.out.print("Masukkan jumlah jam kerja: ");
                int jumlahJamKerja = scanner.nextInt();
                System.out.println("gaji : "+upahPerJam+jumlahJamKerja);
                scanner.nextLine();

                Karyawan karyawan = new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja);
                karyawan.tampilkanData();
            } else {
                System.out.println("Jenis karyawan tidak valid.");
                continue;
            }

            System.out.print("Apakah Anda ingin menambah data karyawan lagi? (y/t): ");
            String lanjut = scanner.nextLine();
            if (!lanjut.equalsIgnoreCase("y")) {
                break;
            }
        }

        scanner.close();
    }
}

