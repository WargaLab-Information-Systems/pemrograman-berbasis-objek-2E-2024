/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USEr
 */
public class dosentetap extends dosen {
    private double gajipokok;
    private double tunjangan;

    public dosentetap(String nama, String nik, int umur, char jeniskelamin, double gajipokok, double tunjangan) {
        super(nama, nik, umur, jeniskelamin);
        this.gajipokok = gajipokok;
        this.tunjangan = tunjangan;
    }

    public double getGajiPokok() {
        return gajipokok;
    }

    public void setGajiPokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajipokok + tunjangan;
    }


    @Override
    public void tampilkanInfo() {
        System.out.println("dosen tetap : ");
        System.out.println("nama : " + getNama());
        System.out.println("nik : " + getNik());
        System.out.println("umur : " + getUmur());
        System.out.println("jenis kelamin : " + getJenisKelamin());
        System.out.println("gaji pokok : " + gajipokok);
        System.out.println("tunjangan : " + tunjangan);
        System.out.println("total gaji : " + hitungGaji());
    }
}

