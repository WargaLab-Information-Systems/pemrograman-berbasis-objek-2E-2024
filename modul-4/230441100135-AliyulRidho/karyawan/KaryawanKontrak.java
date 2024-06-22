/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

/**
 *
 * @author Ridho
 */
class KaryawanKontrak extends Karyawan {
    private double upahPerJam;
    private int jumlahJamKerja;
    private int jumlahUpah;

    public KaryawanKontrak(String nama, int usia, String posisi, double upahPerJam, int jumlahJamKerja, int jumlahUpah) {
        super(nama, usia, posisi);
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
        this.jumlahUpah = jumlahUpah;
    }

    @Override
    public void Display() {
        System.out.println("________RINGKASAN PENDATAAN KARYAWAN KONTRAK________");
        System.out.println("");
        System.out.println("Nama            : " + nama);
        System.out.println("Usia            : " + usia);
        System.out.println("Posisi          : " + posisi);
        System.out.println("Jenis Karyawan  : Karyawan Kontrak");
        System.out.println("Upah Per Jam    : " + upahPerJam + " Ruapian");
        System.out.println("Jumlah Jam Kerja: " + jumlahJamKerja + " Jam");
        System.out.println("Jumlah Upah     : " + jumlahUpah + " Rupiah");
        System.out.println("____________________________________________________");
        System.out.println();
    }
}
