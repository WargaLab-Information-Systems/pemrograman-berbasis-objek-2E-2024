package datadosen;

public abstract class DataDosen implements IDosen {
    private String nama;
    private String nik;
    private String jurusanDosen;
    private int umur;
    private char jenisKelamin;

    public DataDosen(String nama, String nik, int umur, String jurusanDosen, char jenisKelamin) {
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
        this.jurusanDosen = jurusanDosen;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getJurusanDosen() {
        return jurusanDosen;
    }

    public void setJurusanDosen(String jurusanDosen) {
        this.jurusanDosen = jurusanDosen;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public abstract void tampilkanInfo();
}
