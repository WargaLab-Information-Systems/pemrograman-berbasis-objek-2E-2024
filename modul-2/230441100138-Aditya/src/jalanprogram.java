package universitas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class jalanprogram {
    
private static List<InputData> daftarMahasiswa = new ArrayList<>();

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nama Universitas:");
        Universitas.setNamaUniversitas(scanner.nextLine());
        
        char lanjut = 'Y';
        while (lanjut == 'Y') {
            
            System.out.println("Masukkan data mahasiswa:");
            System.out.print("Nim: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Kode Jurusan: ");
            int kodeJurusan = scanner.nextInt();
            scanner.nextLine(); // Bersihkan buffer
            InputData mahasiswa = new InputData(nim, nama, alamat, kodeJurusan);
            daftarMahasiswa.add(mahasiswa);
            System.out.println("Apakah Anda ingin memasukkan data lagi? (Y) Ya; (T) Tidak");
            lanjut = scanner.nextLine().toUpperCase().charAt(0);
        }
        System.out.println("\nDaftar Mahasiswa:");
        for (InputData mahasiswa : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama() + ", Alamat: " + mahasiswa.getAlamat() + ", Jurusan: " + mahasiswa.getJurusan());
        }
    }
}