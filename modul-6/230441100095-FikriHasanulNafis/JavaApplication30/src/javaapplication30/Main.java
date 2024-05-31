package javaapplication30;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dosen> daftarDosen = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.println("Tambah Dosen:");
            System.out.println("1. Dosen Tetap");
            System.out.println("2. Dosen Tidak Tetap");
            System.out.println("3. Keluar dan Tampilkan Data");
            System.out.print("Pilih tipe dosen (1/2/3): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            if (pilihan != 1 && pilihan != 2) {
                ulang = false;
                break;
            }

            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIK: ");
            String nik = scanner.nextLine();
            System.out.print("Umur: ");
            int umur = scanner.nextInt();
            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelamin = scanner.next().charAt(0);

            if (pilihan == 1) {
                System.out.print("Gaji Pokok: ");
                double gajiPokok = scanner.nextDouble();
                System.out.print("Tunjangan: ");
                double tunjangan = scanner.nextDouble();
                DosenTetap dosenTetap = new DosenTetap(nama, nik, umur, jenisKelamin, gajiPokok, tunjangan);
                daftarDosen.add(dosenTetap);
            } else if (pilihan == 2) {
                System.out.print("Jam Mengajar: ");
                int jamMengajar = scanner.nextInt();
                System.out.print("Honor Per Jam: ");
                double honorPerJam = scanner.nextDouble();
                DosenTidakTetap dosenTidakTetap = new DosenTidakTetap(nama, nik, umur, jenisKelamin, jamMengajar, honorPerJam);
                daftarDosen.add(dosenTidakTetap);
            }
        }

        System.out.println("\nDaftar Dosen:");
        for (Dosen dosen : daftarDosen) {
            dosen.tampilkanInfo();
            System.out.println();
        }

    }
}

    


