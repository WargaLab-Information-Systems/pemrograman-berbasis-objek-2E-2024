/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

class BukuDewasa extends Buku {
    public BukuDewasa(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, stok, tahunTerbit);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori: Dewasa");
    }
}   