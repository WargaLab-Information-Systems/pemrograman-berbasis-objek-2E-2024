package datamahasiswa;
import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        String lanjut;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("== INPUT DATA == ");
            System.out.println("   ");
            
            System.out.print("UNIVERSITAS : ");
            String univ = input.nextLine();
            
            System.out.print("NIM         : ");
            int NIM = input.nextInt();
            input.nextLine(); // Membersihkan newline dari buffer
            
            System.out.print("NAMA        : ");
            String nama = input.nextLine();
            
            System.out.print("ALAMAT      : ");
            String alamat = input.nextLine();
            
            System.out.println("DAFTAR KODE JURUSAN :");
            System.out.println(" TEKNIK INFORMATIKA     [41]");
            System.out.println(" TEKNIK INDUSTRI        [42]");
            System.out.println(" TEKNIK ELEKTRO         [43]");
            System.out.println(" SISTEM INFORMASI       [44]");
            System.out.println(" TEKNIK MESIN           [48]");
            System.out.println(" TEKNIK MEKATRONIKA     [49]");
            System.out.print("KODE JURUSAN : ");
            String prodi = input.nextLine();
            System.out.println("  ");
            
            System.out.println(" == DATA MAHASISWA == ");
            System.out.println("UNIVERSITAS : " + univ);
            System.out.println("NIM         : " + NIM);
            System.out.println("NAMA        : " + nama);
            System.out.println("ALAMAT      : " + alamat);
            
            switch (prodi){
                case "41":
                    System.out.println("PRODI     : TEKNIK INFORMATIKA");
                    break;
                case "42":
                    System.out.println("PRODI     : TEKNIK INDUSTRI");
                    break;
                case "43":
                    System.out.println("PRODI     : TEKNIK ELEKTRO");
                    break;
                case "44":
                    System.out.println("PRODI    : SISTEM INFORMASI");
                    break;
                case "48":
                    System.out.println("PRODI    : TEKNIK MESIN");
                    break;
                case "49":
                    System.out.println("PRODI    : TEKNIK MEKATRONIKA");
                    break;
                default :
                    System.out.println("KODE JURUSAN TIDAK VALID");    
            }
            System.out.println("==========================================");
            System.out.println("   ");
            
            System.out.println("APAKAH ANDA INGIN MEMASUKKAN DATA KEMBALI ?");
            System.out.println("1. YA [iya] \n2. TIDAK [Tidak]");
            System.out.print("PILIHAN : ");
            lanjut = input.nextLine();
        } while(lanjut.equals("iya"));
        
        System.out.println("===============TERIMA KASIH===============");
    }
}
