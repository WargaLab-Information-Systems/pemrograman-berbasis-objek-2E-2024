package input;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama, jurusan,alamatmhs;
        long NIM;
        System.out.print("Nama \t: ");
        nama = input.nextLine();
        System.out.print("Nim \t: ");
        NIM = input.nextLong();
        input.nextLine();
        System.out.print("Prodi \t: ");
        jurusan = input.nextLine();
        System.out.print("Alamat \t: ");
        alamatmhs = input.nextLine();
       
         
        System.out.println(" ================== ");
        System.out.println("Nama mahasiswa   : "+nama);
        System.out.println("NIM mahasiswa    : "+NIM);
        System.out.println("Prodi/jurusan    : "+jurusan);
        System.out.println("Alamat mahasiswa : "+alamatmhs);
        System.out.println(" ================== ");
    }   
}
