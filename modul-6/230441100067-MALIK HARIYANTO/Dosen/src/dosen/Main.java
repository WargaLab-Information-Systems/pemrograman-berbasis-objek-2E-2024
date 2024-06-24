/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;
import java.util.Scanner;

public class Main {
    private static Dosen[] daftarDosen = new Dosen[100];
    private static int jumlahDosen = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Menambahkan Dosen Tetap");
            System.out.println("2. Menambahkan Dosen Tidak Tetap");
            System.out.println("3. Tampilkan Semua Daftar Dosen");
            System.out.println("4. Keluar Dari Program");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahDosenTetap(scanner);
                    break;
                case 2:
                    tambahDosenTidakTetap(scanner);
                    break;
                case 3:
                    tampilkanSemuaDosen();
                    break;
                case 4:
                    System.out.println("Anda Telah Keluar dari program, Terimakasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }

    private static void tambahDosenTetap(Scanner scanner) {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("masukkan nama universitas: ");
        String istansi = scanner.nextLine();
        System.out.print("NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Umur: ");
        int umur = scanner.nextInt();
        System.out.print("Jenis Kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);
        System.out.print("Gaji Pokok: ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Tunjangan: ");
        double tunjangan = scanner.nextDouble();
        scanner.nextLine(); 

        DosenTetap dosenTetap = new DosenTetap(nama, nik, umur, jenisKelamin, istansi, gajiPokok, tunjangan);
        daftarDosen[jumlahDosen] = dosenTetap;
        jumlahDosen++;
    }

    private static void tambahDosenTidakTetap(Scanner scanner) {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("NIK: ");
        String nik = scanner.nextLine();
        System.out.println("masukkan nama universitas: ");
        String istansi = scanner.nextLine();
        System.out.print("Umur: ");
        int umur = scanner.nextInt();
        System.out.print("Jenis Kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);
        System.out.print("Jam Mengajar: ");
        int jamMengajar = scanner.nextInt();
        System.out.print("Honor per Jam: ");
        double honorPerJam = scanner.nextDouble();
        scanner.nextLine();

        DosenTidakTetap dosenTidakTetap = new DosenTidakTetap(nama, nik, umur, jenisKelamin, istansi, jamMengajar, honorPerJam);
        daftarDosen[jumlahDosen] = dosenTidakTetap;
        jumlahDosen++;
    }

    private static void tampilkanSemuaDosen() {
        for (int i = 0; i < jumlahDosen; i++) {
            daftarDosen[i].tampilkanInfo();
            System.out.println();
        }
    }
}


