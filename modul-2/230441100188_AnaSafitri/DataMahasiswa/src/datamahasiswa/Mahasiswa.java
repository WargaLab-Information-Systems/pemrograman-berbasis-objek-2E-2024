package datamahasiswa;

public class Mahasiswa {
    public String nim;
    public String nama;
    public String alamat;

    public Mahasiswa(String nim, String nama, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + "\nNama: " + nama + "\nAlamat: " + alamat;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}