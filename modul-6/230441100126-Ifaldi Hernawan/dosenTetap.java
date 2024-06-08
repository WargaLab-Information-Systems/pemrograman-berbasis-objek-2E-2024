/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;

/**
 *
 * @author LENOVO
 */
public class dosenTetap extends Dosen{
    public double gajiPokok;
    public double tunjangan;
    
    public dosenTetap(String nama, String nik, int umur, char jenisKelamin, double gajiPokok, double tunjangan) {
        super(nama, nik, umur, jenisKelamin);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }
    
    public double getgajiPokok(){
            return gajiPokok;
    }
    
    public void setgajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    public double gettunjangan(){
        return tunjangan;
    }
    
    public void settunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return this.gajiPokok;
}
    @Override
    public void tampilkanInfo(){
        System.out.println("Dosen Tetap");
        System.out.println("Nama : " + getnama());
        System.out.println("Nik : " + getnik());
        System.out.println("Umur : " + getumur());
        System.out.println("Jenis Kelamin : " + getjenisKelamin());
        System.out.println("Gaji Pokok : " + getgajiPokok());
        System.out.println("Tunjangan : " + gettunjangan());
        System.out.println("Total Gaji : " + hitungGaji());
    }
}
