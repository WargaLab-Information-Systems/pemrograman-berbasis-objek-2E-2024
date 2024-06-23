/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doosen;

/**
 *
 * @author Ivan Aditama
 */
public abstract class Dosen implements IDosen{
    String nama,nik;
    int umur;
    char jenisKelamin;
    
    Dosen(String nama, String nik, int umur, char jenisKelamin){
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public int getUmur() {
        return umur;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }
    
    abstract void tampilkanInfo();
    
    
}
