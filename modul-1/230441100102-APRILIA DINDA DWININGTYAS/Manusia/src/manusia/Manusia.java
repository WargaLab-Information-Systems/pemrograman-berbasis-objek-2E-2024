/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author Asus
 */
public class Manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusiaa people = new Manusiaa();
        
        people.nama = " Aprilia Dinda";
        people.umur = 19;
        people.alamat = "Jombang";
        
        System.out.println("Nama saya"+people.nama);
        System.out.println("Umur saya "+people.umur);
        System.out.println("Alamat saya "+people.alamat);
        
        people.berjalan();
        people.berlari();
            
    }
    
}
