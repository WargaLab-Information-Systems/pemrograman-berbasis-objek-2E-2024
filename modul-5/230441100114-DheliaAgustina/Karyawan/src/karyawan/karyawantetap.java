package karyawan;

public class karyawantetap extends Karyawan {
    private double gaji; 

    public karyawantetap(String nama, int usia, String jabatan, double gaji) {
        super(nama, usia, jabatan);
        //memanggil,menerima
        this.gaji = gaji;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Bulanan: " + gaji);
    }
}

