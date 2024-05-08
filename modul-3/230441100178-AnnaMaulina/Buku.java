package perpustakaan;
// Parent class
public class Buku {
    String judul;
    String penulis;
    String publisher;
    int stok;
    int tahunTerbit;

    // Constructor
    public Buku(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Publisher    : " + publisher);
        System.out.println("Stok         : " + stok);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}