/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author Lenovo
 */
public class Manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        method identitas = new method();
        identitas.nama = "Diah Ayu Nurmala";
        identitas.umur = 19;
        identitas.alamat = "ds.Pakel, Kec.Montong, Kab. Tuban";
        
        System.out.println("Nama Saya Adalah =" + identitas.nama);
        System.out.println("Umur Saya Adalah = "+ identitas.umur);
        System.out.println("Alamat Saya Berada Di = "+ identitas.alamat);
        
        identitas.berjalan();
        identitas.berlari();
    }
    
}
