/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg4;

/**
 *
 * @author AbasZ
 */
public class KaryawanKontrak extends Karyawan{
    double upahPerJam;
    int jumlahJamKerja;

    public KaryawanKontrak(String nama, int usia, String posisi) {
        super(nama, usia, posisi);
        this.upahPerJam = 0;
        this.jumlahJamKerja = 0;
    }
    
    public KaryawanKontrak(String nama, int usia, String posisi, double upahPerJam, int jumlahJamKerja) {
        super(nama, usia, posisi);
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    @Override
    void tampilkanData() {
        System.out.println("===== Karyawan Kontrak =====");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Posisi : " + posisi);
        System.out.println("Upah Per Jam : " + upahPerJam);
        System.out.println("Jumlah Jam Kerja : " + jumlahJamKerja);
    }
}
