
package modul45;

/**
 *
 * @author ADITYA
 */
public class KaryawanKontrak extends Karyawan{
    double upahPerJam;
    int jumlahJamKerja;

    public KaryawanKontrak(String nama, int usia, String posisi, double upahPerJam, int jumlahJamKerja) {
        super(nama, usia, posisi);
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    @Override
    void tampilkanData() {
        System.out.println("===== Karyawan Kontrak =====");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Posisi : " + posisi);
        System.out.println("Upah Per Jam : " + upahPerJam);
        System.out.println("Jumlah Jam Kerja : " + jumlahJamKerja);
    }
}