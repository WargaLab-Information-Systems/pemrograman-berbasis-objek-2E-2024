/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg3;
import java.util.*;

public class mhs {
    public static void main(String[]args){
        String lanjut = "y";
        while(lanjut.equals("y")){
            Scanner input=new Scanner(System.in);
            System.out.println("Masukkan Data");
            System.out.println("Universitas : ");praktikum.pkg3.dtmhs.univ=input.nextLine();
            System.out.println("NIM : ");praktikum.pkg3.dtmhs.nim=input.nextLine();
            System.out.println("Nama : ");praktikum.pkg3.dtmhs.nama=input.nextLine();
            System.out.println("Alamat : ");praktikum.pkg3.dtmhs.alamat=input.nextLine();
            System.out.println("KODE JURUSAN");
            System.out.println("Teknik Informatika (41)");
            System.out.println("Teknik Industri (42)");
            System.out.println("Teknik Elektro (43)");
            System.out.println("Sistem Informasi (44)");
            System.out.println("Teknik mesin (48)");
            System.out.println("Teknik Mekatronika (49)");
            System.out.println("Kode Jurusan : ");praktikum.pkg3.dtmhs.jurusan=input.nextLine();
            System.out.println("DATA MAHASISWA");
            System.out.println("Universitas : "+praktikum.pkg3.dtmhs.getuniv());
            System.out.println("NIM : "+praktikum.pkg3.dtmhs.getnim());
            System.out.println("Nama : "+praktikum.pkg3.dtmhs.getnama());
            System.out.println("Alamat : "+praktikum.pkg3.dtmhs.getalamat());
            System.out.println("Jurusan : "+praktikum.pkg3.dtmhs.getjurusan());
            
            switch(praktikum.pkg3.dtmhs.getjurusan()){
                case "41":
                    System.out.println("Jurusan : Teknik Informatika");
                    break;
                case "42":
                    System.out.println("Jurusan : Teknik Industri");
                    break;
                case "43":
                    System.out.println("Jurusan : Teknik Electro");
                    break;
                case "44":
                    System.out.println("Jurusan : Sistem Informasi");
                    break;
                case "48":
                    System.out.println("Jurusan : Teknik Mesin");
                    break;
                case "49":
                    System.out.println("Jurusan : Teknik Mekatronika");
                    break;
                default:
                    System.out.println("Kode Jurusan Tidak Valid"); 
            }
            System.out.println("Apakah Anda Ingin Menginput Lagi?");
            System.out.println("Iya(y)dan Tidak(t)");
            lanjut=input.nextLine();
        }
        System.out.println("Terimakasih Telah Menginput");
    }
}
