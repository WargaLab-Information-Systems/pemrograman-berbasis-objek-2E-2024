/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;

/**
 *
 * @author Safira
 */
public class DosenTetap extends Dosen {
    private double gajiPokok;
    private double tunjangan;

    public DosenTetap(String nama, String nik, int umur, char jenisKelamin, String instansi, double gajiPokok, double tunjangan) {
        super(nama, nik, umur, jenisKelamin, instansi);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }


    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Mengajar di: " + getInstansi());
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + hitungGaji());
    }
}
