package modul6.pkg1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        ArrayList<Dosen> dosenList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean running = true;
        while (running) {
            System.out.println("1. Tambah Dosen Tetap");
            System.out.println("2. Tambah Dosen Tidak Tetap");
            System.out.println("3. Tampilkan Semua Dosen");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    // Tambah Dosen Tetap
                    scanner.nextLine(); // clear buffer
                    System.out.println("-----------------------");
                    System.out.print("Nama: ");
                    String namaTetap = scanner.nextLine();
                    System.out.print("NIK: ");
                    String nikTetap = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umurTetap = scanner.nextInt();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jkTetap = scanner.next().charAt(0);
                    System.out.print("Gaji Pokok: ");
                    double gajiPokok = scanner.nextDouble();
                    System.out.print("Tunjangan: ");
                    double tunjangan = scanner.nextDouble();
                    DosenTetap dosenTetap = new DosenTetap(namaTetap, nikTetap, umurTetap, jkTetap, gajiPokok, tunjangan);
                    dosenList.add(dosenTetap);
                    System.out.println("-----------------------");
                    break;
                case 2:
                    // Tambah Dosen Tidak Tetap
                    scanner.nextLine(); // clear buffer
                    System.out.print("Nama: ");
                    String namaTidakTetap = scanner.nextLine();
                    System.out.print("NIK: ");
                    String nikTidakTetap = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umurTidakTetap = scanner.nextInt();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jkTidakTetap = scanner.next().charAt(0);
                    System.out.print("Jam Mengajar: ");
                    double jamMengajar = scanner.nextDouble();
                    System.out.print("Honor Per Jam: ");
                    double honorPerJam = scanner.nextDouble();
                    DosenTidakTetap dosenTidakTetap = new DosenTidakTetap(namaTidakTetap, nikTidakTetap, umurTidakTetap, jkTidakTetap, jamMengajar, honorPerJam);
                    dosenList.add(dosenTidakTetap);
                    break;
                case 3:
                    // Tampilkan Semua Dosen
                    for (Dosen dosen : dosenList) {
                        dosen.tampilkanInfo();
                        System.out.println();
                    }
                    break;
                case 4:
                    // Keluar
                    System.out.println("Terimakasih Telah Menggunakan Program ini");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}

