/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih tipe dosen:");
        System.out.println("1. Dosen Tetap");
        System.out.println("2. Dosen Tidak Tetap");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 

        if (pilihan == 1) {
            System.out.println("Input data Dosen Tetap:");
            System.out.print("Nama: ");
            String namaTetap = scanner.nextLine();
            System.out.print("NIK: ");
            String nikTetap = scanner.nextLine();
            System.out.print("Umur: ");
            int umurTetap = scanner.nextInt();
            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelaminTetap = scanner.next().charAt(0);//mengambil karakter pertama
            System.out.print("Gaji Pokok: ");
            double gajiPokok = scanner.nextDouble();
            System.out.print("Tunjangan: ");
            double tunjangan = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("instansi:");
            String instansiTetap = scanner.nextLine();

            DosenTetap dosenTetap = new DosenTetap(namaTetap, nikTetap, umurTetap, jenisKelaminTetap, gajiPokok, tunjangan,instansiTetap);//memanggil
            dosenTetap.tampilkanInfo();//memanggil method
        } else if (pilihan == 2) {
            System.out.println("Input data Dosen Tidak Tetap:");
            System.out.print("Nama: ");
            String namaTidakTetap = scanner.nextLine();
            System.out.print("NIK: ");
            String nikTidakTetap = scanner.nextLine();
            System.out.print("Umur: ");
            int umurTidakTetap = scanner.nextInt();
            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelaminTidakTetap = scanner.next().charAt(0);//mengambil karakter pertama
            System.out.print("Jam Mengajar: ");
            int jamMengajar = scanner.nextInt();
            System.out.print("Honor Per Jam: ");
            double honorPerjam = scanner.nextDouble();
            System.out.print("instansi:");
            String instansi = scanner.nextLine();

            DosenTidakTetap dosenTidakTetap = new DosenTidakTetap(namaTidakTetap, nikTidakTetap, umurTidakTetap, jenisKelaminTidakTetap, jamMengajar, honorPerjam, instansi);
            dosenTidakTetap.tampilkanInfo();//method
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}

    



