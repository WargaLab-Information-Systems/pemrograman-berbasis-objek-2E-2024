/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data_dosen;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dosen[] dosenArray = new Dosen[10];
        int dosenCount = 0;

        while (true) {
            if (dosenCount >= 10) {
                System.out.println("Jumlah maksimal dosen telah tercapai.");
                break;
            }

            System.out.print("Pilih jenis dosen: (1) Dosen Tetap, (2) Dosen Tidak Tetap: ");
            String jenisInput = scanner.nextLine();
            int jenis = -1;
            try {
                jenis = Integer.parseInt(jenisInput);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                continue;
            }

            if (jenis == 1) {
                try {
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("NIK: ");
                    String nik = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umur = Integer.parseInt(scanner.nextLine());
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jenisKelamin = scanner.nextLine().charAt(0);
                    System.out.print("Gaji Pokok: ");
                    double gajiPokok = Double.parseDouble(scanner.nextLine());
                    System.out.print("Tunjangan: ");
                    double tunjangan = Double.parseDouble(scanner.nextLine());

                    DosenTetap dosenTetap = new DosenTetap(nama, nik, umur, jenisKelamin, gajiPokok, tunjangan);
                    dosenArray[dosenCount] = dosenTetap;
                    dosenCount++;
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                    continue;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                    continue;
                }
            } else if (jenis == 2) {
                try {
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("NIK: ");
                    String nik = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umur = Integer.parseInt(scanner.nextLine());
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jenisKelamin = scanner.nextLine().charAt(0);
                    System.out.print("Jam Mengajar: ");
                    int jamMengajar = Integer.parseInt(scanner.nextLine());
                    System.out.print("Honor Per Jam: ");
                    double honorPerJam = Double.parseDouble(scanner.nextLine());

                    DosenTidakTetap dosenTidakTetap = new DosenTidakTetap(nama, nik, umur, jenisKelamin, jamMengajar, honorPerJam);
                    dosenArray[dosenCount] = dosenTidakTetap;
                    dosenCount++;
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                    continue;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                    continue;
                }
            } else {
                System.out.println("Jenis dosen tidak valid. Coba lagi.");
                continue;
            }

            System.out.print("Apakah Anda ingin menambahkan dosen lagi? (y/n): ");
            char tambahLagi = scanner.nextLine().charAt(0);

            if (tambahLagi == 'n' || tambahLagi == 'N') {
                break;
            }
        }

        System.out.println("\nData Dosen:");
        for (int i = 0; i < dosenCount; i++) {
            dosenArray[i].tampilkanInfo();
            System.out.println();
        }

        scanner.close();
    }
}
