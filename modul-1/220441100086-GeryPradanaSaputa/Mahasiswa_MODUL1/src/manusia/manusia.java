/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manusia;
public class manusia {
       String nama,alamat;
       int umur;
       
    void berjalan(){
        System.out.println("Gery bisa berjalan");
    }
    void berlari(){
        System.out.println("dan Gery juga bisa berlari");
    }
   

 public static void main(String[] args) {
        
        manusia Gery= new manusia();
        
        Gery.nama = "Gery Pradana Saputra";
        System.out.println("Nama = " + Gery.nama);
        
        Gery.umur = 20;
        System.out.println("umur = " + Gery.umur);
        
        Gery.alamat = "Bangkalan";
        System.out.println("alamat = " + Gery.alamat);
        
        Gery.berjalan();
        Gery.berlari();
        
    } 
}