package modul.pkg3;
import java.util.Scanner;

class Buku {
    private String judul;
    private String penulis;
    private String penerbit;
    private String kategori;
    private int stok;
    private int tahunTerbit;

    public Buku(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }
    public String getPenulis() {
        return penulis;
    }
    public String getPenerbit() {
        return penerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public int getStok() {
        return stok;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println("\nData buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}

// Kelas kategori buku
class KategoriBuku extends Buku {
    public KategoriBuku(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit);
    }

    // Metode untuk memilih kategori buku
    public static String pilihKategori(int pilihanKategori) {
        String kategori;
        switch (pilihanKategori) {
            case 1:
                kategori = "Semua Umur";
                break;
            case 2:
                kategori = "Dewasa";
                break;
            case 3:
                kategori = "Remaja";
                break;
            case 4:
                kategori = "Anak-anak";
                break;
            default:
                System.out.println("Kategori tidak valid. Kategori default: Semua Umur");
                kategori = "Semua Umur";
        }
        return kategori;
    }
}

public class Main {
    private static Buku[] daftarBuku = new Buku[100];
    private static int jumlahBuku = 0;
    
    private static void tampilkanDaftarBuku() {
    System.out.println("\nData buku yang telah dimasukkan:");
    for (int i = 0; i < jumlahBuku; i++) { // inisialisasi,kondisi,aksi
    daftarBuku[i].tampilkanInfo();
        }
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulangi;

        do {
            System.out.println("Masukkan data buku:");
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Penerbit: ");
            String penerbit = input.nextLine();

            System.out.println("\nPilih Kategori:");
            System.out.println("1. Semua Umur");
            System.out.println("2. Dewasa");
            System.out.println("3. Remaja");
            System.out.println("4. Anak-anak");
            System.out.print("Pilihan: ");
            int pilihanKategori = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            System.out.print("Stok: ");
            int stok = input.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = input.nextInt();
            input.nextLine(); // Membersihkan buffer
            String kategori = KategoriBuku.pilihKategori(pilihanKategori);
            
            Buku buku = new Buku(judul, penulis, penerbit, kategori, stok, tahunTerbit);
            if (jumlahBuku < daftarBuku.length) {
                daftarBuku[jumlahBuku] = buku;
                jumlahBuku++;
            } else {
                System.out.println("Kapasitas penyimpanan buku penuh.");
            }

            System.out.print("\nTambahkan data buku lagi? (y/n): ");
            ulangi = input.nextLine();
        } while (ulangi.equalsIgnoreCase("y"));

        tampilkanDaftarBuku();
    }


  
}
