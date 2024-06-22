package manusia;
public class Individu {
    
    public static void main(String[] args) {
        Manusia m1 = new Manusia();
        Manusia m2 = new Manusia();
        
        m1.nama="Dina";
        m1.umur=12;
        m1.alamat="Bangkalan";
        m2.nama="Adi";
        m2.umur=15;
        m2.alamat="Kamal";
        
        System.out.println("Nama   : "+m1.nama);
        System.out.println("Umur   : "+m1.umur+" tahun");
        System.out.println("Alamat : "+m1.alamat);
        m1.berjalan();
        System.out.println("");
        
        System.out.println("Nama   : "+m2.nama);
        System.out.println("Umur   : "+m2.umur+" tahun");
        System.out.println("Alamat : "+m2.alamat);
        m2.berlari();
        System.out.println("");
    }
}
