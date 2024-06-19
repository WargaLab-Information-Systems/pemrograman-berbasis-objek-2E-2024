/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswabaru;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class MahasiswaBaru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lanjut = "ya";
        while(lanjut.equals("ya"));
        Scanner mhs =new Scanner(System.in);
        String nama, NISN, asal sekolah, tanggal lahir, prodi;
        
        System.out.print("Masukan Nama : ");
        nama= mhs.nextLine();
        System.out.print("Masukan NISN : ");
        NISN= mhs.nextLine();
        System.out.print("Asal Sekolah : ");
        asal sekolah= mhs.nextLine();
        System.out.print("Tanggal Lahir : ");
        tanggal lahir= mhs.nextLine();
        System.out.print(" Masukkan Prodi : ");
        prodi= mhs.nextLine();
        
        
       
        System.out.println("   Data Mahasiswa Baru   ");
        System.out.println("Nama    : " + nama);
        System.out.println("NISN     : " + NISN);
        System.out.println("Asal Sekolah   : " + asal sekolah);
        System.out.println("Tanggal Lahir  : " + tanggal lahir);
        System.out.println("Masukkan prodir  : " + Prodi);
    }
    
}
