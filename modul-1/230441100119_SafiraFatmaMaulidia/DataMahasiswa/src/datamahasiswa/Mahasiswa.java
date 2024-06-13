/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa;
import java.util.Scanner;
/**
 *
 * @author Safira
 */


public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private String alamat;

    // Konstruktor
    public Mahasiswa(String nama, String nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    // Getter untuk setiap atribut
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public String getAlamat() {
        return alamat;
    }

    // Method untuk input data mahasiswa dari pengguna
    public static Mahasiswa inputMahasiswa() {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama:");
        String nama = input.nextLine();

        System.out.println("Masukkan NIM:");
        String nim = input.nextLine();

        System.out.println("Masukkan jurusan/prodi:");
        String prodi = input.nextLine();

        System.out.println("Masukkan alamat:");
        String alamat = input.nextLine();

        return new Mahasiswa(nama, nim, prodi, alamat);
    }
}
