package perusahaan;
// abstract class
public abstract class Karyawan {
    protected String nama;
    protected int usia;
    protected String posisi;
    
    public Karyawan (String nama, int usia, String posisi) {
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
    }
    
    // abstract method
    public abstract void tampilkanData();
}