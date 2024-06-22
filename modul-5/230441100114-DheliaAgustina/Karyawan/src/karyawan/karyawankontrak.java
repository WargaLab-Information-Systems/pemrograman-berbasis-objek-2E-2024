package karyawan;

public class karyawankontrak extends Karyawan {
    private double upahPerJam;
    private int jamKerja;

    public karyawankontrak(String nama, int usia, String jabatan, double upahPerJam, int jamKerja) {
        super(nama, usia, jabatan);//memanggil,menerima  
        this.upahPerJam = upahPerJam;
        this.jamKerja = jamKerja;
    }
    public double hitungTotalGaji() {
        return upahPerJam * jamKerja; 
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Upah Per Jam: " + upahPerJam);
        System.out.println("Jam Kerja: " + jamKerja);
        System.out.println("Total Gaji: " + hitungTotalGaji());
    }
}
