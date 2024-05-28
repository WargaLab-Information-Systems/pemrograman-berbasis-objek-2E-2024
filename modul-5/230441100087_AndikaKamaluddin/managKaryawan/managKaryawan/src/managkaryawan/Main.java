/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managkaryawan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USEr
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
        
         while (true) {
            System.out.println("masukkan data karyawan:");
            System.out.print("nama: ");
            String nama = scanner.nextLine();
            System.out.print("usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("posisi: ");
            String posisi = scanner.nextLine();
            int jenis;


            while (true) {
                System.out.print("Jenis karyawan (1: tetap, 2: kontrak): ");
                jenis = scanner.nextInt();
                scanner.nextLine();

                switch (jenis) {
                    case 1 -> {
                        System.out.print("Gaji bulanan: ");
                        double gajiBulanan = scanner.nextDouble();
                        scanner.nextLine();
                        Karyawan karyawanTetap = new KaryawanTetap(nama, usia, posisi, gajiBulanan);
                        daftarKaryawan.add(karyawanTetap);
                            }
                    case 2 -> {
                        System.out.print("Upah per jam: ");
                        double upahPerJam = scanner.nextDouble();
                        System.out.print("Jumlah jam kerja: ");
                        int jumlahJamKerja = scanner.nextInt();
                        scanner.nextLine();
                        Karyawan karyawanKontrak = new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja);
                        daftarKaryawan.add(karyawanKontrak);
                            }
                    default -> {
                        System.out.println("Jenis karyawan tidak valid, silahkan menginputkan kembali sesuai nomor diatas");
                        continue;
                            }
                }
                break;
            }
            System.out.print("ingin menginput karyawan lagi??? (y/n): ");
            String jawab = scanner.nextLine();
            if (jawab.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("\ndata karyawan:");
        for (Karyawan karyawan : daftarKaryawan) {
            karyawan.tampilkanData();
            System.out.println();
        }

        scanner.close();

    }
}
