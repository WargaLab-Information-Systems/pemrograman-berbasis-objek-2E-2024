package modul6.pkg1;


public abstract class Dosen implements IDosen {
    private String nama;
    private String nik;
    private int umur;
    private char jenisKelamin;

    public Dosen(String nama, String nik, int umur, char jenisKelamin) {
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    // Setter and Getter methods
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

    // Abstract method
    public abstract void tampilkanInfo();
}
