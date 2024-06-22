
package biodata;
import java.util.Scanner;

public class Biodata {   
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        mahasiswa data = new mahasiswa();        
        
        System.out.println("Masukkan Nama : ");
        data.nama = input.nextLine();
        
        System.out.println("Masukkan NIM : ");
        data.nim = input.nextInt();
        input.nextLine();
        
        System.out.println("Masukkan Prodi : ");
        data.prodi = input.nextLine();
        input.nextLine();
        
        System.out.println("Masukkan Alamat : ");
        data.alamat = input.nextLine();
        
        
        System.out.println("  ");
        System.out.println("Nama : " + data.nama);
        System.out.println("NIM : " + data.nim);
        System.out.println("Prodi : " + data.prodi);
        System.out.println("Alamat : " + data.alamat);
    }    
}
