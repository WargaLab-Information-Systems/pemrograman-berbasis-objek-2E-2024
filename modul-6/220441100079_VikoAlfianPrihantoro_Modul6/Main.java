package last;
public class Main {
    public static void main(String[] args) {
        // Membuat objek DosenTetap
        DosenTetap dosenTetap1 = new DosenTetap("Budi", "123456", 40, 'L', 5000000, 2000000);
        DosenTetap dosenTetap2 = new DosenTetap("Ani", "789012", 35, 'P', 4500000, 1500000);

        // Membuat objek DosenTidakTetap
        DosenTidakTetap dosenTidakTetap1 = new DosenTidakTetap("Sari", "345678", 30, 'P', 20, 100000);
        DosenTidakTetap dosenTidakTetap2 = new DosenTidakTetap("Joko", "901234", 45, 'L', 15, 120000);

        // Mengatur atribut menggunakan setter
        dosenTetap1.setNama("Budi Santoso");
        dosenTetap2.setNama("Ani Permata");
        dosenTidakTetap1.setNama("Sari Dewi");
        dosenTidakTetap2.setNama("Joko Susilo");

        // Menampilkan informasi dosen menggunakan metode tampilkanInfo
        System.out.println("Informasi Dosen Tetap:");
        dosenTetap1.tampilkanInfo();
        dosenTetap2.tampilkanInfo();

        System.out.println("\nInformasi Dosen Tidak Tetap:");
        dosenTidakTetap1.tampilkanInfo();
        dosenTidakTetap2.tampilkanInfo();
    }
}
