/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AbasZ
 */
public class ApkMain {
    public static void main(String[]args){
    ArrayList<Mahasiswa>mahasiswaList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Masukkan Nama Universitas :");
        String Universitas = scanner.nextLine();
        DataMahasiswa.setUniversitas(Universitas);
        System.out.println("=========================================");
        
    while(true){
        System.out.println("========== APLIKASI DATA MAHASISWA ==========");
        System.out.println("Universitas :"+DataMahasiswa.getUniversitas());
        System.out.println("=============================================");
        System.out.println("Masukkan NIM Anda : ");
        String NIM = scanner.nextLine();
        
        System.out.println("Masukkan Nama Anda : ");
        String nama = scanner.nextLine();
        
        System.out.println("Masukkan Alamat Anda : ");
        String alamat = scanner.nextLine();
        
        System.out.println("Daftar Jurusan");
        System.out.println("41 = Teknik Informatika");
        System.out.println("42 = Teknik Industri");
        System.out.println("43 = Teknik Elektro");
        System.out.println("44 = Sistem Informasi");
        System.out.println("48 = Teknik Mesin");
        System.out.println("49 = Teknik Mekatronika");
        System.out.println("Masukkan Jurusan Anda : ");
        String jurusan = scanner.nextLine();
        
        Mahasiswa mahasiswa = new Mahasiswa (NIM, nama, alamat, jurusan);
        mahasiswaList.add(mahasiswa);
        
        System.out.println("Apakah Anda ingin memasukkan data lagi? (Y/T) : ");
        String ulang = scanner.nextLine();
        if (!ulang.equalsIgnoreCase("Y")){
            break;
        }
            
    }
    
        System.out.println("------------- DAFTAR MAHASISWA --------");
        System.out.println("Universitas :"+DataMahasiswa.getUniversitas());
        System.out.println("--------------------------------------------");
        for (Mahasiswa mahasiswa : mahasiswaList){
            mahasiswa.menampilkaninformasi();
            }
        }
    }
