/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
 public class KategoriInput {
    public static String getInput(Scanner scanner) {
        System.out.println("\nKategori buku? (SU/D/R/A): ");
        String input = scanner.nextLine().toUpperCase();
        while (!input.matches("(SU|D|R|A)")) {
            System.out.println("Kategori error! Mohon masukkan SU, D, R, atau A.");
            input = scanner.nextLine().toUpperCase();
        }
        return input;
    }
}