
package main;

public class KaryawanTetap extends Karyawan{

    String gajiBulanan;
    
    public KaryawanTetap(String nama, int usia, String posisi, String gajiBulanan) {
        super(nama, usia, posisi);  
        this.gajiBulanan = gajiBulanan;
    }
    
    @Override
    public void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Posisi : " + posisi);
        System.out.println("Gaji Bulanan : " + gajiBulanan);
    }
    
    
    
}
