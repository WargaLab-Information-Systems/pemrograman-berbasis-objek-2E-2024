/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;

public class DosenTetap extends Dosen {
    private double gajiPokok;
    private double tunjangan;
    private String instansi;

    public DosenTetap(String nama, String nik, int umur, char jenisKelamin, double gajiPokok, double tunjangan, String instansi) {
        super(nama, nik, umur, jenisKelamin);//memanggil
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.instansi = instansi;
    } 

    // Setter methods
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    public void setInstansi(String instansi){
        this.instansi = instansi;
    }

    // Getter methods
    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }
    public String getInstansi(){
        return instansi;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Dosen Tetap");
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + hitungGaji());
        System.out.println("Instansi: " + instansi);
    }
}

