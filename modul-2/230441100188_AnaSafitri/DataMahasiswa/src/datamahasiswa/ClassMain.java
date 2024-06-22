import datamahasiswa.DataMahasiswa;
import datamahasiswa.Mahasiswa;
import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulangi = "ya";

        while (ulangi.equalsIgnoreCase("ya")) {
            // input pertama
            System.out.print("Masukkan Nama Universitas: ");
            String namaUniversitas = input.nextLine();
            DataMahasiswa.setNamaUniversitas(namaUniversitas);

            // input kedua
            System.out.println("\nMasukkan Data Mahasiswa:");
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Alamat: ");
            String alamat = input.nextLine();
            
            System.out.println("\n41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Pilih Kode Jurusan Anda: ");
            String kodeJurusan = input.nextLine();

            String jurusan = ClassJurusan.getJurusan(kodeJurusan);
            if (jurusan != null) {
                System.out.println("Jurusan: " + jurusan);
            } else {
                System.out.println("Kode jurusan tidak valid.");
            }

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat);

            System.out.println("====================================");
            System.out.println("\nNama Universitas: " + DataMahasiswa.getNamaUniversitas());

            System.out.println("\nData Mahasiswa Yang Bersangkutan:");
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("\n====================================");

            System.out.print("Apakah Anda ingin memasukkan data mahasiswa kembali? (ya/tidak): ");
            ulangi = input.nextLine();
            System.out.println("\n====================================");
        }
    }
}