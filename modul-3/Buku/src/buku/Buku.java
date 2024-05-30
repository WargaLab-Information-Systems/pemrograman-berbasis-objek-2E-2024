/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buku;

/**
 *
 * @author GRAHA
 */
public class Buku {
    String judull;
    String penuliss;
    String publisherr;
    String kategorii;
    int stokk;
    int tahunTerbitt;
    public Buku(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        judull = judul;
        penuliss = penulis;
        publisherr = publisher;
        kategorii = kategori;
        stokk = stok;
        tahunTerbitt = tahunTerbit ;
    }
    public void tampilkanInfo() {
        System.out.println("Judul: " + judull);
        System.out.println("Penulis: " + penuliss);
        System.out.println("Publisher: " + publisherr);
        System.out.println("Kategori: " + kategorii);
        System.out.println("Stok: " + stokk);
        System.out.println("Tahun Terbit: " + tahunTerbitt);
        System.out.println();
    }
} 

