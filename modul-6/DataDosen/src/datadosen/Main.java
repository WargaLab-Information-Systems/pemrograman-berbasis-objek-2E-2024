package datadosen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<DataDosen> dosenList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjutkanInput = true;

        while (lanjutkanInput) {
            System.out.print("Berapa data Dosen Tetap yang ingin Anda input: ");
            int jumlahDosenTetap = scanner.nextInt();
            scanner.nextLine(); 

            for (int i = 0; i < jumlahDosenTetap; i++) {
                tambahDosenTetap(scanner);
            }

            System.out.print("Berapa data Dosen Tidak Tetap yang ingin Anda input: ");
            int jumlahDosenTidakTetap = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < jumlahDosenTidakTetap; i++) {
                tambahDosenTidakTetap(scanner);
            }

            tampilkanSemuaDosen();

            System.out.print("Apakah ada data yang akan dimasukkan lagi? (iya/tidak): ");
            String lanjut = scanner.nextLine().toLowerCase();

            if (lanjut.equals("tidak")) {
                lanjutkanInput = false;
            }  
        }

        System.out.println("Input Data Dosen selesai.");
    }

    private static void tambahDosenTetap(Scanner scanner) {
        System.out.println("Input Data Dosen Tetap:");
        System.out.print("Nama                        : ");
        String nama = scanner.nextLine();
        System.out.print("NIK                         : ");
        String nik = scanner.nextLine();
        System.out.print("Umur                        : ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Jurusan Dosen               : ");
        String jurusanDosen = scanner.nextLine();
        System.out.print("Jenis Kelamin (Wanita/Pria) : ");
        char jenisKelamin = scanner.next().charAt(0);
        System.out.print("Gaji Pokok                  : ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Tunjangan Tetap             : ");
        double tunjangan = scanner.nextDouble();
        scanner.nextLine();

        DosenTetap dosenTetap = new DosenTetap(nama, nik, umur, jurusanDosen, jenisKelamin, gajiPokok, tunjangan);
        dosenList.add(dosenTetap);
    }

    private static void tambahDosenTidakTetap(Scanner scanner) {
        System.out.println("Input Data Dosen Tidak Tetap:");
        System.out.print("Nama                        : ");
        String nama = scanner.nextLine();
        System.out.print("NIK                         : ");
        String nik = scanner.nextLine();
        System.out.print("Umur                        : ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Jurusan Dosen               : ");
        String jurusanDosen = scanner.nextLine();
        System.out.print("Jenis Kelamin (Wanita/Pria) : ");
        char jenisKelamin = scanner.next().charAt(0);
        System.out.print("Jam Mengajar                : ");
        int jamMengajar = scanner.nextInt();
        System.out.print("Honor Per Jam               : ");
        double honorPerJam = scanner.nextDouble();
        scanner.nextLine();

        DosenTidakTetap dosenTidakTetap = new DosenTidakTetap(nama, nik, umur, jurusanDosen, jenisKelamin, jamMengajar, honorPerJam);
        dosenList.add(dosenTidakTetap);
    }

    private static void tampilkanSemuaDosen() {
        System.out.println("\nData Semua Dosen:");
        for (DataDosen dosen : dosenList) {
            dosen.tampilkanInfo();
            System.out.println();
        }
    }
}
