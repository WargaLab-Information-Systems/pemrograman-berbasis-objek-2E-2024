/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package datamahasiswa;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ningrum
 */
public class DataMahasiswa {
    private static String namaUniversitas;
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    public DataMahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public static void setNamaUniversitas(String namaUniversitas) {
        DataMahasiswa.namaUniversitas = namaUniversitas;
    }

    public static String getNamaUniversitas() {
        return namaUniversitas;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        DataMahasiswa.setNamaUniversitas(namaUniversitas);
        ArrayList<DataMahasiswa> daftarMahasiswa = new ArrayList<>();
        char lagi;
        do {
            System.out.println("\n==== Masukkan Data Mahasiswa ====");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.println("Pilihan Jurusan : ");
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Masukkan Pilihan Jurusan: ");
            int pilihan = scanner.nextInt();
            String jurusan;
            switch (pilihan) {
                case 41:
                    jurusan=("TEKNIK INFORMATIKA");
                    break;
                case 42:
                    jurusan=("TEKNIK INDUSTRI");
                    break;
                case 43:
                    jurusan=("TEKNIK ELEKTRO");
                    break;
                case 44:
                    jurusan=("SISTEM INFORMASI");
                    break;
                case 48:
                    jurusan=("TEKNIK MESIN");
                    break;
                case 49:
                    jurusan=("TEKNIK MEKATRONIKA");
                    break;
                default:
                    jurusan=("Pilihan Jurusan Tidak Tersedia!!!");
                    break;
            }

            DataMahasiswa mahasiswa = new DataMahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            lagi = scanner.next().charAt(0);
            scanner.nextLine();

        } while (lagi == 'Y' || lagi == 'y');

        System.out.println("\nDaftar Mahasiswa:");
        System.out.printf
        ("%-10s%-20s%-40s%-20s\n", 
                "NAMA", "NIM", 
                "ALAMAT", 
                "JURUSAN");
        for (DataMahasiswa mahasiswa : daftarMahasiswa) {
            System.out.printf
            ("%-10s%-20s%-40s%-20s\n", 
                    mahasiswa.getNama(), 
                    mahasiswa.getNim(), 
                    mahasiswa.getAlamat(), 
                    mahasiswa.getJurusan());
        }
    }
}
