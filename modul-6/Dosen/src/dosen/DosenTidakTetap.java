/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;


public class DosenTidakTetap extends Dosen {
     int jamMengajar;
     int honorPerJam;

    public DosenTidakTetap(String nama, String nik, int umur, char jenisKelamin, int jamMengajar, int honorPerJam) {
        super(nama, nik, umur, jenisKelamin);
        this.jamMengajar = jamMengajar;
        this.honorPerJam = honorPerJam;
    }

    public int getJamMengajar() {
        return jamMengajar;
    }

    public void setJamMengajar(int jamMengajar) {
        this.jamMengajar = jamMengajar;
    }

    public int getHonorPerJam() {
        return honorPerJam;
    }

    public void setHonorPerJam(int honorPerJam) {
        this.honorPerJam = honorPerJam;
    }

    @Override
    public int hitungGaji() {
        return jamMengajar * honorPerJam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Jam Mengajar: " + getJamMengajar());
        System.out.println("Honor per Jam: " + getHonorPerJam());
        System.out.println("Total Gaji:"+ hitungGaji());
    }
}