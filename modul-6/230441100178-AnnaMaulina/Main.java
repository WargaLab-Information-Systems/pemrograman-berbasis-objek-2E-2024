package datadosen;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dosen[] daftarDosen = new Dosen[50];
        int jumlahDosen = 0;
        String pilihan;

        do {
            if (jumlahDosen >= 50) {
                System.out.println("Kapasitas array penuh. Tidak bisa menambah dosen lagi.");
                break;
            }

            int jenisDosen = 0;
            while (jenisDosen != 1 && jenisDosen != 2) {
                System.out.println("Pilih jenis dosen (1. Dosen Tetap, 2. Dosen Tidak Tetap) : ");
                if (scanner.hasNextInt()) {
                    jenisDosen = scanner.nextInt();
                    if (jenisDosen != 1 && jenisDosen != 2) {
                        System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
                    }
                } else {
                    System.out.println("Input tidak valid. Silakan masukkan angka 1 atau 2.");
                    scanner.next();  // Bersihkan input yang tidak valid
                }
            }

            if (jenisDosen == 1) {
                DosenTetap dosenTetap = new DosenTetap("", "", 0, ' ', 0, 0);
                System.out.println("\nMasukkan data dosen tetap");
                System.out.print("Nama : ");
                dosenTetap.setNama(scanner.next());
                System.out.print("NIK : ");
                dosenTetap.setNik(scanner.next());
                System.out.print("Umur : ");
                dosenTetap.setUmur(scanner.nextInt());
                
                char jenisKelamin;
                while (true) {
                    System.out.print("Jenis Kelamin (L/P) : ");
                    jenisKelamin = scanner.next().charAt(0);
                    if (jenisKelamin == 'L' || jenisKelamin == 'l' || jenisKelamin == 'P' || jenisKelamin == 'p') {
                        dosenTetap.setJenisKelamin(jenisKelamin);
                        break;
                    } else {
                        System.out.println("Input tidak valid. Silakan masukkan 'L' atau 'P'.");
                    }
                }
                
                System.out.print("Gaji Pokok : ");
                dosenTetap.setGajiPokok(scanner.nextDouble());
                System.out.print("Tunjangan : ");
                dosenTetap.setTunjangan(scanner.nextDouble());
                daftarDosen[jumlahDosen++] = dosenTetap;

            } else if (jenisDosen == 2) {
                DosenTidakTetap dosenTidakTetap = new DosenTidakTetap("", "", 0, ' ', 0, 0);
                System.out.println("\nMasukkan data dosen tidak tetap");
                System.out.print("Nama : ");
                dosenTidakTetap.setNama(scanner.next());
                System.out.print("NIK : ");
                dosenTidakTetap.setNik(scanner.next());
                System.out.print("Umur : ");
                dosenTidakTetap.setUmur(scanner.nextInt());
                
                char jenisKelamin;
                while (true) {
                    System.out.print("Jenis Kelamin (L/P) : ");
                    jenisKelamin = scanner.next().charAt(0);
                    if (jenisKelamin == 'L' || jenisKelamin == 'l' || jenisKelamin == 'P' || jenisKelamin == 'p') {
                        dosenTidakTetap.setJenisKelamin(jenisKelamin);
                        break;
                    } else {
                        System.out.println("Input tidak valid. Silakan masukkan 'L' atau 'P'.");
                    }
                }
                
                System.out.print("Jam Mengajar : ");
                dosenTidakTetap.setJamMengajar(scanner.nextInt());
                System.out.print("Honor Per Jam : ");
                dosenTidakTetap.setHonorPerJam(scanner.nextDouble());
                daftarDosen[jumlahDosen++] = dosenTidakTetap;
            }

            pilihan = "";
            while (!pilihan.equalsIgnoreCase("y") && !pilihan.equalsIgnoreCase("t")) {
                System.out.print("Apakah Anda ingin menambahkan dosen lagi? (y/t) : ");
                pilihan = scanner.next();
                if (!pilihan.equalsIgnoreCase("y") && !pilihan.equalsIgnoreCase("t")) {
                    System.out.println("Pilihan tidak valid. Silakan pilih 'y' atau 't'.");
                }
            }

        } while (pilihan.equalsIgnoreCase("y"));

        // Menampilkan informasi semua dosen
        System.out.println("\n=================================");
        System.out.println("            Data Dosen           ");
        System.out.println("=================================");
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("");
            daftarDosen[i].tampilkanInfo();
        }

        scanner.close();
    }
}