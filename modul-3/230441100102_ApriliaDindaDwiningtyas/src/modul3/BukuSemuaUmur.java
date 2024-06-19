/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author Lenovo
 */
public class BukuSemuaUmur extends Buku {
    protected String kategori;
    
    public BukuSemuaUmur(String judul, String penulis, String publisher, int stok, int tahunTerbit, int jumlahhalaman) {
        super(judul, penulis, publisher, stok, tahunTerbit, jumlahhalaman);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kategori: Semua Umur");
    }
}
