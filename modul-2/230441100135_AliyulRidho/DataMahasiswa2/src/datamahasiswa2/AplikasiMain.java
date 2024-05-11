/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ridho
 */
public class AplikasiMain {
    public static void main(String[] args) {
        ArrayList<Mahasiswa>mahasiswaList = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Masukkan Nama Universitas Anda : ");
        String Universitas = scanner.nextLine();
        DataMahasiswa2.setUniversitas(Universitas);
        
        while(true){
            System.out.println("====== APLIKASI DATA MAHASIWA ======");
            System.out.println("\tUniversitas : "+DataMahasiswa2.getUniversitas());
            System.out.println("====================================");
            System.out.print("Masukkan NIM Anda : ");
            String NIM = scanner.nextLine();
            
            System.out.print("Masukkan Nama Anda : ");
            String nama = scanner.nextLine();
            
            System.out.print("Masukkan Alamat Anda : ");
            String alamat = scanner.nextLine();
            
            System.out.print("Masukkan Jurusan Anda : ");
            String jurusan = scanner.nextLine();
            
            Mahasiswa mahasiswa = new Mahasiswa (NIM,nama,alamat,jurusan);
            mahasiswaList.add(mahasiswa);
            
            System.out.println("apakah anda ingin mengulangi program ini? (Y/T) : ");
            String lagi = scanner.nextLine();
            if (!lagi.equalsIgnoreCase("Y")){
                break;
            }
            
          
        }
        
    System.out.println("===== DAFTAR MAHASISWA =====");
    System.out.println("  Universitas : "+DataMahasiswa2.getUniversitas());
    System.out.println("============================");
    for (Mahasiswa mahasiswa : mahasiswaList){
        mahasiswa.displayInfo();
            
        }
    }
}
