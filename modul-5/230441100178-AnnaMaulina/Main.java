package perusahaan;
import java.util.Scanner;
public class Main {
    // membuat variabel daftarKaryawan yang bertipe data array dari objek Karyawan dengan ukuran 100
    private static Karyawan[] daftarKaryawan = new Karyawan[100];
    private static int jumlahKaryawan = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // loop utama untuk memasukkan data karyawan
        while (jumlahKaryawan < 100) {
            System.out.println("Masukkan data karyawan");
            System.out.print("Nama : ");
            String nama = scanner.nextLine();
            System.out.print("Usia : ");
            int usia = Integer.parseInt(scanner.nextLine());
            System.out.print("Posisi : ");
            String posisi = scanner.nextLine();
            String jenis = "";
            // loop untuk memastikan jenis karyawan (tetap/kontrak)
            while (true) {
               System.out.print("Jenis karyawan (tetap/kontrak) : ");
               jenis = scanner.nextLine();
               if (jenis.equalsIgnoreCase("Tetap") || jenis.equalsIgnoreCase("Kontrak")) {
                   break;
               } else {
                   System.out.println("Jenis karyawan tidak valid. Harap masukkan 'tetap' atau 'kontrak'.");
               }
            }
            // seleksi kondisi untuk inputan jenis karyawan
            if (jenis.equalsIgnoreCase("Tetap")) {
                System.out.print("Gaji bulanan : ");
                String gajiBulanan = scanner.nextLine();
                tambahKaryawan(nama, usia, posisi, gajiBulanan);
            } else if (jenis.equalsIgnoreCase("Kontrak")) {
                System.out.print("Upah per jam : ");
                int upahPerJam = Integer.parseInt(scanner.nextLine());
                System.out.print("Jumlah jam kerja : ");
                int jumlahJamKerja = Integer.parseInt(scanner.nextLine());
                int totalUpah = upahPerJam * jumlahJamKerja;
                System.out.print("Total upah : " + totalUpah + "\n");
                tambahKaryawan(nama, usia, posisi, upahPerJam, jumlahJamKerja, totalUpah);
            }

            // loop yang digunakan untuk menanyakan apakah ingin tambah data karyawan lagi
            while (true) {
                System.out.print("Apakah Anda ingin menambahkan data karyawan lagi? (y/t): ");
                String tambahLagi = scanner.nextLine();
                if (tambahLagi.equalsIgnoreCase("y")) {
                    break;
                } else if (tambahLagi.equalsIgnoreCase("t")) {
                    jumlahKaryawan = 100;
                    break;
                } else {
                    System.out.println("Input tidak valid. Masukkan 'y' untuk ya atau 't' untuk tidak.");
                }
            }
            // keluar dari loop utama jika jumlah karyawan >= 100
            if (jumlahKaryawan >= 100) {
                break;
            }
            System.out.println("");
        }

        System.out.println("\n==============================");
        System.out.println("        Data Karyawan       ");
        System.out.println("==============================");
        // loop untuk menampilkan semua data karyawan yang telah dimasukkan
        for (int i = 0; i < jumlahKaryawan; i++) {
            if (daftarKaryawan[i] != null) { 
                daftarKaryawan[i].tampilkanData();
                System.out.println("");
            }
        }
        scanner.close();
        System.out.println("");
    }

    // method overloading untuk KaryawanTetap
    public static void tambahKaryawan(String nama, int usia, String posisi, String gajiBulanan) {
        daftarKaryawan[jumlahKaryawan++] = new KaryawanTetap(nama, usia, posisi, gajiBulanan);
    }

    // method overloading untuk KaryawanKontrak
    public static void tambahKaryawan(String nama, int usia, String posisi, int upahPerJam, int jumlahJamKerja, int totalUpah) {
        daftarKaryawan[jumlahKaryawan++] = new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja, totalUpah);
    }
}