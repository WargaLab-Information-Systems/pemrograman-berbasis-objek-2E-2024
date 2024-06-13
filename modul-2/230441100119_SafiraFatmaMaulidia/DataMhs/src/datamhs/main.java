/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamhs;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Safira
 */
public class main {
    private static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        Universitas.setNamaUniversitas(namaUniversitas);

        while (true) {
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();

            System.out.print("Masukkan Kode Jurusan (41, 42, 43, 44, 48, 49): ");
            String kodeJurusan = scanner.nextLine();
            String jurusan = Mahasiswa.getJurusanByCode(kodeJurusan);

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y) Ya; (T) Tidak: ");
            String pilihan = scanner.nextLine();
            if (pilihan.equalsIgnoreCase("T")) {
                break;
            }
        }

        System.out.println("\nDaftar Mahasiswa di " + Universitas.getNamaUniversitas());
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("NIM: " + mhs.getNim());
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("Alamat: " + mhs.getAlamat());
            System.out.println("Jurusan: " + mhs.getJurusan());
            System.out.println("-------------------");
        }

        scanner.close();
    }
}
