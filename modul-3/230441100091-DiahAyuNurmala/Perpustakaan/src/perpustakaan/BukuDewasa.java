/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Lenovo
 */
public class BukuDewasa  extends Buku{
    protected String kategori;

    public BukuDewasa(String judul, String penulis, String publisher, int stok, int tahunTerbit, int jumlahHalaman) {
        super(judul, penulis, publisher, stok, tahunTerbit, jumlahHalaman);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kategori: Dewasa");
    }
}

