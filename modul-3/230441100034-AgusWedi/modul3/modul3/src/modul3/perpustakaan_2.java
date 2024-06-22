package modul3;

public class perpustakaan_2 extends perpustakaan_1{
    @Override
    public void inilisbuku(String judul, String penulis, String publisher, String kategori, String stok, String tahun){
        System.out.println("------------------------------");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Publisher: " + publisher);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun: " + tahun);
        System.out.println("------------------------------");
        System.out.println("Terimakasih Telah Menjalankan program dengan benar");
    }
}
