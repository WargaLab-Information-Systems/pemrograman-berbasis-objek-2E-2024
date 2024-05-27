/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

class KaryawanKontrak extends Karyawan {
    private double upahPerJam;
    private int jumlahJamKerja;
    private double gajiTotal;

    public KaryawanKontrak(String nama, int usia, String posisi, double upahPerJam, int jumlahJamKerja) {
        super(nama, usia, posisi);
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
        this.gajiTotal = upahPerJam * jumlahJamKerja;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Posisi: " + posisi);
        System.out.println("Upah Per Jam: Rp" + upahPerJam);
        System.out.println("Jumlah Jam Kerja: " + jumlahJamKerja);
        System.out.println("Gaji Total: Rp" + gajiTotal);
    }
}
