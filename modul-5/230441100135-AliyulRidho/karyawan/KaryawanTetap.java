/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

/**
 *
 * @author Ridho
 */
class KaryawanTetap extends Karyawan{
    private double gajiBulanan;
    public KaryawanTetap(String nama, int usia, String posisi, double gajiBulanan) {
        super(nama, usia, posisi);
        this.gajiBulanan = gajiBulanan;
    }
    @Override
    public void Display() {
        System.out.println("_________RINGKASAN PENDATAAN KARYAWAN TETAP_________");
        System.out.println("");
        System.out.println("Nama            : " + nama);
        System.out.println("Usia            : " + usia);
        System.out.println("Posisi          : " + posisi);
        System.out.println("Status Karyawan : Keryawan Tetap");
        System.out.println("Gaji Bulanan    : "+ gajiBulanan +" Rupian");
        System.out.println("____________________________________________________");
        


        
    }
    
}
