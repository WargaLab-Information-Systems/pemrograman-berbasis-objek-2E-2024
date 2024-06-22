package modul2_tugas1;
import java.util.ArrayList;
import java.util.Scanner;

class universitas{
    private static String namaUniversitas;

    public static void setNamaUniversitas(String nama){
        namaUniversitas = nama;        
    }

    public static String getNamaUniversitas(){
        return namaUniversitas;
    }
}

class Mahasiswa {
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
    
    static void daftarkodejurusan(){
        System.out.println("------------------------");
        System.out.println("41: TEKNIK INFORMATIKA");
        System.out.println("42: TEKNIK INDUSTRI");
        System.out.println("43: TEKNIK ELEKTRO");
        System.out.println("44: SISTEM INFORMASI");
        System.out.println("48: TEKNIK MESIN");
        System.out.println("49: TEKNIK MEKATRONIKA");
        System.out.println("------------------------");
    }
    
    private String getJurusan(String kodeJurusan) {
        switch (kodeJurusan) {
            case "41":
                return "TEKNIK INFORMATIKA";
            case "42":
                return "TEKNIK INDUSTRI";
            case "43":
                return "TEKNIK ELEKTRO";
            case "44":
                return "SISTEM INFORMASI";
            case "48":
                return "TEKNIK MESIN";
            case "49":
                return "TEKNIK MEKATRONIKA";
            default:
                return "UNKNOWN";
        }
    }
    public String toString() {
        return "NIM : " + nim + ", Nama : " + nama + ", Alamat : " + alamat + ", Jurusan : " + getJurusan(jurusan);
    }
    
}

public class Modul2_tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        // Memasukkan Nama Universitas
        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        universitas.setNamaUniversitas(namaUniversitas);
        System.out.println("------------------------------");
        
        char ulangi;
        do {
            // Memasukkan data mahasiswa
            System.out.println("Masukkan Data Mahasiswa:");
            System.out.println("------------------------------");
            System.out.print("NIM \t: ");
            String nim = scanner.nextLine();
            System.out.print("NAMA \t: ");
            String nama = scanner.nextLine();
            System.out.print("ALAMAT \t: ");
            String alamat = scanner.nextLine();
            Mahasiswa.daftarkodejurusan();
            System.out.print("JURUSAN\t: ");
            String jurusan = scanner.nextLine();

            // Membuat objek Mahasiswa dan menambahkannya ke daftarMahasiswa
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Apakah Anda Ingin Menginputkan Data Lagi? (Y/T): ");
            ulangi = scanner.next().charAt(0);
            scanner.nextLine(); // Membersihkan buffer
        } while (ulangi == 'Y' || ulangi == 'y');
        
        // Menampilkan daftar Mahasiswa
        System.out.println("\nDaftar Mahasiswa di " + universitas.getNamaUniversitas() + ":");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa);
            System.out.println("---------------------------------------------------------------");
            System.out.println("Terima Kasih");
        }
    }
}
