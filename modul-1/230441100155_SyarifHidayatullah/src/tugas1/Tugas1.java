/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author GRAHA
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // atribut  
        manusia syarif = new manusia();
        syarif.nama="Syarif Hidayatullah";
        syarif.umur=19;
        syarif.alamat="Sampang";
        //menampilkan atibut
        System.out.println("Nama    : "+syarif.nama);
        System.out.println("Umur    : "+syarif.umur);
        System.out.println("Alamat  : "+syarif.alamat);
        //method
        syarif.makan();
        syarif.tidur();
    }
    
}
