/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.modul1;

/**
 *
 * @author ahmad
 */
public class no1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    manusia manusia1 = new manusia();
    manusia manusia2 = new manusia();
            
    manusia1.nama = "attala";
    manusia1.alamat="kamal pride";
    manusia1.umur= 18;
    
    manusia2.nama ="aditya";
    manusia2.alamat= "desa pocong";
    manusia2.umur = 17;
    
        System.out.println("nama: "+manusia1.nama);
        System.out.println("alamat: "+manusia1.alamat);
        System.out.println("umur: "+manusia1.umur);
        
        System.out.println("nama: "+manusia2.nama);
        System.out.println("alamat: "+manusia2.alamat);
        System.out.println("umur: "+manusia2.umur);
        
        manusia1.berjalan();
        manusia1.berlari();
        
        manusia2.berjalan();
        manusia2.berjalan();
    }
    
}
