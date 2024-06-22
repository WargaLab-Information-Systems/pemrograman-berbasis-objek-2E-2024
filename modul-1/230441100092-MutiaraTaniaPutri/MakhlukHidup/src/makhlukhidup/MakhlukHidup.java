
package makhlukhidup;


public class MakhlukHidup {

   
    public static void main(String[] args) {
        Manusia Srigala = new Manusia();
        
        Srigala.nama="Solon";
        Srigala.umur=150;
        Srigala.alamat="Gray City";
        
        Srigala.Berjalan();
        Srigala.Berlari();
        
        System.out.println("Srigala itu bernama "+Srigala.nama);
        System.out.println("Srigala itu berumur "+Srigala.umur);
        System.out.println("Srigala itu tinggal di kota "+Srigala.alamat);
    }
    
}
