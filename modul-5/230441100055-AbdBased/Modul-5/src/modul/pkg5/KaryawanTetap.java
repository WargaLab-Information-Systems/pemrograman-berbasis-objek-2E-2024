/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg5;

/**
 *
 * @author AbasZ
 */
public class KaryawanTetap extends Karyawan{
    double gajibulanan;
    
    public KaryawanTetap(String nama, int usia, String posisi){
        super(nama, usia, posisi);
        this.gajibulanan = 0;
    }
    
    public KaryawanTetap(String nama, int usia, String posisi, double gajibulanan){
        super(nama, usia, posisi);
        this.gajibulanan = gajibulanan;
    }
    
    @Override
    void tampilkanData(){
        System.out.println("===== Karyawan Tetap =====");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Posisi : " + posisi);
        System.out.println("Gaji : " + gajibulanan);
    }
}
