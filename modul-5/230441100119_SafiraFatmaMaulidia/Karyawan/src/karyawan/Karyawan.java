/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

/**
 *
 * @author Safira
 */
public abstract class Karyawan {
    String nama;
    int usia;
    String posisi;

    
    public Karyawan(String nama, int usia, String posisi) {
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
    }

    public abstract void tampilkanData();

//    public String getNama() {
//        return nama;
//    }

//    public int getUsia() {
//        return usia;
//    }
//
//    public String getPosisi() {
//        return posisi;
//    }
}
