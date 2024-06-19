package modul45;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Karyawan> daftarkaryawan = new ArrayList<>();
        String lanjut;
        
        do { 
            System.out.println("\nMasukkan Data Karyawan");
            System.out.print("Nama :");
            String nama = input.nextLine();
            System.out.print("Usia :");
            int usia = input.nextInt();
            input.nextLine();
            System.out.print("Posisi :");
            String posisi = input.nextLine();
            System.out.print("Jenis Karyawan (1. Karyawan Tetap, 2. Karyawan Kontrak) :");
            int Jeniskaryawan = input.nextInt();
            input.nextLine();
            
            if(Jeniskaryawan == 1){
                System.out.print("Gaji bulanan : ");
                int Gajibulanan = input.nextInt();
                input.nextLine();
                daftarkaryawan.add(new Karyawantetap (nama,usia,posisi,Gajibulanan));
            }else if(Jeniskaryawan == 2){
                System.out.print("Upah Per Jam : ");
                int UpahPerJam = input.nextInt();
                input.nextLine();
                System.out.print("Jumlah Jam Kerja :");
                int Jumlahjamkerja = input.nextInt();
                input.nextLine();
                daftarkaryawan.add(new Karyawankontrak(nama, usia, posisi, UpahPerJam,Jumlahjamkerja));
            }else{
                System.out.println("Jenis Karyawan Tidak Valid");
            }
            
            System.out.println("Ingin memasukkan data karyawan lagi?(Y/T)");
            lanjut = input.nextLine();
        }while (lanjut.equalsIgnoreCase("Y"));
        
        System.out.println("");
        System.out.println("Data Semua Karyawan:");
        for (Karyawan karyawan : daftarkaryawan) {
            karyawan.Tampilkandata();
            System.out.println("");
          
         }
    }  
}
