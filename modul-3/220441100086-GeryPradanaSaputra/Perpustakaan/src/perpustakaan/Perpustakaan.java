/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;
import java.util.Scanner;

class perpus{
    String judul, penulis, publiser,kategori;
    int tahunterbit,stok;
    void Cetak(){
        System.out.println("\njudul :"+judul);
        System.out.println("penulis :"+penulis);
        System.out.println("tahun terbit :"+tahunterbit);
        System.out.println("publiser :"+publiser);
        System.out.println("kategori :"+kategori);
        System.out.println("stok :"+stok);
    }
}
class semuausia extends perpus{
    @Override
    void Cetak(){super.Cetak();
    }
}
class dewasa extends perpus{
    @Override 
        void Cetak(){super.Cetak();    
    }
}
class remaja extends perpus{
    @Override
    void Cetak(){
        super.Cetak();     
    }
}
class anakanak extends perpus{
    @Override
    void Cetak(){
        super.Cetak();     
    }
}
public class Perpustakaan {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner inInt = new Scanner (System.in);
        semuausia SU = new semuausia();
        dewasa D = new dewasa();
        remaja R = new remaja();
        anakanak AA = new anakanak();
        int banyakSU = 0;
        int banyakD = 0;
        int banyakR = 0;
        int banyakAA = 0;
        System.out.println("masukkan banyak buku:");
        int banyak = inInt.nextInt();
        for (int h = 1; h <= banyak; h++){
          System.out.println("\nMasukkan Buku Ke-"+h);
          System.out.print("Judul :");
          String nama = input.nextLine();
          System.out.print("Penulis :");
          String namapenulis = input.nextLine();
          System.out.print("Tahun Terbit :");
          int namatahunterbit = inInt.nextInt();
          System.out.print("Publiser :");
          String namapubliser = input.nextLine();
          System.out.println("Masukkan Angka Kategori :");
          System.out.println("[1] semua usia :"); 
          System.out.println("[2] dewasa :");
          System.out.println("[3] remaja :");
          System.out.println("[4] anak anak :");
          System.out.print("masukan pilihan :");
          int namakategori = inInt.nextInt();
          System.out.print("stok :");
          int Jumlah = inInt.nextInt(); 
           if (namakategori==1){
              banyakSU++;
              SU.judul= nama;
              SU.penulis= namapenulis;
              SU.tahunterbit= namatahunterbit;
              SU.publiser= namapubliser;
              SU.kategori= "semuausia";
              SU.stok= Jumlah;
          }else if (namakategori==2){
              banyakD++;
              D.judul= nama;
              D.penulis= namapenulis;
              D.tahunterbit= namatahunterbit;
              D.publiser= namapubliser;
              D.kategori= "DEWASA";
              D.stok= Jumlah;
          }else if (namakategori==3){
              banyakR++;
              R.judul= nama;
              R.penulis= namapenulis;
              R.tahunterbit= namatahunterbit;
              R.publiser= namapubliser;
              R.kategori= "remaja";
              R.stok= Jumlah;
          }else if (namakategori==4){
              banyakAA++;
              AA.judul= nama;
              AA.penulis= namapenulis;
              AA.tahunterbit= namatahunterbit;
              AA.publiser= namapubliser;
              AA.kategori= "anak-anak";
              AA.stok= Jumlah;
          }else {
               System.out.println("pilihan tidak tersedia");
          }
          }
          if (banyakSU!=0){
          for(int i=0;i<banyakSU;i++){
              SU.Cetak();
             }
          }
          if (banyakD!=0){
          for(int i=0;i<banyakD;i++){
              D.Cetak();
             }
          }
          if (banyakR!=0){
          for(int i=0;i<banyakR;i++){
              R.Cetak();
             }
          }
          if (banyakAA!=0){
          for(int i=0;i<banyakAA;i++){
              AA.Cetak();
             }
          }
  }
}

