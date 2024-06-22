/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamahasiswa;
import java.util.Scanner;
/**
 *
 * @author HP
 */

public class DataMahasiswa {
    public static void main(String[] args) {
        String lanjut = "Y";
        while(lanjut.equals("Y")){
            Scanner inputUser = new Scanner(System.in);
            System.out.println("======= INPUT DATA MAHASISWA =======");
            System.out.println("   ");            
            System.out.print("UNIVERSITAS : ");
            String univ = inputUser.nextLine();
            System.out.print("NIM         : ");
            String NIM = inputUser.nextLine();
            System.out.print("NAMA        : ");
            String Nama = inputUser.nextLine();
            System.out.print("ALAMAT      : ");
            String Alamat = inputUser.nextLine();
            System.out.println("DAFTAR KODE JURUSAN :");
            System.out.println(" TEKNIK INFORMATIKA     [41]");
            System.out.println(" TEKNIK INDUSTRI        [42]");
            System.out.println(" TEKNIK ELEKTRO         [43]");
            System.out.println(" SISTEM INFORMASI       [44]");
            System.out.println(" TEKNIK MESIN           [48]");
            System.out.println(" TEKNIK MEKATRONIKA     [49]");
            System.out.print("KODE JURUSAN : ");
            String Jurusan = inputUser.nextLine();
            System.out.println("  ");
            

            DataUniv datamhs = new DataUniv(univ, NIM, Nama, Alamat, Jurusan);
    System.out.println("==========DATA MAHASISWA==========");
            System.out.println("UNIVERSITAS : " + DataUniv.getUniv());
            System.out.println("NIM         : " + DataUniv.getNIM());
            System.out.println("NAMA        : " + DataUniv.getNama());
            System.out.println("ALAMAT      : " + DataUniv.getAlamat());
            switch (DataUniv.getJurusan()){
                case "41":
                    System.out.println("JURUSAN     : TEKNIK INFORMATIKA");
                    break;
                case "42":
                    System.out.println("JURUSAN     : TEKNIK INDUSTRI");
                    break;
                case "43":
                    System.out.println("JURUSAN     : TEKNIK ELEKTRO");
                    break;
                case "44":
                    System.out.println("JURUSAN     : SISTEM INFORMASI");
                    break;
                case "48":
                    System.out.println("JURUSAN     : TEKNIK MESIN");
                    break;
                case "49":
                    System.out.println("JURUSAN     : TEKNIK MEKATRONIKASUT");
                    break;
                default :
                    System.out.println("KODE JURUSAN TIDAK VALID");    
            }
            System.out.println("======================================");
            System.out.println("   ");
            System.out.println("APAKAH ANDA INGIN MEMASUKKAN DATA LAGI?");
            System.out.println("1. YA [Y] \n2. TIDAK [T]");
            System.out.println("PILIHAN : ");
            lanjut = inputUser.nextLine();
        }        System.out.println("==============TERIMAKASIH==============");
    }
}
    
