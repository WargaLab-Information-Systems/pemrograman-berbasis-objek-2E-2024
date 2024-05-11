/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hal1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.ArrayList;
import java.util.Scanner;

public class Hal3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan Nama Universitas: "); 
        String namaUniversitas = scanner.next();
        Hal2.setNamaUniversitas(namaUniversitas);

        
        ArrayList<Hal1> daftarMahasiswa = new ArrayList<>();

        
        char lagi;
        do {
            System.out.println("Masukkan Data Mahasiswa:");
            System.out.print("Nama: ");
            String nama = scanner.next();
            scanner.nextLine(); 
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.println("Pilih Jurusan : ");
            System.out.println("1 = TEKNIK INFORMATIKA");
            System.out.println("2 = TEKNIK INDUSTRI,");
            System.out.println("3 = TEKNIK ELEKTRO");
            System.out.println("4 = SISTEM INFORMASI");
            System.out.println("5 = TEKNIK MESIN");
            System.out.println("6 = TEKNIK MEKATRONIKA");
            System.out.print("Jurusan (1-6): ");
            int jurusan = scanner.nextInt();

            Hal1 mahasiswa = new Hal1(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.println("Apakah Anda ingin memasukkan data lagi? (Y/T)");
            lagi = scanner.next().charAt(0);
        } while (lagi == 'Y' || lagi == 'y');

        System.out.println("\nDaftar Mahasiswa di " + Hal2.getNamaUniversitas() + ":");
        for (Hal1 m : daftarMahasiswa) {
            System.out.println("Nama: " + m.getNama());
            System.out.println("NIM: " + m.getNim());
            System.out.println("Alamat: " + m.getAlamat());
            System.out.println("Jurusan: " + getJurusanString(m.getJurusan()));
            System.out.println();
        }
    }

    // Metode untuk mendapatkan nama jurusan berdasarkan kode jurusan
    private static String getJurusanString(int jurusan) {
        return switch (jurusan) {
            case 1 -> "Teknik Informatika";
            case 2 -> "Teknik Industri";
            case 3 -> "Teknik Elektro";
            case 4 -> "Sistem Informasi";
            case 5 -> "Teknik Mesin";
            case 6 -> "Teknik Mekatronika";
            default -> "Jurusan tidak valid";
        };
    }
}