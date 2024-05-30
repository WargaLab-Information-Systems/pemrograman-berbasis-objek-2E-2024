
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author JOIS
 */
public class mahasiswa {

    /**
     * @param args the command line arguments
     */
    private static List<datamhs> indetitasmhs = new ArrayList<>();

        public static void main(String[] args) {
       
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan Nama Universitas:");
            mhs.setmhsuniv(scanner.nextLine());

            char lanjut = 'Y';
            while (lanjut == 'Y') {
                System.out.println("Masukkan data mahasiswa:");
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Alamat: ");
                String alamat = scanner.nextLine();
                System.out.print("Kode Jurusan: ");
                int kodeJurusan = scanner.nextInt();
                scanner.nextLine(); // Bersihkan buffer

                datamhs profil = new datamhs(nama, nim, alamat, kodeJurusan);
                indetitasmhs.add(profil);

                System.out.println("Apakah Anda ingin memasukkan data lagi? (Y) Ya; (T) Tidak");
                lanjut = scanner.nextLine().toUpperCase().charAt(0);
            }

            System.out.println("\nDaftar Mahasiswa:");
            for (datamhs profil : indetitasmhs) {
                System.out.println("NAMA : " +profil.getNama());
                System.out.println("NIM :  " +profil.getNim());
                System.out.println("ALAMAT : "+profil.getAlamat());
                System.out.println("JURUSAN : "+profil.getJurusan());
                          
        }
    }
}