package modul45;
public class Karyawankontrak extends Karyawan {
    int UpahPerJam;
    int jumlahjamkerja;

    public Karyawankontrak(String nama, int usia, String posisi, int UpahPerJam, int jumlahjamkerja) {
        super(nama, usia, posisi);
        this.UpahPerJam = UpahPerJam;
        this.jumlahjamkerja = jumlahjamkerja;
    }
    
    @Override
    void Tampilkandata(){
        System.out.println("Karyawan Kontrak:");
        System.out.println("Nama: "+nama);
        System.out.println("Usia: "+usia);
        System.out.println("Posisi: "+posisi);
        System.out.println("Upah Per jam: "+ UpahPerJam);
        System.out.println("Jumlah Jam Kerja: "+ jumlahjamkerja);
        System.out.println("Total Upah: "+(UpahPerJam*jumlahjamkerja));
      
        
    }
    
}
