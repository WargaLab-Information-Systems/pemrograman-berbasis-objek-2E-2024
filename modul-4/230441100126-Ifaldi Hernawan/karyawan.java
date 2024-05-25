/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul5praktikum;

/**
 *
 * @author LENOVO
 */
abstract class karyawan {
    public String nama;
    public int umur;
    public String posisi;
    
    public karyawan(String nama, int umur, String posisi){
        this.posisi = posisi;
        this.nama = nama;
        this.umur = umur;
        this.posisi = posisi;
    }
    
 abstract void tampilkanData();   
}
