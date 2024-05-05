
package TugasPraktikum;
import java.util.ArrayList;
import java.util.Scanner;

class Universitas {
    private static String namaUniversitas;

    public static String getNamaUniversitas() {
        return namaUniversitas;
    }

    public static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
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

public class DataMahasiswa {
    static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Universitas: ");
        String namaUniv = scanner.nextLine();
        Universitas.setNamaUniversitas(namaUniv);

        char input;
        do {
            input = inputLanjut("Apakah Anda ingin memasukkan data mahasiswa? (Y/T): ", scanner);
            if (input == 'Y') {
                masukkanDataMahasiswa(scanner);
            }
        } while (input != 'T');

        tampilkanDaftarMahasiswa();
    }

    public static void masukkanDataMahasiswa(Scanner scanner) {
        System.out.println("Masukkan Data Mahasiswa:");
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("Jurusan (41/42/43/44/48/49): ");
        String jurusanKode = scanner.nextLine();
        String jurusan;
        switch (jurusanKode) {
            case "41":
                jurusan = "TEKNIK INFORMATIKA";
                break;
            case "42":
                jurusan = "TEKNIK INDUSTRI";
                break;
            case "43":
                jurusan = "TEKNIK ELEKTRO";
                break;
            case "44":
                jurusan = "SISTEM INFORMASI";
                break;
            case "48":
                jurusan = "TEKNIK MESIN";
                break;
            case "49":
                jurusan = "TEKNIK MEKATRONIKA";
                break;
            default:
                jurusan = "UNKNOWN";
                break;
        }

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
        daftarMahasiswa.add(mahasiswa);
    }

    public static void tampilkanDaftarMahasiswa() {
        System.out.println("\nDaftar Mahasiswa di " + Universitas.getNamaUniversitas() + ":");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s | %-20s | %-20s | %-20s%n", "NIM", "Nama", "Alamat", "Jurusan");
        System.out.println("-------------------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.printf("%-10s | %-20s | %-20s | %-20s%n", mhs.getNim(), mhs.getNama(), mhs.getAlamat(), mhs.getJurusan());
        }
        System.out.println("-------------------------------------------------");
    }

    public static char inputLanjut(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextLine().charAt(0);
    }
}
