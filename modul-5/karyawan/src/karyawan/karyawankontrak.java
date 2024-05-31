/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

class karyawankontrak extends Karyawan {
    int upahPerJam;
    int jumlahJamKerja;

    public karyawankontrak(String nama, int usia, String posisi, int upahPerJam, int jumlahJamKerja) {
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Posisi: " + posisi);
        System.out.println("Jenis: Karyawan Kontrak");
        System.out.println("Upah Per Jam: " + upahPerJam);
        System.out.println("Jumlah Jam Kerja: " + jumlahJamKerja);
    }
}
