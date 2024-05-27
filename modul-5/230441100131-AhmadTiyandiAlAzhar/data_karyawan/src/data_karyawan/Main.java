package data_karyawan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jumlahKaryawan;
             while (true) {
            try {
                System.out.print("Masukkan jumlah karyawan (maksimal 10): ");
                jumlahKaryawan = Integer.parseInt(scanner.nextLine());
                if (jumlahKaryawan > 0 && jumlahKaryawan <= 10) {
                    break;
                } else {
                    System.out.println("Jumlah karyawan tidak valid. Masukkan angka antara 1 hingga 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input jumlah karyawan tidak valid. Masukkan angka yang benar.");
            }
        }

        Karyawan[] karyawan = new Karyawan[jumlahKaryawan];

        for (int i = 0; i < karyawan.length; i++) {
            System.out.println("Masukkan data karyawan ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            int usia;
            while (true) {
                try {
                    System.out.print("Usia: ");
                    usia = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Input usia tidak valid. Masukkan angka yang benar.");
                }
            }

            System.out.print("Posisi: ");
            String posisi = scanner.nextLine();
            

            int jenis;
            while (true) {
                try {
                    System.out.print("Jenis Karyawan (1. Tetap, 2. Kontrak): ");
                    jenis = Integer.parseInt(scanner.nextLine());
                    if (jenis == 1 || jenis == 2) {
                        break;
                    } else {
                        System.out.println("Input jenis karyawan tidak valid. Masukkan angka 1 atau 2.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input jenis karyawan tidak valid. Masukkan angka 1 atau 2.");
                }
            }
            //disni untuk memproses jika user menginput karyawan tetap
            if (jenis == 1) {
                double gajiBulanan;
                while (true) {
                    try {
                        System.out.print("Gaji Bulanan: ");
                        gajiBulanan = Double.parseDouble(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Input gaji bulanan tidak valid. Masukkan angka yang benar.");
                    }
                }
                karyawan[i] = new KaryawanTetap(nama, usia, posisi, gajiBulanan);
            } 
            //        akhir karyawan tetap
            
            //      disni untuk memproses jika user menginput karyawan kontrak
          else if (jenis == 2) {
                double upahPerJam;
                while (true) {
                    try {
                        System.out.print("Upah per Jam: ");
                        upahPerJam = Double.parseDouble(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Input upah per jam tidak valid. Masukkan angka yang benar.");
                    }
                }

                int jumlahJamKerja;
                while (true) {
                    try {
                        System.out.print("Jumlah Jam Kerja: ");
                        jumlahJamKerja = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Input jumlah jam kerja tidak valid. Masukkan angka yang benar.");
                    }
                }
                karyawan[i] = new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja);
            }
        }
//        akhir karyawan kontrak

//  disni untuk menampilkan data yang sudah diinput
        System.out.println("\n===================Data Karyawan==========================");
        for (Karyawan k : karyawan) {
            if (k != null) {
                k.tampilkanData();
                System.out.println();
            }
        }

        scanner.close();
    }
}

