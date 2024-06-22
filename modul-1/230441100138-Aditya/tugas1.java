/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author ADITYA
 */
public class tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //atribut adit
        manusia adit = new manusia();        
        adit.nama="Aditya";
        adit.umur=19;
        adit.alamat="Pocong";
        //menamppilkan atribut adit
        System.out.println("Nama    : "+adit.nama);
        System.out.println("Umur    : "+adit.umur);
        System.out.println("Alamat  : "+adit.alamat);
        //method dari orang
        adit.berjalan();
        adit.berlari();
    }
}