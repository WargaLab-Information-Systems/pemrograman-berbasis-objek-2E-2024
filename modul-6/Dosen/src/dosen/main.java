/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosen;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen tetap: ");
        int jumlahDosenTetap = scanner.nextInt();
        DosenTetap[] dosenTetaps = new DosenTetap[jumlahDosenTetap];

        for (int i = 0; i < jumlahDosenTetap; i++) {
            System.out.println("Dosen Tetap " + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("NIK: ");
            String nik = scanner.next();
            System.out.print("Umur: ");
            int umur = scanner.nextInt();
            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelamin = scanner.next().charAt(0);
            System.out.print("Gaji Pokok: ");
            int gajiPokok = scanner.nextInt();
            System.out.print("Tunjangan: ");
            int tunjangan = scanner.nextInt();

            dosenTetaps[i] = new DosenTetap(nama, nik, umur, jenisKelamin, gajiPokok, tunjangan);
        }

        System.out.print("Masukkan jumlah dosen tidak tetap: ");
        int jumlahDosenTidakTetap = scanner.nextInt();
        DosenTidakTetap[] dosenTidakTetaps = new DosenTidakTetap[jumlahDosenTidakTetap];

        for (int i = 0; i < jumlahDosenTidakTetap; i++) {
            System.out.println("Dosen Tidak Tetap " + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("NIK: ");
            String nik = scanner.next();
            System.out.print("Umur: ");
            int umur = scanner.nextInt();
            System.out.print("Jenis Kelamin(L/P): ");
            char jenisKelamin = scanner.next().charAt(0);
            System.out.print("Jam Mengajar: ");
            int jamMengajar = scanner.nextInt();
            System.out.print("Honor per Jam: ");
            int honorPerJam = scanner.nextInt();

            dosenTidakTetaps[i] = new DosenTidakTetap(nama, nik, umur, jenisKelamin, jamMengajar, honorPerJam);
        }

        System.out.println("\nInformasi Dosen Tetap:");
        for (DosenTetap dosenTetap : dosenTetaps) {
            dosenTetap.tampilkanInfo();
            System.out.println();
        }

        System.out.println("Informasi Dosen Tidak Tetap:");
        for (DosenTidakTetap dosenTidakTetap : dosenTidakTetaps) {
            dosenTidakTetap.tampilkanInfo();
            System.out.println();
        }

        
    }
}
