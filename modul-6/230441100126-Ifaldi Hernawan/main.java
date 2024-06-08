/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input untuk Dosen Tetap
        System.out.println("Masukkan data untuk Dosen Tetap:");
        
        dosenTetap dosenTetap = new dosenTetap("", "", 0, 'L', 0, 0);
        
        System.out.print("Nama: ");
        dosenTetap.setnama(scanner.nextLine());
        System.out.print("NIK: ");
        dosenTetap.setnik(scanner.nextLine());
        System.out.print("Umur: ");
        dosenTetap.setumur(scanner.nextInt());
        System.out.print("Jenis Kelamin (L/P): ");
        dosenTetap.setjenisKelamin(scanner.next().charAt(0));
        System.out.print("Gaji Pokok: ");
        dosenTetap.setgajiPokok(scanner.nextDouble());
        System.out.print("Tunjangan: ");
        dosenTetap.settunjangan(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Masukkan data untuk Dosen Tidak Tetap:");
        
        dosenTidakTetap dosenTidakTetap = new dosenTidakTetap("", "", 0, 'L', 0, 0);
        
        System.out.print("Nama: ");
        dosenTidakTetap.setnama(scanner.nextLine());
        System.out.print("NIK: ");
        dosenTidakTetap.setnik(scanner.nextLine());
        System.out.print("Umur: ");
        dosenTidakTetap.setumur(scanner.nextInt());
        System.out.print("Jenis Kelamin (L/P): ");
        dosenTidakTetap.setjenisKelamin(scanner.next().charAt(0));
        System.out.print("Jam Mengajar: ");
        dosenTidakTetap.setjamMengajar(scanner.nextInt());
        System.out.print("Honor Per Jam: ");
        dosenTidakTetap.sethonorPerJam(scanner.nextDouble());

        System.out.println();
        dosenTetap.tampilkanInfo();
        System.out.println();
        dosenTidakTetap.tampilkanInfo();

        scanner.close();
    }
}
