//modul3
package perpustakaan;

public class Perpustakaan {
    static String judul;
    static String penulis;
    static String penerbit;
    static String kategori;
    static int stok;
    static int tahunTerbit;
    
    public Perpustakaan(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit){
       Perpustakaan.judul = judul;
       Perpustakaan.penulis = penulis;
       Perpustakaan.penerbit = penerbit;
       Perpustakaan.kategori = kategori;
       Perpustakaan.stok = stok;
       Perpustakaan.tahunTerbit = tahunTerbit;
    }
    

    
    public void displayInfo(){
        System.out.println("Judul :"+judul);
        System.out.println("Penulis :"+penulis);
        System.out.println("Penerbit :"+penerbit);
        System.out.println("Kategori :"+kategori);
        System.out.println("Stok :"+stok);
        System.out.println("Tahun Terbit :"+tahunTerbit);
    }


 
    protected String getKategoriString() {
        String kategoriString;
        switch (kategori) {
            case "SU":
                kategoriString = "Semua Umur";
                break;
            case "D":
                kategoriString = "Dewasa";
                break;
            case "R":
                kategoriString = "Remaja";
                break;
            case "A":
                kategoriString = "Anak-anak";
                break;
            default:
                kategoriString = "Unknown";
        }
        return kategoriString;
    }

    void display() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}

// Child class
class Buku extends Perpustakaan {
    public Buku(String judul, String penulis, String publisher, int stok, int tahunTerbit) {
    super(judul, penulis, publisher, "A", stok, tahunTerbit);
}
}

    

     
