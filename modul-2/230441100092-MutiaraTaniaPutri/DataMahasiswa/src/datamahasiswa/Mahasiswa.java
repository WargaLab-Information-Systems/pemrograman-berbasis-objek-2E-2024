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
    
//    @Override dilakukan saat ingin membuat ulang sebuah method pada sub-class
    @Override
    public String toString(){
        return "NIM: " + nim + "\nNama:" + nama + "\nAlamat: " + alamat;
    }        
//  untuk memanggil nilai properti objek 
    String getNim() {
        return nim;
    }

    String getNama() {
        return nama;
    }

    String getAlamat() {
        return alamat;
    }
    
}
