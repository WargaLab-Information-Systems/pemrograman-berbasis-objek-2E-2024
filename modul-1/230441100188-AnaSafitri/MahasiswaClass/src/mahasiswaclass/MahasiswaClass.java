package mahasiswaclass;
import java.util.Scanner;

public class MahasiswaClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        String nim;
        String prodi;
        String alamat;
        
        System.out.println("Masukkan Nama Mahasiswa : ");
            nama = input.nextLine();
        System.out.println("Masukkan NIM Mahasiswa : ");
            nim = input.nextLine();
        System.out.println("Masukkan Program Studi : ");
            prodi = input.nextLine();
        System.out.println("Masukkan Alamat saat ini : ");
            alamat = input.nextLine();
        
        System.out.println("================================");
        System.out.println("------------ BIODATA -----------");
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("NIM Mahasiswa   : " + nim);
        System.out.println("Program Studi   : " + prodi);
        System.out.println("Alamat saat ini : " + alamat);

    }
}
