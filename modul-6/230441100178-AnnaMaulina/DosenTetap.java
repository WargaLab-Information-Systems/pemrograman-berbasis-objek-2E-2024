package datadosen;
public class DosenTetap extends Dosen {
    private double gajiPokok;
    private double tunjangan;

    public DosenTetap(String nama, String nik, int umur, char jenisKelamin, double gajiPokok, double tunjangan) {
        super(nama, nik, umur, jenisKelamin);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    // method setter getter
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("========== Dosen Tetap ==========");
        System.out.println("Nama          : " + getNama());
        System.out.println("NIK           : " + getNik());
        System.out.println("Umur          : " + getUmur() + " tahun");
        System.out.println("Jenis Kelamin : " + getJenisKelamin());
        System.out.println("Gaji Pokok    : Rp." + gajiPokok);
        System.out.println("Tunjangan     : Rp." + tunjangan);
        System.out.println("Total Gaji    : Rp." + hitungGaji());
    }
}
