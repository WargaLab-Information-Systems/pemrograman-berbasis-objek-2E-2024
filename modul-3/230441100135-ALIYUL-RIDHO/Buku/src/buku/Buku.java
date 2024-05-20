
package buku;
import java.util.Scanner;
/**
 *
 * @author Ridho
 */
public class Buku {
    String Judul, Penulis, Publisher, Kategori;
    int Stok, TahunTerbit;

    public Buku() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan judul buku : ");
        Judul = input.nextLine();
        System.out.print("Masukkan nama penulis : ");
        Penulis = input.nextLine();
        System.out.print("Masukkan nama publisher : ");
        Publisher = input.nextLine();
        System.out.print("Masukkan jumlah stok buku : ");
        Stok = input.nextInt();
        System.out.print("Masukkan tahun terbit : ");
        TahunTerbit = input.nextInt();
    }

    public void tampilan() {
        System.out.println("Judul : " + Judul);
        System.out.println("Penulis : " + Penulis);
        System.out.println("Publisher : " + Publisher);
        System.out.println("Kategori : " + Kategori);
        System.out.println("Stok : " + Stok);
        System.out.println("Tahun Terbit : " + TahunTerbit);
    }
    
}
