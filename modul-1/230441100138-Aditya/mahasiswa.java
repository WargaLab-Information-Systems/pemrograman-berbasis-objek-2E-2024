/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;
import java.util.Scanner;
/**
 *
 * @author ADITYA
 */
public class mahasiswa {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input = new java.util.Scanner (System.in);
        String Nama;
        long Nim;
        String Prodi;
        String Alamat;
        System.out.println("Masukkan Nama    :");
        Nama = input.nextLine();
        System.out.println("Masukkan Nim : ");
        Nim = input.nextLong();
        System.out.println("Masukkan Prodi   : ");
        Prodi = input.nextLine();
        System.out.println("Masukkan Alamat  : ");
        Alamat = input.nextLine();
        System.out.println("=======================================");
        System.out.println("Nama mahasiswa      : "+Nama);
        System.out.println("Nim mahasiswa       : "+Nim);
        System.out.println("Prodi mahasiswa     : "+Prodi);
        System.out.println("Alamat mahasiswa    : "+Alamat);
    }   
}