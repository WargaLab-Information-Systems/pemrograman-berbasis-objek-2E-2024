/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kaaryawan;



/**
 *
 * @author Ivan Aditama
 */
public class KaryawanTetap extends Karyawan{
    String gajiBulanan;
    
    KaryawanTetap(String nama, int usia, String posisi, String gajiBulanan){
        super(nama, usia, posisi);
        this.gajiBulanan = gajiBulanan;
    }
    
//    @Override
//    public String toString() {
//        return "Nama           : " + nama +
//               "\nUsia              : " + usia +
//               "\nPosisi            : " + posisi +
//               "\nGaji bulanan      : " + gajiBulanan;
//    }
      
//    public void run(){
//        System.out.println("Masukkan nama anda : ");
//        String nama = input.nextLine();
//        System.out.println("Masukkan usia anda : ");
//        String usia = input.nextLine();
//        System.out.println("Masukkan posisi anda : ");
//        String posisi = input.nextLine();
//        System.out.println("Masukkan gaji bulanan anda : ");
//        String gajiBulanan = input.nextLine();
//        
//        KaryawanTetap kt = new KaryawanTetap(nama, usia, posisi, gajiBulanan);
//        karyawan.add(kt);
//    }
    
    @Override
    void tampilkanData(){
        System.out.println("Nama \t\t: "+nama);
        System.out.println("Usia \t\t: "+usia);
        System.out.println("Posisi \t\t: "+posisi);
        System.out.println("Gaji per bulan \t: "+gajiBulanan);
        
//        if (karyawan.isEmpty()) {
//            System.out.println("Belum ada buku di perpustakaan.");
//        } else {
//            int index = 1;
//            for (KaryawanTetap kt : karyawan) {
//                System.out.println(index + ". " + kt);
//                index++;
//            }
        
    }
}
