package perusahaan;
// subclass dari class Karyawan
public class KaryawanTetap extends Karyawan {
    String gajiBulanan;
    
    public KaryawanTetap(String nama, int usia, String posisi, String gajiBulanan) {
        super(nama, usia, posisi);
        this.gajiBulanan = gajiBulanan;
    }
    
    // override abstract method yang ada di class Karyawan
    @Override
    public void tampilkanData() {
        System.out.println("======= Karyawan tetap =======");
        System.out.println("Nama         : " + nama);
        System.out.println("Usia         : " + usia + " tahun");
        System.out.println("Posisi       : " + posisi);
        System.out.println("Gaji Bulanan : Rp." + gajiBulanan);
    }
}