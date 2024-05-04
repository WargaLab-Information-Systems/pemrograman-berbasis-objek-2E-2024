/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1no2mahasiswa;
import java.util.Scanner;

class Mahasiswa {
    String Nama;
    long Nim;
    String Jurusan;
    String Alamat;
    
    public void tampilkanData(){
       System.out.println("Nama     :"+ Nama);
       System.out.println("Nim      :"+ Nim);
       System.out.println("Jurusan  :"+ Jurusan);
       System.out.println("Alamat   :"+ Alamat);
    }
}
/**
 *
 * @author ASUS
 */
public class Modul1no2mahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.print("Masukkan Nama    : ");
        mahasiswa.Nama = input.nextLine();
        
        System.out.print("Masukkan Nim     : ");
        mahasiswa.Nim = input.nextLong();
        input.nextLine();
       
        System.out.print("Masukkan Jurusan : ");
        mahasiswa.Jurusan = input.nextLine();
        
        System.out.print("Masukkan Alamat  : ");
        mahasiswa.Alamat = input.nextLine();
        
        System.out.println("\nBiodata Mahasiswa");
        mahasiswa.tampilkanData();
    }
}
