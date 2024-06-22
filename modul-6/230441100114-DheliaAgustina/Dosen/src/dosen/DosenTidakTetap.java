/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;

public class DosenTidakTetap extends Dosen {
    private int jamMengajar;
    private double honorPerjam;
    private String instansi;

    public DosenTidakTetap(String nama, String nik, int umur, char jenisKelamin, int jamMengajar, double honorPerjam, String instansi) {
        super(nama, nik, umur, jenisKelamin);//memanggil
        this.jamMengajar = jamMengajar;
        this.honorPerjam = honorPerjam;
        this.instansi = instansi;
    }

    // Setter methods
    public void setJamMengajar(int jamMengajar) {
        this.jamMengajar = jamMengajar;
    }

    public void setHonorPerjam(double honorPerjam) {
        this.honorPerjam = honorPerjam;
    }
    public void setInstansi(String instansi){
        this.instansi = instansi;
    }

    // Getter methods
    public int getJamMengajar() {
        return jamMengajar;
    }

    public double getHonorPerjam() {
        return honorPerjam;
    }
    public String getInstansi(){
        return instansi;
    }

    @Override
    public double hitungGaji() {
        return jamMengajar * honorPerjam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Dosen Tidak Tetap");
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Jam Mengajar: " + jamMengajar);
        System.out.println("Honor Per Jam: " + honorPerjam);
        System.out.println("Total Gaji: " + hitungGaji());
         System.out.println("Instansi:" + instansi);
    }
}

