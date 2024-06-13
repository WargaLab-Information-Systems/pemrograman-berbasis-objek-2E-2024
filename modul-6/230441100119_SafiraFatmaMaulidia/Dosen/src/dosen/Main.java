/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosen;
import java.util.Scanner;
/**
 *
 * @author Safira
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data dosen:");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("NIK: ");
        String nik = scanner.nextLine();
        System.out.print("Umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Jenis Kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.print("Mengajar di: ");
        String instansi = scanner.nextLine();
        System.out.print("Jenis Dosen (Tetap/Tidak Tetap): ");
        String jenisDosen = scanner.nextLine();

        Dosen dosen;

        if (jenisDosen.equalsIgnoreCase("Tetap")) {
            System.out.print("Gaji Pokok: ");
            double gajiPokok = scanner.nextDouble();
            System.out.print("Tunjangan: ");
            double tunjangan = scanner.nextDouble();
            dosen = new DosenTetap(nama, nik, umur, jenisKelamin, instansi, gajiPokok, tunjangan);
        } else if (jenisDosen.equalsIgnoreCase("Tidak Tetap")) {
            System.out.print("Jam Mengajar: ");
            int jamMengajar = scanner.nextInt();
            System.out.print("Honor Per Jam: ");
            double honorPerJam = scanner.nextDouble();
            dosen = new DosenTidakTetap(nama, nik, umur, jenisKelamin, instansi, jamMengajar, honorPerJam);
        } else {
            System.out.println("Jenis dosen tidak dikenal.");
            scanner.close();
            return;
        }

        System.out.println("\nData Dosen:");
        dosen.tampilkanInfo();

        scanner.close();
    }
}
