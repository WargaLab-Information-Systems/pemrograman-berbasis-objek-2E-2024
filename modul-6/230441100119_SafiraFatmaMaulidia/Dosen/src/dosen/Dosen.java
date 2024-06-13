/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;

/**
 *
 * @author Safira
 */
public abstract class Dosen implements IDosen {
    private String nama;
    private String nik;
    private int umur;
    private char jenisKelamin;
    private String instansi;

    public Dosen(String nama, String nik, int umur, char jenisKelamin, String instansi) {
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.instansi= instansi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getInstansi() {
        return instansi;
    }

    public void setInstansi(String instansi) {
        this.instansi = instansi;
    }

    public abstract void tampilkanInfo();
}
