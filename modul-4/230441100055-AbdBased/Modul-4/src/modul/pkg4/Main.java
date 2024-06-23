/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul.pkg4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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
            int usia = Integer.parseInt(scanner.nextLine());

            System.out.print("Posisi Karyawan : ");
            String posisi = scanner.nextLine();

            System.out.print("Jenis Karyawan (1. Tetap, 2. Kontrak): ");
            int jenisKaryawan = Integer.parseInt(scanner.nextLine());

            if (jenisKaryawan == 1) {
                System.out.print("Apakah Anda ingin memasukkan detail gaji bulanan? (y/n): ");
                String inputGaji = scanner.nextLine();
                if (inputGaji.equalsIgnoreCase("y")) {
                    System.out.print("Gaji Bulanan : ");
                    double gajiBulanan = Double.parseDouble(scanner.nextLine());
                    karyawanList.add(new KaryawanTetap(nama, usia, posisi, gajiBulanan));
                } else {
                    karyawanList.add(new KaryawanTetap(nama, usia, posisi));
                }
            } else if (jenisKaryawan == 2) {
                System.out.print("Apakah Anda ingin memasukkan detail upah per jam dan jumlah jam kerja? (y/n): ");
                String inputDetail = scanner.nextLine();
                if (inputDetail.equalsIgnoreCase("y")) {
                    System.out.print("Upah per Jam : ");
                    double upahPerJam = Double.parseDouble(scanner.nextLine());

                    System.out.print("Jumlah Jam Kerja : ");
                     int jumlahJamKerja = Integer.parseInt(scanner.nextLine());

                    karyawanList.add(new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja));
                } else {
                    karyawanList.add(new KaryawanKontrak(nama, usia, posisi));
                }
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