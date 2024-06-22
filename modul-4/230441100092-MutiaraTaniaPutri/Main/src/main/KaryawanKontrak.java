
package main;

public class KaryawanKontrak extends Karyawan{

    int upahPerjam;
    int jumlahJamKerja;
    
        
    public KaryawanKontrak(String nama, int usia, String posisi, int upahPerjam, int jumlahJamKerja) {
        super(nama, usia, posisi);
        this.upahPerjam = upahPerjam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    
    @Override
    public void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Posisi : " + posisi);
        System.out.println("Upah perjam : " + upahPerjam);
        System.out.println("Jumlah jam kerja : " + jumlahJamKerja);
//        int gaji = hitungGaji();
        System.out.println("Gaji Karyawan Kontrak : " + hitungGaji());
    }
    
    public int hitungGaji(){
        return upahPerjam * jumlahJamKerja;
    }
   
}
