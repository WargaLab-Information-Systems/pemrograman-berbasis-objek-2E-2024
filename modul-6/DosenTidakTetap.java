/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datadosen;

/**
 *
 * @author user
 */
public class DosenTidakTetap extends Dosen {
    private int jamMengajar;
    private double honorPerjam;

    public DosenTidakTetap(String nama, String nik, int umur, char jenisKelamin, int jamMengajar, double honorPerjam) {
        super(nama, nik, umur, jenisKelamin);
        this.jamMengajar = jamMengajar;
        this.honorPerjam = honorPerjam;
    }

    public int getJamMengajar() {
        return jamMengajar;
    }

    public void setJamMengajar(int jamMengajar) {
        this.jamMengajar = jamMengajar;
    }

    public double getHonorPerjam() {
        return honorPerjam;
    }

    public void setHonorPerjam(double honorPerjam) {
        this.honorPerjam = honorPerjam;
    }

    @Override
    public double hitungGaji() {
        return jamMengajar * honorPerjam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Jam Mengajar: " + getJamMengajar());
        System.out.println("Honor Per Jam: " + getHonorPerjam());
        System.out.println("Total Gaji: " + hitungGaji());
    }
}
