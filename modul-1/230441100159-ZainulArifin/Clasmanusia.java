package clasmanusia;

public class Clasmanusia {

    public static void main(String[] args) {
  
    manusia biodata = new manusia();
    biodata.nama="alpin";
    biodata.alamat="Bangkalan";
    biodata.umur=19;
        System.out.println("nama : "+biodata.nama);
        System.out.println("alamat : "+biodata.alamat);
        System.out.println("umur : "+biodata.umur);
        biodata.berjalan();
        biodata.berlari();
        
    biodata.nama="rizki";
    biodata.alamat="sumenep";
    biodata.umur=19;
        System.out.println("nama : "+biodata.nama);
        System.out.println("alamat : "+biodata.alamat);
        System.out.println("umur : "+biodata.umur);
        biodata.berlari();
        biodata.berjalan();
        
    biodata.nama="iklil";
    biodata.alamat="Galis"; 
    biodata.umur=19;
    
        System.out.println("nama : "+biodata.nama);
        System.out.println("alamat : "+biodata.alamat);
        System.out.println("umur : "+biodata.umur);
        biodata.berlari();
        biodata.berjalan();  
    }  
}
