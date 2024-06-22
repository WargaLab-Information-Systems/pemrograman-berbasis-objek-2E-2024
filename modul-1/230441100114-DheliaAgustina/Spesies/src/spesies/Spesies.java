/*modul 1 tugas 1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spesies;

/**
 *
 * @author LENOVO
 */
public class Spesies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Manusia dewa = new Manusia();
      
      dewa.nama ="zeus";
      dewa.umur =1500;
      dewa.alamat="olympus";
     
      dewa.berjalan();
      dewa.berlari();
      
      System.out.println("dewa itu bernama " + dewa.nama);
      System.out.println("dewa itu berumur " + dewa.umur);
      System.out.println("dewa itu tinggal di " + dewa.alamat);
    }
    
}
