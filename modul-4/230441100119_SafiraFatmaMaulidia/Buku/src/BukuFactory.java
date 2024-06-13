/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Safira
 */
public class BukuFactory {
    public static Buku createBuku(String judul, String penulis, String penerbit, int stok, int tahunTerbit, String kategori) {
        if ("SU".equalsIgnoreCase(kategori)) {
            return new SemuaUmur(judul, penulis, penerbit, stok, tahunTerbit);
        } else if ("D".equalsIgnoreCase(kategori)) {
            return new Dewasa(judul, penulis, penerbit, stok, tahunTerbit);
        } else if ("R".equalsIgnoreCase(kategori)) {
            return new Remaja(judul, penulis, penerbit, stok, tahunTerbit);
        } else if ("A".equalsIgnoreCase(kategori)) {
            return new AnakAnak(judul, penulis, penerbit, stok, tahunTerbit);
        } else {
            return new SemuaUmur(judul, penulis, penerbit, stok, tahunTerbit);
        }
    }
}