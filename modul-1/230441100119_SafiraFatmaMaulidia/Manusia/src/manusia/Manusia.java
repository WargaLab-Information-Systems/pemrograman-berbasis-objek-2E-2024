/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author Safira
 */
public class Manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Manusiaa manusia = new Manusiaa();
       manusia.nama="Safira";
       manusia.umur=18;
       manusia.alamat="Surabaya";
       
           System.out.println("Nama saya adalah "+ manusia.nama);
           System.out.println("Saya berumur "+ manusia.umur);
           System.out.println("Alamat rumah saya di "+ manusia.alamat);
       
           manusia.berjalan();
           manusia.berlari();
    }
    
}
