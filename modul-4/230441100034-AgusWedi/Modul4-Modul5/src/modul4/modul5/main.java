package modul4.modul5;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        while (true) {
            System.out.println("Masukkan data karyawan:");
            System.out.print("Nama\t: ");
            String nama = scanner.nextLine();
            System.out.print("Usia\t: ");
            int usia = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Posisi\t: ");
            String posisi = scanner.nextLine();
            System.out.print("Jenis Karyawan (1. Karyawan Tetap, 2. Karyawan Kontrak): ");
            int jenisKaryawan = scanner.nextInt();

            if (jenisKaryawan == 1) {
                System.out.print("Gaji Bulanan\t: ");
                double gajiBulanan = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                Karyawan KaryawanTetap = new KaryawanTetap(nama, usia, posisi, gajiBulanan);
                daftarKaryawan.add(KaryawanTetap);
            } else if (jenisKaryawan == 2) {
                System.out.print("Upah Per Jam\t\t: ");
                double upahPerJam = scanner.nextDouble();
                System.out.print("Jumlah Jam Kerja\t: ");
                int jumlahJamKerja = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                Karyawan KaryawanKontrak = new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja);
                daftarKaryawan.add(KaryawanKontrak);
            } else {
                System.out.println("Jenis karyawan tidak valid.");
            }

            System.out.print("Apakah ingin memasukkan data karyawan lain? (y/n): ");
            String lagi = scanner.nextLine();
            if (!lagi.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("\nDaftar Karyawan:");
        for (Karyawan karyawan : daftarKaryawan) {
            karyawan.tampilkanData();
            System.out.println("--------------------------------");
        }
    }
}