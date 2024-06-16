/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamhs;

import java.util.Scanner;
/**
 *
 * @author Ivan Aditama
 */


// Parent class 
class Universitas {
    private static String namaUniversitas;

    static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    static String getNamaUniversitas() {
        return namaUniversitas;
    }
}

// Child Class
class Mahasiswa extends Universitas {
    private Long nim;
    private String nama;
    private String alamat;
    private int jurusan;
    private String namaJurusan;

    Mahasiswa(Long nim, String nama, String alamat, int jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    void displayInfo() {
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama Universitas: " + getNamaUniversitas());
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + getJurusanString());
    }

    String getJurusanString() {
        if(jurusan == 41){
            namaJurusan = "Teknik Informatika";
        }else if (jurusan == 42){
            namaJurusan = "Teknik Industri";
        }else if (jurusan == 43){
            namaJurusan = "Teknik Elektro";
        }else if (jurusan == 44){
            namaJurusan = "Sistem Informasi";
        }else if (jurusan == 45){
            namaJurusan = "Teknik Mesin";
        }else if (jurusan == 46){
            namaJurusan = "Teknik Mekatronika";
        }else {
            namaJurusan = "Jurusan Tidak Valid";
        }
//        return switch (jurusan) {
//            case 41 -> "Teknik Informatika";
//            case 42 -> "Teknik Industri";
//            case 43 -> "Teknik Elektro";
//            case 44 -> "Sistem Informasi";
//            case 48 -> "Teknik Mesin";
//            case 49 -> "Teknik Mekatronika";
//            default -> "Jurusan tidak valid";
//        };
//    }
        return namaJurusan;
        }
    }
public class DataMhs {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = input.nextLine();
        Universitas.setNamaUniversitas(namaUniversitas);

        // Looping
        String ulang;
        boolean inputLanjut = true;
        
        while (inputLanjut) {
            System.out.println("\nMasukkan Data Mahasiswa:");
            System.out.print("NIM: ");
            Long nim = input.nextLong();
                       input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Alamat: ");
            String alamat = input.nextLine();
            System.out.println("Jurusan:");
            System.out.println("41 = Teknik Informatika");
            System.out.println("42 = Teknik Industri");
            System.out.println("43 = Teknik Elektro");
            System.out.println("44 = Sistem Informasi");
            System.out.println("48 = Teknik Mesin");
            System.out.println("49 = Teknik Mekatronika");
            System.out.print("Pilih Jurusan (41/42/43/44/48/49): ");
            int jurusan = input.nextInt();

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            
            // Menampilkan display
            mahasiswa.displayInfo();

            // Input lanjut atau tidak
            System.out.print("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
            ulang = input.next();
            input.nextLine(); 
            
            if (ulang.equals("t") || ulang.equals("T")) {
                 inputLanjut = false;
            } else {
                inputLanjut = true;
            }
        }
    };
    
    }

