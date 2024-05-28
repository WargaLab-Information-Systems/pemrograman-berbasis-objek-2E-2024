/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;
import java.util.Scanner;
/**
 *
 * @penulis ASUS
 */
public class input {
    public static Buku getInput(Scanner scanner) {
        System.out.println("\nMasukkan info buku yang akan ditambah:");
        System.out.print("Judul         : ");
        String judul = scanner.nextLine();
        System.out.print("Penulis     : ");
        String penulis = scanner.nextLine();
        System.out.print("Publisher      : ");
        String publisher = scanner.nextLine();
        String kategori = KategoriInput.getInput(scanner);
        System.out.print("Stok buku     : ");
        int stok = scanner.nextInt();
        System.out.print("Tahun terbit  : ");
        int tahun = scanner.nextInt();
        scanner.nextLine();
        return new Buku(judul, penulis, publisher, kategori, stok, tahun);
    }
}

