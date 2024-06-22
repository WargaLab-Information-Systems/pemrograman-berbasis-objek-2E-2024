
package manajemendata;

public abstract class Dosen implements IDosen{
    String nama;
    String nik;
    int umur;
    char jenisKelamin;
    String instansi;
    
    public Dosen(String nama, String nik, int umur, char jenisKelamin, String instansi){
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.instansi = instansi;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }

    public void setNik(String nik){
        this.nik = nik;
    }
    public String getNik(){
        return nik;
    } 
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    public int getUmur(){
        return umur;
    }
    
    public void setJenisKelamin(char jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public char getJenisKelamin(){
        return jenisKelamin;
    }
    
    public void setInstansi(String instansi){
        this.instansi = instansi;
    }
    public String getInstansi(){
        return instansi;
    }
    
    public abstract void tampilkanInfo();

}
