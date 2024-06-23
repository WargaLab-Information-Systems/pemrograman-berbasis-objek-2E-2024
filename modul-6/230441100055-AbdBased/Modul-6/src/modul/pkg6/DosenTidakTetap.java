/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author AbasZ
 */
public class DosenTidakTetap extends Dosen {
    private int jamMengajar;
    private double gajiPerJam;

    public DosenTidakTetap(String nama, String nik, int umur, char jenisKelamin, int jamMengajar, double honorPerJam) {
        super(nama, nik, umur, jenisKelamin);
        this.jamMengajar = jamMengajar;
        this.gajiPerJam = honorPerJam;
    }

    public int getJamMengajar() {
        return jamMengajar;
    }

    public void setJamMengajar(int jamMengajar) {
        this.jamMengajar = jamMengajar;
    }

    public double getHonorPerJam() {
        return gajiPerJam;
    }

    public void setHonorPerJam(double honorPerJam) {
        this.gajiPerJam = honorPerJam;
    }

    @Override
    public double hitungGaji() {
        return jamMengajar * gajiPerJam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Jam Mengajar: " + jamMengajar);
        System.out.println("Honor Per Jam: " + gajiPerJam);
        System.out.println("Total Gaji: " + hitungGaji());
    }
}
