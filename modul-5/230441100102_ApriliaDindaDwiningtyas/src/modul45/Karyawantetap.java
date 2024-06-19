package modul45;

public class Karyawantetap extends Karyawan{
    int gajibulanan;
    
    public Karyawantetap(String nama, int usia, String posisi,int gajibulanan){
     super(nama,usia,posisi);
     this.gajibulanan = gajibulanan;
    }

    @Override
    void Tampilkandata(){
        System.out.println("Karyawan Tetap : ");
        System.out.println("Nama: "+nama);
        System.out.println("Usia: "+usia);
        System.out.println("Posisi: "+posisi);
        System.out.println("Gaji Bulanan: "+gajibulanan);
    }

       
}
