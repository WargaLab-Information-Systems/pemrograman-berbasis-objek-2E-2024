/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package makhlukhidup;

/**
 *
 * @author mutia
 */
public class MakhlukHidup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia Srigala = new Manusia();
        
        Srigala.nama="Solon";
        Srigala.umur=150;
        Srigala.alamat="Gray City";
        
        Srigala.Berjalan();
        Srigala.Berlari();
        
        System.out.println("Srigala itu bernama "+Srigala.nama);
        System.out.println("Srigala itu berumur "+Srigala.umur);
        System.out.println("Srigala itu tinggal di kota "+Srigala.alamat);
    }
    
}
