/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class Buku {
    String judul;
    String penulis;
    String penerbit;
    int stok;
    int tahunTerbit;
    String kategori;

    public Buku(String judul, String penulis, String penerbit, int stok, int tahunTerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Kategori: " + kategori);
    }
}
