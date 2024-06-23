package datadosen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputLagi = true;

        // maksimal memassukan data
        int maxEntries = 100;
        
        DosenTetap[] dosenTetapList = new DosenTetap[maxEntries];
        DosenTidakTetap[] dosenTidakTetapList = new DosenTidakTetap[maxEntries];
        
        int dosenTetapCount = 0;
        int dosenTidakTetapCount = 0;
        
        while (inputLagi) {
            System.out.println("Masukkan tipe dosen (1: Dosen Tetap, 2: Dosen Tidak Tetap): ");
            int tipeDosen = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.println("Masukkan nama: ");
            String nama = scanner.nextLine();

            System.out.println("Masukkan NIK: ");
            String nik = scanner.nextLine();

            System.out.println("Masukkan umur: ");
            int umur = scanner.nextInt();

            System.out.println("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = scanner.next().charAt(0);

            if (tipeDosen == 1) {
                System.out.println("Masukkan gaji pokok: ");
                double gajiPokok = scanner.nextDouble();

                System.out.println("Masukkan tunjangan: ");
                double tunjangan = scanner.nextDouble();

                DosenTetap dosenTetap = new DosenTetap(nama, nik, umur, jenisKelamin, gajiPokok, tunjangan);
                if (dosenTetapCount < maxEntries) {
                    dosenTetapList[dosenTetapCount++] = dosenTetap;
                } else {
                    System.out.println("Kapasitas penuh untuk Dosen Tetap.");
                }
            } else if (tipeDosen == 2) {
                System.out.println("Masukkan jam mengajar: ");
                int jamMengajar = scanner.nextInt();

                System.out.println("Masukkan honor per jam: ");
                double honorPerjam = scanner.nextDouble();

                DosenTidakTetap dosenTidakTetap = new DosenTidakTetap(nama, nik, umur, jenisKelamin, jamMengajar, honorPerjam);
                if (dosenTidakTetapCount < maxEntries) {
                    dosenTidakTetapList[dosenTidakTetapCount++] = dosenTidakTetap;
                } else {
                    System.out.println("Kapasitas penuh untuk Dosen Tidak Tetap.");
                }
            } else {
                System.out.println("Tipe dosen tidak valid.");
            }

            System.out.println("Apakah Anda ingin memasukkan data dosen lagi? (y/n): ");
            char lagi = scanner.next().charAt(0);
            scanner.nextLine(); // line baru

            if (lagi != 'y' && lagi != 'Y') {
                inputLagi = false;
            }
        }

        // tampilkan data di sini
        System.out.println("\nData Dosen Tetap:");
        for (int i = 0; i < dosenTetapCount; i++) {
            dosenTetapList[i].tampilkanInfo();
        }

        System.out.println("\nData Dosen Tidak Tetap:");
        for (int i = 0; i < dosenTidakTetapCount; i++) {
            dosenTidakTetapList[i].tampilkanInfo();
        }
    }
}