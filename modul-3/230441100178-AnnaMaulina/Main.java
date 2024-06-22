package perpustakaan;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah buku yang akan dimasukkan : ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine();
        
        Buku[] buku = new Buku[jumlahBuku];

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("");
            System.out.println("Masukkan data buku ke-" + (i + 1));
            System.out.print("Judul : ");
            String judul = scanner.nextLine();
            System.out.print("Penulis : ");
            String penulis = scanner.nextLine();
            System.out.print("Publisher : ");
            String publisher = scanner.nextLine();
            System.out.print("Kategori (SU/D/R/A) : ");
            String input = scanner.nextLine();
            String kategori = input.toUpperCase();
            System.out.print("Stok : ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit : ");
            int tahunTerbit = scanner.nextInt();

            scanner.nextLine();

            switch (kategori) {
                case "SU":
                    buku[i] = new BukuSemuaUmur(judul, penulis, publisher, stok, tahunTerbit);
                    break;
                case "D":
                    buku[i] = new BukuDewasa(judul, penulis, publisher, stok, tahunTerbit);
                    break;
                case "R":
                    buku[i] = new BukuRemaja(judul, penulis, publisher, stok, tahunTerbit);
                    break;
                case "A":
                    buku[i] = new BukuAnakAnak(judul, penulis, publisher, stok, tahunTerbit);
                    break;
                default:
                    System.out.println("Kategori tidak valid. Dan buku akan dimasukkan ke kategori 'Semua Umur'.");
                    buku[i] = new BukuSemuaUmur(judul, penulis, publisher, stok, tahunTerbit);
            }
        }

        // Menampilkan daftar buku yang telah dimasukkan
        System.out.println("\n====== Daftar Buku ======");
        for (Buku b : buku) {
            b.tampilkanInfo();
            System.out.println("");
        }
    }
}