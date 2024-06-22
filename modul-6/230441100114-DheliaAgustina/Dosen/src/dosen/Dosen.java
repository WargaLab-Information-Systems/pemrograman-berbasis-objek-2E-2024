/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosen;

public abstract class Dosen implements IDosen {
    private String nama;
    private String nik;
    private int umur;
    private char jenisKelamin;//menyimpan satu karakter tunggal

    public Dosen(String nama, String nik, int umur, char jenisKelamin) {
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {  
        this.nik = nik;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public int getUmur() {
        return umur;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    // Abstract method
    public abstract void tampilkanInfo();
}



