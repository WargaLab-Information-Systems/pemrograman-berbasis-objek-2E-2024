//modul 1 tugas 2

package data;
import java.util.Scanner;

public class main {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data data = new Data();

        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();
        Data.setNama(nama);
        
        System.out.println("Masukkan Nim: ");
        int nim = input.nextInt();
        input.nextLine();
        Data.setNim(nim);
        
        System.out.println("Masukkan Jurusan: ");
        String jurusan = input.nextLine();
        Data.setJurusan(jurusan);
        
        System.out.println("Masukkan Alamat: ");
        String alamat = input.nextLine();
        Data.setAlamat(alamat);
        
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Alamat: " + alamat);
         
    }
}

