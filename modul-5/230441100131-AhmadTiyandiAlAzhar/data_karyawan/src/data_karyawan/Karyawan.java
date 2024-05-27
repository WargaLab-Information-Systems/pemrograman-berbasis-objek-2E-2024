/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_karyawan;

/**
 *
 * @author ahmad
 */
 
public abstract class Karyawan {
    protected String nama;
    protected int usia;
    protected String posisi;

    public Karyawan(String nama, int usia, String posisi) {
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
    }

    public abstract void tampilkanData();
}