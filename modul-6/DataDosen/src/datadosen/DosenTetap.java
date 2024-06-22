package datadosen;

public class DosenTetap extends DataDosen {
    private double gajiPokok;
    private double tunjangan;

    public DosenTetap(String nama, String nik, int umur, String jurusanDosen, char jenisKelamin, double gajiPokok, double tunjangan) {
        super(nama, nik, umur, jurusanDosen, jenisKelamin);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("===Data Dosen Tetap===");
        System.out.println("Nama            : " + getNama());
        System.out.println("NIK             : " + getNik());
        System.out.println("Umur            : " + getUmur());
        System.out.println("Jurusan Dosen   : " + getJurusanDosen());
        System.out.println("Jenis Kelamin   : " + getJenisKelamin());
        System.out.println("Gaji Pokok      : " + getGajiPokok());
        System.out.println("Tunjangan Tetap : " + getTunjangan());
        System.out.println("Gaji Total      : " + hitungGaji());
    }
}
