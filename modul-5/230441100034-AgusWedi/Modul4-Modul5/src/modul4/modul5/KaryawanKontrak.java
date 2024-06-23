package modul4.modul5;

public class KaryawanKontrak extends Karyawan {
    private double upahPerJam;
    private int jumlahJamKerja;

    public KaryawanKontrak(String nama, int usia, String posisi, double upahPerJam, int jumlahJamKerja) {
        super(nama, usia, posisi);
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Usia\t\t\t: " + usia);
        System.out.println("Posisi\t\t\t: " + posisi);
        System.out.println("Upah Per Jam\t\t: " + upahPerJam);
        System.out.println("Jumlah Jam Kerja\t: " + jumlahJamKerja);
    }
}