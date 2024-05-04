/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1no1manusia;
    class Manusia {
    String Nama ;
    String Alamat ;
    int Umur ;

    void berjalan () {
    System.out.println("Objek " + Nama + " sedang berjalan");
    }
   void berlari () {
    System.out.println("Objek " + Nama + " sedang berlari"); 
    }
}
/**
 *
 * @author ASUS
 */
public class Modul1no1manusia {
    public static void main(String[] args) {
            Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.Nama = "Agung";
        orang1.Umur = 20;
        orang1.Alamat = "Bangkalan";
        System.out.println("Nama Objek 1 adalah : " + orang1.Nama);
        System.out.println("Umur Objek 1 adalah : " + orang1.Umur);
        System.out.println("Objek 1 Berasal : " + orang1.Alamat);
        orang1.berjalan(); 
        orang1.berlari();
        
        orang2.Nama = "Putra";
        orang2.Umur = 20;
        orang2.Alamat = "Bangkalan";
        System.out.println("Nama Objek 2 adalah : " + orang2.Nama);
        System.out.println("Umur Objek 2 adalah : " + orang2.Umur);
        System.out.println("Objek 2 Berasal : " + orang2.Alamat);
        orang2.berjalan();
        orang2.berlari();

    }
}

