/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author GRAHA
 */
public class mahasiswa {
    public static void main(String[] atrgs) {
        java.util.Scanner input = new java.util.Scanner (System.in);
        
        String Nama;
        String Nim;
        String Prodi;
        String Alamat;
        
        System.out.println("Masukkan Nama   :");
        Nama = input.nextLine();
        System.out.println("Masukkan Nim    :");
        Nim = input.nextLine();
        System.out.println("Masukan prodi   :");
        Prodi = input.nextLine();
        System.out.println("Masukkan Alamat :");
        Alamat = input.nextLine();
        
        System.out.println("<==============================================>");
        System.out.println("Nama Mahasiswa      : "+Nama);
        System.out.println("Nim Mahasiswa       : "+Nim);
        System.out.println("Prodi Mahasiswa     : "+Prodi);
        System.out.println("Alamat Mahasiswa    : "+Alamat);
    }
}
