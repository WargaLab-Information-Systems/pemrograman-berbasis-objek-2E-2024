package perusahaan;

import java.util.Scanner;

public class Perusahaan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Karyawan[] karyawans = new Karyawan[2];
        int jumlahKaryawan = 0;

        while (true) {
            if (jumlahKaryawan >= karyawans.length) {
           
                Karyawan[] temp = new Karyawan[karyawans.length * 2];
                System.arraycopy(karyawans, 0, temp, 0, karyawans.length);
                karyawans = temp;
            }

            System.out.print("Apakah karyawan tetap ? (yes/no): ");
            String tipe = scanner.nextLine();

            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Posisi: ");
            String posisi = scanner.nextLine();
            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine();

            if (tipe.equalsIgnoreCase("yes")) {
                System.out.print("Gaji Bulanan: ");
                int gajiBulanan = scanner.nextInt();
                scanner.nextLine();
                karyawans[jumlahKaryawan] = new KaryawanTetap(nama, posisi, usia, gajiBulanan);
            } else {
                System.out.print("Gaji Per Jam: ");
                int gajiPerJam = scanner.nextInt();
                System.out.print("Jumlah Jam Kerja: ");
                int jumlahJamKerja = scanner.nextInt();
                scanner.nextLine();

                karyawans[jumlahKaryawan] = new KaryawanMagang(nama, posisi, usia, gajiPerJam, jumlahJamKerja);
            }

            jumlahKaryawan++;

            System.out.print("\nApakah ada data karyawan lain yang akan diinputkan? (yes/no): ");
            String lanjut = scanner.nextLine();
            if (!lanjut.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("\nData Karyawan:");
        for (int i = 0; i < jumlahKaryawan; i++) {
            karyawans[i].tampilkanData();
            System.out.println();
        }

        scanner.close();
    }
}