package data_karyawan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = input.nextInt();
        input.nextLine();  

        Karyawan[] karyawanArray = new Karyawan[jumlahKaryawan];

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("Data Karyawan ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine();  
            System.out.print("Posisi: ");
            String posisi = input.nextLine();
            System.out.print("Jenis Karyawan (Tetap/Kontrak): ");
            String jenisKaryawan = input.nextLine();

            if (jenisKaryawan.equalsIgnoreCase("Tetap")) {
                System.out.print("Gaji Bulanan: ");
                double gajiBulanan = input.nextDouble();
                input.nextLine();  
                karyawanArray[i] = new KaryawanTetap(nama, usia, posisi, gajiBulanan);
            } else if (jenisKaryawan.equalsIgnoreCase("Kontrak")) {
                System.out.print("Upah Per Jam: ");
                double upahPerJam = input.nextDouble();
                System.out.print("Jumlah Jam Kerja: ");
                int jumlahJamKerja = input.nextInt();
                input.nextLine();  
                karyawanArray[i] = new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja);
            } else {
                System.out.println("Jenis karyawan tidak valid.");
                i--;  
            }
        }

        System.out.println("\nData Semua Karyawan:");
        for (Karyawan karyawan : karyawanArray) {
            karyawan.tampilkanData();
        }

        input.close();
    }
}

