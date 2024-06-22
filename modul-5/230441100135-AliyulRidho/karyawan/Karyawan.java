/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package karyawan;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Ridho
 */
abstract class Karyawan {
    protected String nama;
    protected int usia;
    protected String posisi;
    
    public Karyawan (String nama, int usia, String posisi){
        this.nama= nama;
        this.usia  = usia;
        this.posisi = posisi;
    }
    public abstract void Display();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
        System.out.println("____________________SISTEM PENDTATAAN KARYAWAN_________________________");
        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = scanner.nextInt();
        scanner.nextLine();  

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("____________________________________________________________________");
            System.out.println("Masukkan data karyawan ke-" + (i + 1) + ":");

            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine();
            

            System.out.print("Posisi: ");
            String posisi = scanner.nextLine();
            

            System.out.print("Jenis Karyawan (1 untuk Tetap, 2 untuk Kontrak): ");
            int jenisKaryawan = scanner.nextInt();
            scanner.nextLine();

            if (jenisKaryawan == 1) {
                System.out.print("Gaji Bulanan: ");
                double gajiBulanan = scanner.nextDouble();
                scanner.nextLine();  // Consume newline
                daftarKaryawan.add(new KaryawanTetap(nama, usia, posisi, gajiBulanan));
            } else if (jenisKaryawan == 2) {
                System.out.print("Upah Per Jam: ");
                double upahPerJam = scanner.nextDouble();

                System.out.print("Jumlah Jam Kerja: ");
                int jumlahJamKerja = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                int jumlahUpah = (int) (upahPerJam*jumlahJamKerja);
                daftarKaryawan.add(new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja,jumlahUpah));
                
                
            }
        }

        System.out.println("\nData Karyawan yang Telah Dimasukkan:");
        for (Karyawan karyawan : daftarKaryawan) {
            karyawan.Display();
        }

        scanner.close();
    }
    }
    
