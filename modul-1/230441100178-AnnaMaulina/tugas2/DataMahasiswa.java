package datamahasiswa;
import java.util.Scanner;
public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        String nim;
        String prodi;
        String alamat;
        
        System.out.println("Masukkan Data Mahasiswa");
        System.out.print("Nama   : ");
        nama = input.nextLine();
        
        System.out.print("NIM    : ");
        nim = input.nextLine();
        
        System.out.print("Prodi  : ");
        prodi = input.nextLine();
        
        System.out.print("Alamat : ");
        alamat = input.nextLine();
        
        System.out.println("");
        System.out.println("======= Data Mahasiswa =======");
        System.out.println("Nama   : "+nama);
        System.out.println("NIM    : "+nim);
        System.out.println("Prodi  : "+prodi);
        System.out.println("Alamat : "+alamat);
    }  
}
