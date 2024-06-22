
package main;
import java.util.Scanner;
//import java.util.ArrayList;


public class DataKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
//        ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
//        KaryawanKontrak karyawanKontrak = new KaryawanKontrak();

        
        System.out.println("Masukkan Nama Anda : ");
        String nama = input.nextLine();
//        input.nextLine();
        
        System.out.println("Masukkan Usia Anda : ");
        int usia = input.nextInt();
        input.nextLine();
        
        System.out.println("Masukkan Posisi Karyawan Anda (tetap/kontrak) : ");
        String posisi = input.nextLine();
        input.nextLine();
        
        Karyawan data = null;
        
        if (posisi.equalsIgnoreCase("tetap")) {
            System.out.println("Masukkan gaji bulanan Anda : ");
            String gajiBulanan = input.nextLine();
            data = new KaryawanTetap(nama, usia, posisi, gajiBulanan);
//            dataKaryawan.add(new KaryawanTetap(nama, usia, posisi, gajiBulanan));
        } else if (posisi.equalsIgnoreCase("kontrak")) {
            System.out.println("Masukkan upah perjam Anda : ");
            int upahPerjam = input.nextInt();
            System.out.println("Masukkan jumlah jam kerja Anda : ");
            int jumlahJamKerja = input.nextInt();
            data = new KaryawanKontrak(nama, usia, posisi, upahPerjam, jumlahJamKerja);
//            dataKaryawan.add(new KaryawanKontrak(nama, usia, posisi, upahPerjam, jumlahJamKerja));            
        } else {
            System.out.println("Posisi Karyawan Anda tidak valid!");
        }    

        System.out.println("\nData Karyawan : ");
//        for (Karyawan data : dataKaryawan) {
            data.tampilkanData();
//            System.out.println("---------------------");
//        }        
              
    }

    
}
