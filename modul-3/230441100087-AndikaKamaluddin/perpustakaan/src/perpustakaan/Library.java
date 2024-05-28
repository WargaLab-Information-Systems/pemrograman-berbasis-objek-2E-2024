/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;
import java.util.Scanner;

/**
 *
 * @penulis ASUS
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        librarymethod perpus = new librarymethod("judul", "penulis", "publisher", "kategori", 0, 0000, scanner);
        perpus.run();
        scanner.close();
    }
    
}
