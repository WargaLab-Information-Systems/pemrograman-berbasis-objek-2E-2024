/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;
/**
 *
 * @penulis ASUS
 */
public class Buku {
    public String judul;
    public String penulis;
    public String publisher;
    public String kategori;
    public int stok;
    public int tahun;

    public Buku(String judul, String penulis, String publisher, String kategori, int stok, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.stok = stok;
        this.tahun = tahun;
        this.kategori = kategori;
    }

    public String getjudul() {
        return judul;
    }

    public String getpenulis() {
        return penulis;
    }

    public String getpublisher() {
        return publisher;
    }

    public String getKategori() {
        return kategori;
    }
    public int getstok() {
        return stok;
    }

    public int gettahun() {
        return tahun;
    }
  
    public void display() {
        System.out.println("Judul         : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Publisher      : " + publisher);
        System.out.println("Kategori      : " + kategori);
        System.out.println("Stok buku     : " + stok);
        System.out.println("Tahun terbit  : " + tahun);
    }

    @Override
    public String toString() {
        return "Judul         : " + judul +
               "\nPenulis     : " + penulis +
               "\nPublisher      : " + publisher +
               "\nKategori      : " + kategori+
               "\nStok buku     : " + stok +
               "\nTahun terbit  : " + tahun;
    }

}
