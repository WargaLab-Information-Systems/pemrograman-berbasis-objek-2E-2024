package modul4.modul5;


public class KaryawanTetap extends Karyawan {
    private double gajiBulanan;

    public KaryawanTetap(String nama, int usia, String posisi, double gajiBulanan) {
        super(nama, usia, posisi);
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Usia\t\t: " + usia);
        System.out.println("Posisi\t\t: " + posisi);
        System.out.println("Gaji Bulanan\t: " + gajiBulanan);
    }
}
