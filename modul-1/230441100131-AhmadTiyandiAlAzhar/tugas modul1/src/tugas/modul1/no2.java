/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.modul1;

/**
 *
 * @author ahmad
 */
public class no2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            java.util.Scanner input = new java.util.Scanner (System.in);

        String Nama;
        String Nim;
        String Prodi;
        String Alamat;
        
        System.out.print("Masukkan Nama    :");
        Nama = input.nextLine ();
        System.out.print("Masukkan Nim : ");
        Nim = input.nextLine();
        System.out.print("Masukkan Prodi   : ");
        Prodi = input.nextLine();
        System.out.print("Masukkan Alamat  : ");
        Alamat = input.nextLine();
        
        System.out.println("=====================================");
        System.out.println("Nama mahasiswa      : "+Nama);
        System.out.println("Nim mahasiswa       : "+Nim);
        System.out.println("Prodi mahasiswa     : "+Prodi);
        System.out.println("Alamat mahasiswa    : "+Alamat);
    }
    
}
    