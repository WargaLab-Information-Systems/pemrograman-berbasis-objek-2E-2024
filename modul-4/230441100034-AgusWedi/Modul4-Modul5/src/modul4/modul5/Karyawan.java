package modul4.modul5;

public abstract class Karyawan {
    protected String nama;
    protected int usia;
    protected String posisi;

    public Karyawan(String nama, int usia, String posisi) {
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
    }

    public abstract void tampilkanData();
}

