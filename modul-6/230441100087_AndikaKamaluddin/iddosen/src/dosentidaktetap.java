/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USEr
 */
public class dosentidaktetap extends dosen {
    private double honorperjam;
    private int jammengajar;

    public dosentidaktetap(String nama, String nik, int umur, char jeniskelamin, int jammengajar, double honorperjam) {
        super(nama, nik, umur, jeniskelamin);
        this.jammengajar = jammengajar;
        this.honorperjam = honorperjam;
    }

    public double getHonorPerJam() {
        return honorperjam;
    }

    public void setHonorPerJam(double honorperjam) {
        this.honorperjam = honorperjam;
    }

    public int getJamMengajar() {
        return jammengajar;
    }

    public void setJamMengajar(int jammengajar) {
        this.jammengajar = jammengajar;
    }

    @Override
    public double hitungGaji() {
        return jammengajar * honorperjam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("dosen tidak tetap :");
        System.out.println("nama : " + getNama());
        System.out.println("nik : " + getNik());
        System.out.println("umur : " + getUmur());
        System.out.println("jenis kelamin : " + getJenisKelamin());
        System.out.println("jam mengajar : " + jammengajar);
        System.out.println("honor per jam : " + honorperjam);
        System.out.println("total gaji : " + hitungGaji());
    }
}
