/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author AbasZ
 */
import java.util.Scanner;

public class Buku {
    String Judul, Penulis, Publisher, Kategori;
    int Stock, TahunTerbit;
    
    public Buku(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Judul Buku :");
        Judul = sc.nextLine();
        System.out.println("Masukkan Nama Penulis :");
        Penulis = sc.nextLine();
        System.out.println("Masukkan Nama Publisher :");
        Publisher = sc.nextLine();
        System.out.println("Masukkan Jumlah Stock Buku :");
        Stock = sc.nextInt();
        System.out.println("Masukkan Tahun Terbit :");
        TahunTerbit = sc.nextInt();
    }
    
    public void display(){
        System.out.println("Judul :" +Judul);
        System.out.println("Penulis :" +Penulis);
        System.out.println("Publisher :" +Publisher);
        System.out.println("Kategori :" +Kategori);
        System.out.println("Stock :" +Stock);
        System.out.println("Tahun Terbit :" +TahunTerbit);
    }
}
