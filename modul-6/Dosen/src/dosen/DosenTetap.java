/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;


public class DosenTetap extends Dosen {
     int gajiPokok;
     int tunjangan;

    public DosenTetap(String nama, String nik, int umur, char jenisKelamin, int gajiPokok, int tunjangan) {
        super(nama, nik, umur, jenisKelamin);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public int hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Tunjangan: " + getTunjangan());
        System.out.println("Total Gaji:" + hitungGaji());
    }
}


