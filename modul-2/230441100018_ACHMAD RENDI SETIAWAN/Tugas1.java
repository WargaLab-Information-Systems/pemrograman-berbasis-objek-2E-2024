/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul.pkg2;

import java.util.Scanner;

public class Tugas1 {
    private static String universitas;

    public static void setUniversitas(String namaUniversitas) {
        universitas = namaUniversitas;
    }

    public static String getUniversitas() {
        return universitas;
    }

    public static void main(String[] args) {
        final int MAX_MAHASISWA = 100;
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[MAX_MAHASISWA];
        int indexMahasiswa = 0;

        String[] jurusanArray = {
            "41-TEKNIK INFORMATIKA",
            "42-TEKNIK INDUSTRI",
            "43-TEKNIK ELEKTRO",
            "44-SISTEM INFORMASI",
            "45-TEKNIK MESIN",
            "46-TEKNIK MEKATRONIKA"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama Universitas :");
        String namaUniversitas = scanner.nextLine();
        setUniversitas(namaUniversitas);
        
        boolean lanjut = true;

        while (lanjut) {
            for (String jur : jurusanArray) {
                System.out.println(jur);
            }

            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Masukkan Jurusan: ");
            String jurusanInput = scanner.nextLine();

            int index = Integer.parseInt(jurusanInput.substring(0, 2)) - 41;
            String jurusanDisplay = jurusanArray[index].substring(3);

            Mahasiswa mhs = new Mahasiswa(nim, nama, alamat, jurusanDisplay);
            daftarMahasiswa[indexMahasiswa] = mhs;
            indexMahasiswa++;

            System.out.print("Apakah ingin memasukkan data lagi? (Y/T): ");
            String jawaban = scanner.nextLine();
            lanjut = jawaban.equalsIgnoreCase("Y");
        }
        
        System.out.println("=========================================");
        System.out.println("Universitas :"+getUniversitas());
        for (int i = 0; i < indexMahasiswa; i++) {
            Mahasiswa mahasiswa = daftarMahasiswa[i];
            System.out.println("======================================");
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("Jurusan: " + mahasiswa.getJurusan());
            System.out.println();
        }
    }

    public static class Mahasiswa {
        private String nim;
        private String nama;
        private String alamat;
        private String jurusan;

        public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
            this.nim = nim;
            this.nama = nama;
            this.alamat = alamat;
            this.jurusan = jurusan;
        }

        public String getNim() {
            return nim;
        }

        public String getNama() {
            return nama;
        }

        public String getAlamat() {
            return alamat;
        }

        public String getJurusan() {
            return jurusan;
        }
    }
}