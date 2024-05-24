
package modul45;

/**
 *
 * @author ADITYA
 */
abstract class Karyawan {
    String nama;
    int usia;
    String posisi;
    
    public Karyawan(String nama, int usia, String posisi){
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
    }
    
    abstract void tampilkanData();
}