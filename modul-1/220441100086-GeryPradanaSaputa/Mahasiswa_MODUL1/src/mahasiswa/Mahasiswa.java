
package mahasiswa;

import java.util.Scanner;

public class Mahasiswa {

    public static void main(String[] args) {
      String nama,nim,jurusan,alamat;
      Scanner keyword = new Scanner (System.in);
        
      System.out.println(".....Biodata MAHASISWA.....");
      System.out.println();
      System.out.println("Nama Mahasiswa :      ");
      nama = keyword.nextLine();
        
       System.out.println("NIM :    ");
      nim = keyword.nextLine();
        
       System.out.println("JURUSAN :    ");
      jurusan = keyword.nextLine();
        
       System.out.println("ALAMAT :    ");
      alamat = keyword.nextLine();
        
       System.out.println("Nama Mahasiswa : "+ nama);
       System.out.println("NIM : "+ nim);
       System.out.println("JURUSAN : "+ jurusan);
       System.out.println("ALAMAT : "+ alamat);
    }
    
}
