/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

class karyawantetap extends Karyawan {
    int gajiBulanan;

    public karyawantetap(String nama, int usia, String posisi, int gajiBulanan) {
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Posisi: " + posisi);
        System.out.println("Jenis: Karyawan Tetap");
        System.out.println("Gaji Bulanan: " + gajiBulanan);
    }
}

