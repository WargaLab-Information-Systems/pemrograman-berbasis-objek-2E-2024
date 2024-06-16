/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doosen;

/**
 *
 * @author Ivan Aditama
 */
public class DosenTetap extends Dosen implements IDosen{
    double gajiPokok, tunjangan;

    public DosenTetap(String nama, String nik, int umur, char jenisKelamin, double gajiPokok, double tunjangan) {
        super(nama, nik, umur, jenisKelamin);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    @Override
    void tampilkanInfo() {
        System.out.println("Nama : "+nama);
        System.out.println("NIK : "+nik);
        System.out.println("Umur : "+umur);
        System.out.println("Jenis kelamin : "+jenisKelamin);
        System.out.println("Gaji pokok : "+gajiPokok);
        System.out.println("Tunjangan : "+tunjangan);
    }

    @Override
    public void hitungGaji() {
        double a = gajiPokok + tunjangan;
        System.out.println("Gaji dosen tetap : " + a);
    }
    
}
