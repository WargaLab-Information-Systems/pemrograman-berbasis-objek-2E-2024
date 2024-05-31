package modul1no2;

import java.util.Scanner;

class Mahasiswa {
    String Nama;
    long Nim;
    String Jurusan;
    String Alamat;
    
    public void tampilkanData(){
       System.out.println("Nama     :"+ Nama);
       System.out.println("Nim      :"+ Nim);
       System.out.println("Jurusan  :"+ Jurusan);
       System.out.println("Alamat   :"+ Alamat);
    }
}

public class Modul1no2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.print("Masukkan Nama    : ");
        mahasiswa.Nama = input.nextLine();
        
        System.out.print("Masukkan Nim     : ");
        mahasiswa.Nim = input.nextLong();
        input.nextLine();
       
        System.out.print("Masukkan Jurusan : ");
        mahasiswa.Jurusan = input.nextLine();
        
        System.out.print("Masukkan Alamat  : ");
        mahasiswa.Alamat = input.nextLine();
        
        System.out.println("\nBiodata Mahasiswa");
        mahasiswa.tampilkanData();
    }
}
