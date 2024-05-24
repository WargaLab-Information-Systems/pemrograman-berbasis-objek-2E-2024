
package modul45;

/**
 *
 * @author ADITYA
 */
public class KaryawanTetap extends Karyawan{
    double gajibulanan;
    
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