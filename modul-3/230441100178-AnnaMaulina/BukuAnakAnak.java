package perpustakaan;
// Child class
class BukuAnakAnak extends Buku {
    // Constructor
    public BukuAnakAnak(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        super(judul, penulis, publisher, stok, tahunTerbit);
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Publisher    : " + publisher);
        System.out.println("Kategori     : Anak-anak");
        System.out.println("Stok         : " + stok);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}