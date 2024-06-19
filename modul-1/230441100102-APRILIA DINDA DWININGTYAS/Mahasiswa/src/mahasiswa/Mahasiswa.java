/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

import java.util.Scanner;

public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner data =new Scanner(System.in);
        String nama,nim,prodi,alamat;
        
        System.out.print("Masukan Nama : ");
        nama= data.nextLine();
        System.out.print("Masukan Nim : ");
        nim= data.nextLine();
        System.out.print("Masukan Prodi : ");
        prodi= data.nextLine();
        System.out.print("Masukan Alamat : ");
        alamat= data.nextLine();
        
        System.out.println("");
        System.out.println("====================");
        System.out.println("   Data Mahasiswa   ");
        System.out.println("====================");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Prodi   : " + prodi);
        System.out.println("Alamat  : " + alamat);

    }
    
}
