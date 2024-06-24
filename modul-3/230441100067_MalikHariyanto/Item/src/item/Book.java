/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package item;

/**
 *
 * @author ASUS
 */
public class Book extends Item{

    public Book(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, kategori, stok, tahunTerbit);
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
    }
}

