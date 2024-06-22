package perusahaan;
// subclass dari class Karyawan
public class KaryawanKontrak extends Karyawan {
    int upahPerJam;
    int jumlahJamKerja;
    int totalUpah;
    
    public KaryawanKontrak(String nama, int usia, String posisi, int upahPerJam, int jumlahJamKerja, int totalUpah) {
        super(nama, usia, posisi);
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
        this.totalUpah = totalUpah;
    }

    // override abstract method yang ada di class Karyawan
    @Override
    public void tampilkanData() {
        System.out.println("====== Karyawan Kontrak ======");
        System.out.println("Nama             : " + nama);
        System.out.println("Usia             : " + usia + " tahun");
        System.out.println("Posisi           : " + posisi);
        System.out.println("Upah per jam     : Rp." + upahPerJam);
        System.out.println("Jumlah jam kerja : " + jumlahJamKerja + " jam");
        System.out.println("Total upah       : Rp." + totalUpah);
    }
}