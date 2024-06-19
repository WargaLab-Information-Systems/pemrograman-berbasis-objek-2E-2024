/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyek;

/**
 *
 * @author Lenovo
 */
class KaryawanTetap extends Karyawan {
    int gajiBulanan;
    String jeniskelamin;

    public KaryawanTetap(String nama, int usia, String posisi, int gajiBulanan, String jeniskelamin) {
        super(nama, usia, posisi);
        this.gajiBulanan = gajiBulanan;
        this.jeniskelamin = jeniskelamin;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Posisi: " + posisi);
        System.out.println("Gaji Bulanan: Rp" + gajiBulanan);
        System.out.println("Jenis Kelamin: "+jeniskelamin);
    }
}

