/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul.pkg6;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author AbasZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Dosen> daftarDosen = new ArrayList<>();
        boolean running = true;

        while (running) {

            System.out.println("----------------------");
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Dosen");
            System.out.println("2. Tampilkan Dosen");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilihanMenu = scanner.nextInt();
            System.out.println("----------------------");
            scanner.nextLine();  

            switch (pilihanMenu) {
                case 1:
                    tambahDosen(scanner, daftarDosen);
                    break;
                case 2:
                    tampilkanMenuDosen(scanner, daftarDosen);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }

        scanner.close();
    }

    // Fungsi untuk menambah dosen
    public static void tambahDosen(Scanner scanner, ArrayList<Dosen> daftarDosen) {
        boolean adding = true;

        while (adding) {
            System.out.println("----------------------");
            System.out.println("Pilih jenis dosen:");
            System.out.println("1. Dosen Tetap");
            System.out.println("2. Dosen Tidak Tetap");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            System.out.println("----------------------");
            scanner.nextLine(); 

            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIK: ");
            String nik = scanner.nextLine();
            System.out.print("Masukkan umur: ");
            int umur = scanner.nextInt();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = scanner.next().charAt(0);

            if (pilihan == 1) {
                System.out.print("Masukkan gaji pokok: ");
                double gajiPokok = scanner.nextDouble();
                System.out.print("Masukkan tunjangan: ");
                double tunjangan = scanner.nextDouble();
                DosenTetap dosenTetap = new DosenTetap(nama, nik, umur, jenisKelamin, gajiPokok, tunjangan);
                daftarDosen.add(dosenTetap);
            } else if (pilihan == 2) {
                System.out.print("Masukkan jam mengajar: ");
                int jamMengajar = scanner.nextInt();
                System.out.print("Masukkan honor per jam: ");
                double honorPerJam = scanner.nextDouble();
                DosenTidakTetap dosenTidakTetap = new DosenTidakTetap(nama, nik, umur, jenisKelamin, jamMengajar, honorPerJam);
                daftarDosen.add(dosenTidakTetap);
            }

            System.out.println("Apakah Anda ingin menambah dosen lagi? (y/n)");
            char lagi = scanner.next().charAt(0);
            System.out.println("--------------------------------------------");
            if (lagi == 'n' || lagi == 'N') {
                adding = false;
            }
        }
    }

    // Fungsi untuk menampilkan menu dosen
    public static void tampilkanMenuDosen(Scanner scanner, ArrayList<Dosen> daftarDosen) {
        boolean displayMenu = true;
        while (displayMenu) {
            System.out.println("-----------------------------------------------");
            System.out.println("\nPilih daftar dosen yang ingin ditampilkan:");
            System.out.println("1. Dosen Tetap");
            System.out.println("2. Dosen Tidak Tetap");
            System.out.println("3. Semua Dosen");
            System.out.println("4. Kembali ke Menu Utama");
            System.out.print("Pilihan: ");
            int displayChoice = scanner.nextInt();
            System.out.println("-----------------------------------------------");

            switch (displayChoice) {
                case 1:
                    tampilkanDosenTetap(daftarDosen);
                    break;
                case 2:
                    tampilkanDosenTidakTetap(daftarDosen);
                    break;
                case 3:
                    tampilkanSemuaDosen(daftarDosen);
                    break;
                case 4:
                    displayMenu = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    // Fungsi untuk menampilkan dosen tetap
    public static void tampilkanDosenTetap(ArrayList<Dosen> daftarDosen) {
        System.out.println("----------------------");
        System.out.println("\nDaftar Dosen Tetap:");
        for (Dosen dosen : daftarDosen) {
            if (dosen instanceof DosenTetap) {
                dosen.tampilkanInfo();
                System.out.println();
            }
        }System.out.println("----------------------");
    }

    // Fungsi untuk menampilkan dosen tidak tetap
    public static void tampilkanDosenTidakTetap(ArrayList<Dosen> daftarDosen) {
        System.out.println("----------------------------");
        System.out.println("\nDaftar Dosen Tidak Tetap:");
        for (Dosen dosen : daftarDosen) {
            if (dosen instanceof DosenTidakTetap) {
                dosen.tampilkanInfo();
                System.out.println();
            }
        }System.out.println("---------------------------");
    }

    // Fungsi untuk menampilkan semua dosen
    public static void tampilkanSemuaDosen(ArrayList<Dosen> daftarDosen) {
        System.out.println("----------------------");
        System.out.println("\nDaftar Semua Dosen:");
        for (Dosen dosen : daftarDosen) {
            dosen.tampilkanInfo();
            System.out.println();
        }System.out.println("----------------------");
    }
}

