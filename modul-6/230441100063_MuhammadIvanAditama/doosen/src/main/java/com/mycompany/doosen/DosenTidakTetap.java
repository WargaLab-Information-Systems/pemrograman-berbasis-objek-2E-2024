/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doosen;

/**
 *
 * @author Ivan Aditama
 */
public class DosenTidakTetap extends Dosen implements IDosen{
    double honorPerJam;
    int jamMengajar;

    public DosenTidakTetap(String nama, String nik, int umur, char jenisKelamin, int jamMengajar, double honorPerJam) {
        super(nama, nik, umur, jenisKelamin);
        this.jamMengajar = jamMengajar;
        this.honorPerJam = honorPerJam;
    }

    @Override
    void tampilkanInfo() {
        System.out.println("Nama : "+nama);
        System.out.println("NIK : "+nik);
        System.out.println("Umur : "+umur);
        System.out.println("Jenis kelamin : "+jenisKelamin);
        System.out.println("Jam mengajar : "+jamMengajar);
        System.out.println("Honor mengajar : "+honorPerJam);
    }

    @Override
    public void hitungGaji() {
        double a = jamMengajar + honorPerJam;
        System.out.println("Gaji dosen tidak tetap : " + a);
    }
    
}
