package buku;

/**
 *
 * @author ASUS
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */  

class BukuDewasa extends Buku {
    public BukuDewasa(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit);
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
    
    }
}

class BukuAnak extends Buku {
    public BukuAnak(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
   
    }
}