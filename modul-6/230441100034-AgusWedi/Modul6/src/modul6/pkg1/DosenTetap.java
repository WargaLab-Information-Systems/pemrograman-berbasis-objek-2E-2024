package modul6.pkg1;


public class DosenTetap extends Dosen {
    private double gajiPokok;
    private double tunjangan;

    public DosenTetap(String nama, String nik, int umur, char jenisKelamin, double gajiPokok, double tunjangan) {
        super(nama, nik, umur, jenisKelamin);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    // Setter and Getter methods
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
        System.out.println("----------------------------");
        System.out.println("Dosen Tetap:");
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("NIK\t\t: " + getNik());
        System.out.println("Umur\t\t: " + getUmur());
        System.out.println("Jenis Kelamin\t: " + getJenisKelamin());
        System.out.println("Gaji Pokok\t: " + getGajiPokok());
        System.out.println("Tunjangan\t: " + getTunjangan());
        System.out.println("Total Gaji\t: " + hitungGaji());
        System.out.println("-----------------------------");
    }
}