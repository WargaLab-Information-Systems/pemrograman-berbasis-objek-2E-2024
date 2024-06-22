/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author HP
 */
public class BukuAnakAnak extends Buku{
    protected String kategori;

    public BukuAnakAnak(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, stok, tahunTerbit);
        this.kategori = "Anak-anak";
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kategori: " + kategori);
    }
}
