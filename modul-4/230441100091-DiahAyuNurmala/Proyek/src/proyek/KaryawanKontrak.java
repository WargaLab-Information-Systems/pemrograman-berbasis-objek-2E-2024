/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyek;

/**
 *
 * @author Lenovo
 */
class KaryawanKontrak extends Karyawan {
    private int upahPerJam;
    private int jumlahJamKerja;
    private String jeniskelamin;
    

    public KaryawanKontrak(String nama, int usia, String posisi, int upahPerJam, int jumlahJamKerja, String jeniskelamin) {
        super(nama, usia, posisi);
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
        this.jeniskelamin = jeniskelamin;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Posisi: " + posisi);
        System.out.println("Upah Per Jam: Rp" + upahPerJam);
        System.out.println("Jumlah Jam Kerja: " + jumlahJamKerja);
        System.out.println("Total Upah: Rp" + (upahPerJam * jumlahJamKerja));
        System.out.println("jeniskelamin : "+ jeniskelamin);
    }
}

