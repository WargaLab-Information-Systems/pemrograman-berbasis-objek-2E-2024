
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USEr
 */
public class Main {
private static final ArrayList<iddosen> daftardosen = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dosendata;

        do {
            System.out.println("pilih opsi yang akan digunakan : ");
            System.out.println("1. menginput dosen tetap");
            System.out.println("2. menginput dosen tidak tetap");
            System.out.println("3. menampilkan data");
            System.out.println("4. selesai");
            System.out.print("masukkan angka yang sesuai!!! ");
            dosendata = scanner.nextInt();
            scanner.nextLine();

            switch (dosendata) {
                case 1:
                    tambahdosentetap(scanner);
                    break;
                case 2:
                    tambahdosentidaktetap(scanner);
                    break;
                case 3:
                    tampilkanSemuaDosen();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (dosendata != 4);
    }

    private static void tambahdosentetap(Scanner scanner) {
        System.out.print("nama : ");
        String nama = scanner.nextLine();
        System.out.print("nik = ");
        String nik = scanner.nextLine();
        System.out.print("umur : ");
        int umur = scanner.nextInt();
        System.out.print("jenis kelamin (M/F) : ");
        char jeniskelamin = scanner.next().charAt(0);
        System.out.print("gaji pokok : ");
        double gajipokok = scanner.nextDouble();
        System.out.print("tunjangan : ");
        double tunjangan = scanner.nextDouble();
        scanner.nextLine(); 

        iddosen dosentetap = new dosentetap(nama, nik, umur, jeniskelamin, gajipokok, tunjangan);
        daftardosen.add(dosentetap);
        System.out.println("data dosen tetap berhasil ditambah");
    }

    private static void tambahdosentidaktetap(Scanner scanner) {
        System.out.print("nama : ");
        String nama = scanner.nextLine();
        System.out.print("nik : ");
        String nik = scanner.nextLine();
        System.out.print("umur : ");
        int umur = scanner.nextInt();
        System.out.print("jenis kelamin (M/F) : ");
        char jeniskelamin = scanner.next().charAt(0);
        System.out.print("jam mengajar : ");
        int jammengajar = scanner.nextInt();
        System.out.print("honor per jam : ");
        double honorperjam = scanner.nextDouble();
        scanner.nextLine();

        iddosen dosentidaktetap = new dosentidaktetap(nama, nik, umur, jeniskelamin, jammengajar, honorperjam);
        daftardosen.add(dosentidaktetap);
        System.out.println("Dosen Tidak Tetap berhasil ditambahkan kedalam data");
    }

    private static void tampilkanSemuaDosen() {
        if (daftardosen.isEmpty()) {
            System.out.println("Data dosen masih kosong, silahkan menginput data dosen");
        } else {
            for (iddosen Dosen : daftardosen) {
                if (Dosen instanceof dosentetap) {
                    ((dosentetap) Dosen).tampilkanInfo();
                } else if (Dosen instanceof dosentidaktetap) {
                    ((dosentidaktetap) Dosen).tampilkanInfo();
                }
                System.out.println();
            }
        }
    } 
}

