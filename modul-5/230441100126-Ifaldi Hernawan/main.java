/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5praktikum;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<karyawan> karyawanList = new ArrayList<>();

        while (true) {
            System.out.println("Masukkan Data Karyawan!");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Usia: ");
            int usia = Integer.parseInt(scanner.nextLine());
            System.out.print("Posisi: ");
            String posisi = scanner.nextLine();
            System.out.print("Jenis Karyawan (Tetap/Kontrak): ");
            String jenisKaryawan = scanner.nextLine();

            if (jenisKaryawan.toLowerCase().equals("tetap")) {
                System.out.print("Gaji Bulanan: ");
                double gajiBulanan = Double.valueOf(scanner.nextLine());
                karyawanList.add(new karyawanTetap(nama, usia, posisi, gajiBulanan));
            } else if (jenisKaryawan.toLowerCase().equals("kontrak")) {
                System.out.print("Upah per Jam: ");
                double upahPerJam = Double.valueOf(scanner.nextLine());
                System.out.print("Jumlah Jam Kerja: ");
                int jumlahJamKerja = Integer.parseInt(scanner.nextLine());
                karyawanList.add(new karyawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja));
            } else {
                System.out.println("Jenis karyawan tidak valid!");
            }

            System.out.print("Apakah ingin menambah karyawan lain? (yes/no): ");
            String lanjut = scanner.nextLine();
            if (!lanjut.toLowerCase().equals("yes")) {
                break;
            }
        }

        System.out.println("\nData Karyawan:");
        for (karyawan karyawan : karyawanList) {
            karyawan.tampilkanData();
            System.out.println();
        }

        scanner.close();
    }
}
