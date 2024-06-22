package dataperpustakaan;
import java.util.ArrayList;
import java.util.Scanner;

public class DataPerpustakaan {
//    private static ArrayList<Buku> daftarBuku = new ArrayList<>();
    private static ArrayList<Buku> daftarBuku = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahBuku;
        
        System.out.println("Masukkan jumlah buku yang ingin dientrikan: ");
        jumlahBuku = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < jumlahBuku; i++){
            System.out.println("\nEntri Buku ke-" + (i + 1));
            tambahBuku();
        }
        System.out.println("=====================");
        System.out.println("\nDaftar Buku:");
        for (Buku buku : daftarBuku){
            tampilkanBuku(buku);
        }
    }
    
    private static void tambahBuku(){
        System.out.println("Judul: ");
        String judul = input.nextLine(); 
        input.nextLine();
        
        System.out.println("Penulis: ");
        String penulis = input.nextLine();
        
        System.out.println("Publisher: ");
        String publisher = input.nextLine();
        
        System.out.println("Kategori (SU/D/R/A): ");
        String kategori = input.nextLine();
        
        System.out.println("Stok: ");
        int stok = input.nextInt();
        
        System.out.println("Tahun Terbit: ");
        int tahunTerbit = input.nextInt();
        
        Buku buku;
        if (kategori.equals("SU")){
            buku = new BukuUmum(judul, penulis, publisher, stok, tahunTerbit);
        } else if (kategori.equals("D")){
            buku = new BukuDewasa(judul, penulis, publisher, stok, tahunTerbit);
        } else if (kategori.equals("R")){
            buku = new BukuRemaja(judul, penulis, publisher, stok, tahunTerbit);
        } else if (kategori.equals("A")){
            buku = new BukuAnak(judul, penulis, publisher, stok, tahunTerbit);
        } else {
            System.out.println("Kategori tidak valid!");
            return;
        }
        
        daftarBuku.add(buku);
        
    }
    
    private static void tampilkanBuku(Buku buku){
//        System.out.println( );
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Penulis: " + buku.getPenulis());
        System.out.println("Publisher: " + buku.getPublisher());
        System.out.println("Kategori: " + buku.getKategori());
        System.out.println("Stok: " + buku.getStok());
        System.out.println("Tahun Terbit: " + buku.getTahunTerbit());
        System.out.println("=====================");
        System.out.println( );
    }
    
}
