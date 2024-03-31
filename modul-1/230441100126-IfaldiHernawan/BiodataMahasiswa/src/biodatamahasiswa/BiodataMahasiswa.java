/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biodatamahasiswa;

import java.util.Scanner;

class data{
    String nama;
    String prodi;
    String alamat;
    String nim;
}
public class BiodataMahasiswa {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in) ;
            
            data Data = new data();
            System.out.print("Masukkan nama mahasiswa: ");
            Data.nama = scanner.nextLine();
            
            System.out.print("Masukkan jurusan/prodi mahasiswa: ");
            Data.prodi = scanner.nextLine();
            
            System.out.print("Masukkan alamat mahasiswa: ");
            Data.alamat = scanner.nextLine();
            
            System.out.print("Masukkan NIM mahasiswa: ");
            Data.nim = scanner.nextLine();
            
//            System.out.println("");
            System.out.println("HASIL AKHIR");
            System.out.println("nama : "+Data.nama);
            System.out.println("prodi : "+Data.prodi);
            System.out.println("alamat : "+Data.alamat);
            System.out.println("nim : "+Data.nim);
        }
    }
