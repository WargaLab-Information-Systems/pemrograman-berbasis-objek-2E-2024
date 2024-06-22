//modul 3
package perpustakaan;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       

        System.out.print("Masukkan jumlah buku yang akan diinput: ");
        int jumlahBuku = scanner.nextInt();
        
        Perpustakaan[] daftarBuku = new Perpustakaan[jumlahBuku];

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Data buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.next();
            System.out.print("Penulis: ");
            String penulis = scanner.next();
            System.out.print("Publisher: ");
            String publisher = scanner.next();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.next();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();

            if (kategori.equalsIgnoreCase("A")) {
                Buku buku = new Buku(judul, penulis, publisher, stok, tahunTerbit);
                daftarBuku[i]=(buku);
            } else {
                Perpustakaan buku = new Perpustakaan(judul, penulis, publisher, kategori, stok, tahunTerbit);
                daftarBuku[i]=(buku);
            }
        }

        System.out.println("\nDaftar Buku:");
        for (Perpustakaan buku : daftarBuku) {
            buku.display();
            System.out.println("-------------");           
        }            

    }
}


