package datamahasiswa;
import java.util.Scanner;

public class mhs {

    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        String ulang = "iya";
        
        while (ulang.equalsIgnoreCase("iya")){
//            untuk inputan pertama
            System.out.println("Masukkan nama Universitas: ");
            String univ = inputan.nextLine();              
            DataMahasiswa.setUniv(univ);
            
//            untuk inputan kedua
            System.out.println("Masukkan Data Mahasiswa: ");
            System.out.print("Nama: ");
            String nama = inputan.nextLine();
            System.out.print("NIM: ");
            String nim = inputan.nextLine();
            System.out.print("Alamat: ");
            String alamat = inputan.nextLine();
            
            System.out.println(" ");
            System.out.println("41 = Teknik Informatika");
            System.out.println("42 = Teknik Industri");
            System.out.println("43 = Teknik Elektro");
            System.out.println("44 = Sistem Informasi");
            System.out.println("48 = Teknik Mesin");
            System.out.println("49 = Teknik Mekatronika");
            System.out.print("Pilih Kode Jurusan Anda: ");
            String jurusanCode = inputan.nextLine();
            
            String jurusan = Jurusan.getJurusan(jurusanCode);
            if(jurusan != null) {
                System.out.println("Jurusan: " + jurusan);
            } else {
                System.out.println("Kode jurusan tidak valid.");
            }
             
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat);

            System.out.println("====================================");
            System.out.println("Universitas: " + DataMahasiswa.getUniv());
            System.out.println("Data Mahasiswa:");
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("====================================");
            System.out.print("Ingin memasukkan data mahasiswa kembali? (iya/tidak): ");
            ulang = inputan.nextLine();
            System.out.println("====================================");


        }       
        
    }
    
}
