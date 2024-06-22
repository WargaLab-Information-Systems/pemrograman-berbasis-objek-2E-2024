package perusahaan;

public class KaryawanTetap extends Karyawan {
    private int gajiBulanan;

    public KaryawanTetap(String nama, String posisi, int usia, int gajiBulanan) {
        super(nama, posisi, usia);
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + posisi);
        System.out.println("Usia: " + usia);
        System.out.println("Gaji Bulanan: " + gajiBulanan);
    }
}
