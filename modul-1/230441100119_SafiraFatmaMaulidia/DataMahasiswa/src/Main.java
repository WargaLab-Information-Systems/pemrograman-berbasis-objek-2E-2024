import datamahasiswa.Mahasiswa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = Mahasiswa.inputMahasiswa();

        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Prodi: " + mahasiswa.getProdi());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}

