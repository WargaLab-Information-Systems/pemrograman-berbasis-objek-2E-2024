package perusahaan;

public abstract class Karyawan {
    protected String nama;
    protected String posisi;
    protected int usia;

    public Karyawan(String nama, String posisi, int usia) {
        this.nama = nama;
        this.posisi = posisi;
        this.usia = usia;
    }

    public abstract void tampilkanData();
}
