/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author LENOVO
 */
public class Manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        namaManusia human = new namaManusia();
        
        human.nama="ifaldi";
        human.umur=20;
        human.alamat="Jombang";
        
        System.out.println("Namaku adalah "+human.nama);
        System.out.println("Tahun ini berumur "+human.umur);
        System.out.println("Tinggal di "+human.alamat);
        
        human.berjalan();
        human.berlari();
    }
    
}
