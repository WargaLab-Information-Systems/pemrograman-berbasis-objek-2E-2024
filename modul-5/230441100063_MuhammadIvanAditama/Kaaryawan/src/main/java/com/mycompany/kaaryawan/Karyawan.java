/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kaaryawan;

/**
 *
 * @author Ivan Aditama
 */
public abstract class Karyawan {
    String nama, posisi;
    int usia;
    
    Karyawan(String nama, int usia, String posisi){
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
    }
    abstract void tampilkanData();

}
