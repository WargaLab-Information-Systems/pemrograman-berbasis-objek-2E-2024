/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5praktikum;

/**
 *
 * @author LENOVO
 */
public class karyawanTetap extends karyawan{
    public double gajiBulanan;
    
    public karyawanTetap(String nama, int umur, String posisi, double gajibulanan){
        super(nama, umur, posisi);
        this.gajiBulanan = gajibulanan;
    }
    
    @Override
    public void tampilkanData(){
        System.out.println("Karyawan Tetap");
        System.out.println("Nama :"+ nama);
        System.out.println("Umur :"+ umur);
        System.out.println("Posisi :"+ posisi);
        System.out.println("Gaji Bulanan :"+ gajiBulanan);
    }
}
