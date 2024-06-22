package perusahaan;

public class KaryawanMagang extends Karyawan {
    private int gajiPerJam;
    private int jumlahJamKerja;

    public KaryawanMagang(String nama, String posisi, int usia, int gajiPerJam, int jumlahJamKerja) {
        super(nama, posisi, usia);
        this.gajiPerJam = gajiPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public int hitungTotalGaji() {
        return gajiPerJam * jumlahJamKerja;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + posisi);
        System.out.println("Usia: " + usia);
        System.out.println("Gaji Per Jam: " + gajiPerJam);
        System.out.println("Jumlah Jam Kerja: " + jumlahJamKerja);
        System.out.println("Total Gaji Bulanan: " + hitungTotalGaji());
    }
}
