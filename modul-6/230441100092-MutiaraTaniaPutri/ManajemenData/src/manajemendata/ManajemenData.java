
package manajemendata;
import java.util.Scanner;

public class ManajemenData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Data Dosen :");
        System.out.print("Masukkan Jenis Dosen (tetap/tidak tetap): ");
        String pilihan = input.nextLine();
        
        if (pilihan.equalsIgnoreCase("tetap")){
            System.out.println("Masukkan nama : ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIK : ");
            String nik = input.nextLine();
            System.out.print("Masukkan Umur : ");
            int umur = input.nextInt();
            System.out.print("Masukkan Jenis Kelamin (L/P): ");
            char jenisKelamin = input.next().charAt(0);
            input.nextLine();
            System.out.print("Masukkan Instansi: ");            
            String instansi = input.nextLine();
            System.out.print("Masukkan Gaji Pokok : ");
            double gajiPokok = input.nextDouble();
            System.out.print("Masukkan Tunjangan : ");
            double tunjangan = input.nextDouble();
            
            DosenTetap dosenTetap = new DosenTetap(nama, nik, umur, jenisKelamin, instansi, gajiPokok, tunjangan);
            System.out.println("\nInformasi Data Dosen Tetap : ");
            dosenTetap.tampilkanInfo();
        
        } else if(pilihan.equalsIgnoreCase("tidak tetap")){
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIK: ");
            String nik = input.nextLine();
            System.out.print("Masukkan Umur: ");
            int umur = input.nextInt();
            System.out.print("Masukkan Jenis Kelamin (L/P): ");
            char jenisKelamin = input.next().charAt(0);
            System.out.println("Masukkan Instansi: ");
            String instansi = input.nextLine();
            System.out.print("Masukkan Jam Mengajar: ");
            int jamMengajar = input.nextInt();
            System.out.print("Masukkan Honor Per Jam: ");
            double honorPerjam = input.nextDouble();
            
            DosenTidakTetap dosenTidakTetap = new DosenTidakTetap(nama, nik, umur, jenisKelamin, instansi, jamMengajar, honorPerjam);
            System.out.println("\nInformasi Data Dosen Tidak Tetap:");
            dosenTidakTetap.tampilkanInfo();
            
        } else {
            System.out.println("Pilihan Anda tidak valid!");
        }
    }
    
}
