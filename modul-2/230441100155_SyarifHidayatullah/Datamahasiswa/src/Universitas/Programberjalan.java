/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Universitas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author GRAHA
 */
public class Programberjalan {
private static List<InputData> daftarMahasiswa = new ArrayList<>();

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nama Universitas:");
        universitas.setNamaUniversitas(scanner.nextLine());

        char lanjut = 'Y';
        while (lanjut == 'Y') {
            System.out.println("Masukkan data mahasiswa:");
            System.out.print("Nama: ");
            String NIM = scanner.nextLine();
            System.out.print("NIM: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Kode Jurusan: ");
            int kodeJurusan = scanner.nextInt();
            scanner.nextLine(); // Bersihkan buffer

            InputData mahasiswa = new InputData(NIM, nama, alamat, kodeJurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.println("Apakah Anda ingin memasukkan data lagi? (Y) Ya; (T) Tidak");
            lanjut = scanner.nextLine().toUpperCase().charAt(0);
        }

        System.out.println("\nDaftar Mahasiswa:");
        for (InputData mahasiswa : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa.getNIM() + ", Nama: " + mahasiswa.getNama() + ", Alamat: " + mahasiswa.getAlamat() + ", Jurusan: " + mahasiswa.getJurusan());
        }
    }
    
}
