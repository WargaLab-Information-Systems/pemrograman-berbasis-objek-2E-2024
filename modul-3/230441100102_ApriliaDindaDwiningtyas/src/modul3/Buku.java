/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author Lenovo
 */
public class Buku {
    protected String judul;
    protected String penulis;
    protected String publisher;
    protected int stok;
    protected int tahunTerbit;
    protected int jumlahhalaman;

    public Buku(String judul, String penulis, String publisher, int stok, int tahunTerbit, int jumlahhalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
        this.jumlahhalaman = jumlahhalaman;
    }

    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Publisher: " + publisher);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Jumlah halaman: "+ jumlahhalaman);
    }
}
