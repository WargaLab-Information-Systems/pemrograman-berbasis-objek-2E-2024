/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USEr
 */
public abstract class dosen implements iddosen {
    private String nama;
    private String nik;
    private int umur;
    private char jeniskelamin;

    public dosen(String nama, String nik, int umur, char jeniskelamin) {
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
        this.jeniskelamin = jeniskelamin;
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
        return jeniskelamin;
    }

    public void setJenisKelamin(char jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public abstract void tampilkanInfo();
}
