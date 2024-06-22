package karyawan;


public abstract class Karyawan {
    String nama;
    int usia;
    String jabatan;
    
    public Karyawan(String nama, int usia, String jabatan){
        this.nama = nama;
        this.usia = usia;
        this.jabatan = jabatan;
    }

   
    public abstract  void tampilkanData();
        
    }
    