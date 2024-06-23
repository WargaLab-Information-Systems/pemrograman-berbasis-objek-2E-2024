import java.util.Scanner;

// Abstract class Karyawan
abstract class Karyawan {
    String nama;
    int usia;
    String posisi;

    // Abstract method tampilkanData()
    abstract void tampilkanData();
}

// Class KaryawanTetap
class KaryawanTetap extends Karyawan {
    int gajiBulanan;

    // Constructor
    KaryawanTetap(String nama, int usia, String posisi, int gajiBulanan) {
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
        this.gajiBulanan = gajiBulanan;
    }

    // Implementasi method tampilkanData()
    @Override
    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Posisi: " + posisi);
        System.out.println("Gaji Bulanan: " + gajiBulanan);
    }
}

// Class KaryawanKontrak
class KaryawanKontrak extends Karyawan {
    int upahPerJam, jumlahJamKerja;

    // Constructor
    KaryawanKontrak(String nama, int usia, String posisi, int upahPerJam, int jumlahJamKerja) {
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    // Implementasi method tampilkanData()
    @Override
    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Posisi: " + posisi);
        System.out.println("Upah Per Jam: " + upahPerJam);
        System.out.println("Jumlah Jam Kerja: " + jumlahJamKerja);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan data diri karyawan
        System.out.println("Masukkan data karyawan:");

        // Menentukan jumlah karyawan
        System.out.print("Jumlah karyawan: ");
        int jumlahKaryawan = scanner.nextInt();

        // Membuat array karyawan
        Karyawan[] daftarKaryawan = new Karyawan[jumlahKaryawan];

        // Memasukkan data karyawan
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("\nData karyawan ke-" + (i + 1));

            System.out.print("Jenis karyawan (Tetap/Kontrak): ");
            String jenisKaryawan = scanner.next();

            System.out.print("Nama: ");
            String nama = scanner.next();

            System.out.print("Usia: ");
            int usia = scanner.nextInt();

            System.out.print("Posisi: ");
            String posisi = scanner.next();

            if (jenisKaryawan.equalsIgnoreCase("Tetap")) {
                System.out.print("Gaji Bulanan: ");
                int gajiBulanan = scanner.nextInt();
                daftarKaryawan[i] = new KaryawanTetap(nama, usia, posisi,gajiBulanan);
            } else {
                System.out.print("Upah Per Jam: ");
                int upahPerJam = scanner.nextInt();
                System.out.print("Jumlah Jam Kerja: ");
                int jumlahJamKerja = scanner.nextInt();
                daftarKaryawan[i] = new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja);
            }
        }

        // Menampilkan semua data karyawan
        System.out.println("\nData karyawan:");
        for (Karyawan karyawan : daftarKaryawan) {
            karyawan.tampilkanData();
        }
    }
}
