package datadosen;
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

    // method setter getter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        return (jenisKelamin == 'L' || jenisKelamin =='l') ? "Laki-laki" : "Perempuan"; 
    }
    
    public abstract void tampilkanInfo();
}
