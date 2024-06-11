/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitas;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Masukkan Nama Universitas: ");
        Universitas.setNamaUniversitas(scanner.nextLine());

        boolean lagi = true;
        while (lagi) {
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();
            System.out.println("Pilih Jurusan:");
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Masukkan Kode Jurusan: ");
            String kodeJurusan = scanner.nextLine();

            String jurusan;
            switch (kodeJurusan) {
                case "41":
                    jurusan = "TEKNIK INFORMATIKA";
                    Mahasiswa mhs = new Mahasiswa(nim, nama, alamat, jurusan);
                    System.out.println("Daftar Mahasiswa di Universitas " + Universitas.getNamaUniversitas());
                    System.out.println(mhs.Display());
                    break;
                case "42":
                    jurusan = "TEKNIK INDUSTRI";
                    Mahasiswa mhs2 = new Mahasiswa(nim, nama, alamat, jurusan);
                    System.out.println("Daftar Mahasiswa di Universitas " + Universitas.getNamaUniversitas());
                    System.out.println(mhs2.Display());
                    break;
                case "43":
                    jurusan = "TEKNIK ELEKTRO";
                    Mahasiswa mhs3 = new Mahasiswa(nim, nama, alamat, jurusan);
                    System.out.println("Daftar Mahasiswa di Universitas " + Universitas.getNamaUniversitas());
                    System.out.println(mhs3.Display());
                    break;
                case "44":
                    jurusan = "SISTEM INFORMASI";
                    Mahasiswa mhs4 = new Mahasiswa(nim, nama, alamat, jurusan);
                    System.out.println("Daftar Mahasiswa di Universitas " + Universitas.getNamaUniversitas());
                    System.out.println(mhs4.Display());
                    break;
                case "48":
                    jurusan = "TEKNIK MESIN";
                    Mahasiswa mhs5 = new Mahasiswa(nim, nama, alamat, jurusan);
                    System.out.println("Daftar Mahasiswa di Universitas " + Universitas.getNamaUniversitas());
                    System.out.println(mhs5.Display());
                    break;
                case "49":
                    jurusan = "TEKNIK MEKATRONIKA";
                    Mahasiswa mhs6= new Mahasiswa(nim, nama, alamat, jurusan);
                    System.out.println("Daftar Mahasiswa di Universitas " + Universitas.getNamaUniversitas());
                    System.out.println(mhs6.Display());
                    break;
                default:
                    jurusan = "UNKNOWN";
                    break;
            }

            Mahasiswa mhs = new Mahasiswa(nim, nama, alamat, jurusan);


            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y) Ya; (T) Tidak: ");
            String pilihan = scanner.nextLine();
            if (pilihan.equalsIgnoreCase("T")) {
                lagi = false;
            }
        }
        


        scanner.close();
    }
}
