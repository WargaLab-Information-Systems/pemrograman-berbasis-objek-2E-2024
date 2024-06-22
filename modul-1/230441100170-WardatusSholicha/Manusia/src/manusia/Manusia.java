/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;


public class Manusia {

    public static void main(String[] args) {
        method identitas = new method();
        identitas.nama="Wardatus Sholicha";
        identitas.umur=19;
        identitas.alamat="Surabaya";
        
        System.out.println("Nama Saya "+identitas.nama);
        System.out.println("Umur Saya "+identitas.umur);
        System.out.println("Alamat Saya "+identitas.alamat);
        
        identitas.berjalan();
        identitas.berlari();
    }
    
}
