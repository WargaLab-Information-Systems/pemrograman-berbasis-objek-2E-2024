/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kaaryawan;

/**
 *
 * @author Ivan Aditama
 */
public class KaryawanKontrak extends Karyawan{
    String upahPerjam, jumlahJamKerja;
    
    KaryawanKontrak(String nama, int usia, String posisi, String upahPerjam, String jumlahJamKerja){
        super(nama, usia,posisi);
        this.upahPerjam = upahPerjam;
        this.jumlahJamKerja = jumlahJamKerja;
    }
    
//     @Override
//    public String toString() {
//        return "Nama            : " + nama +
//               "\nUsia              : " + usia +
//               "\nPosisi            : " + posisi +
//               "\nUpah per jam      : " + upahPerjam +
//               "\nJumlah jam kera   : " + jumlahJamKerja;
//    }
    
    @Override
    void tampilkanData() {
        System.out.println("Nama \t\t: "+nama);
        System.out.println("Usia \t\t: "+usia);
        System.out.println("Posisi \t\t: "+posisi);
        System.out.println("Upah per jam \t: "+upahPerjam);
        System.out.println("Jumlah jam kerja : "+jumlahJamKerja);
        
    }
    
//    public void run(){
//        System.out.println("Masukkan nama anda : ");
//        String nama = input.nextLine();
//        System.out.println("Masukkan usia anda : ");
//        String usia = input.nextLine();
//        System.out.println("Masukkan posisi anda : ");
//        String posisi = input.nextLine();
//        System.out.println("Masukkan upah per jam anda : ");
//        String upahPerjam = input.nextLine();  
//        System.out.println("Masukkan jumlah jam kerja anda : ");
//        String jumlahJamKerja = input.nextLine();
//        
//        KaryawanKontrak kk = new KaryawanKontrak(nama,usia,posisi,upahPerjam,jumlahJamKerja);
//        daftarKK.add(kk);
//    }
}
