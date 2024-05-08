/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author ahmad
 */
class Buku {
    private String judul;
    private String penulis;
    private String penerbit;
    private String kategori;
    private int stok;
    private int tahunTerbit;

    public Buku(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public int getStok() {
        return stok;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}

class BukuFiksi extends Buku {
    public BukuFiksi(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit);
    }
}

class BukuNonFiksi extends Buku {
    public BukuNonFiksi(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit);
    }
}
