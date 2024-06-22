package datadosen;

public class DosenTidakTetap extends DataDosen {
    private int jamMengajar;
    private double gajiPerJam;

    public DosenTidakTetap(String nama, String nik, int umur, String jurusanDosen, char jenisKelamin, int jamMengajar, double gajiPerJam) {
        super(nama, nik, umur, jurusanDosen, jenisKelamin);
        this.jamMengajar = jamMengajar;
        this.gajiPerJam = gajiPerJam;
    }

    public int getJamMengajar() {
        return jamMengajar;
    }

    public void setJamMengajar(int jamMengajar) {
        this.jamMengajar = jamMengajar;
    }

    public double getGajiPerJam() {
        return gajiPerJam;
    }

    public void setGajiPerJam(double gajiPerJam) {
        this.gajiPerJam = gajiPerJam;
    }

    @Override
    public double hitungGaji() {
        return jamMengajar * gajiPerJam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("===Data Dosen Tidak Tetap===");
        System.out.println("Nama          : " + getNama());
        System.out.println("NIK           : " + getNik());
        System.out.println("Umur          : " + getUmur());
        System.out.println("Jurusan Dosen : " + getJurusanDosen());
        System.out.println("Jenis Kelamin : " + getJenisKelamin());
        System.out.println("Jam Mengajar  : " + getJamMengajar());
        System.out.println("Honor Per Jam : " + getGajiPerJam());
        System.out.println("Gaji Total    : " + hitungGaji());
    }
}
