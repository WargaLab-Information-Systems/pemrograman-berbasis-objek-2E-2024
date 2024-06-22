/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5praktikum;

/**
 *
 * @author LENOVO
 */
public class karyawanKontrak extends karyawan{
    public double upahPerJam;
    public double jumlahJamKerja;
    
    public karyawanKontrak(String nama, int umur, String posisi, double upahPerJam, double jumlahJamKerja){
        super(nama, umur, posisi);
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Karyawan Kontrak");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + umur);
        System.out.println("Posisi: " + posisi);
        System.out.println("Upah per Jam: " + upahPerJam);
        System.out.println("Jumlah Jam Kerja: " + jumlahJamKerja);
        System.out.println("Total Upah: " + (upahPerJam * jumlahJamKerja));
    }
}

