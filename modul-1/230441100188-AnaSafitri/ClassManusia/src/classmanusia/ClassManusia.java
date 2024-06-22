package classmanusia;

public class ClassManusia {

    public static void main(String[] args) {
        ClassManusia human1 = new ClassManusia();
        
        human1.biodata="Biodata orang pertama :";
        human1.nama="Ana Safitri";
        human1.umur="19+";
        human1.alamat="Socah";
        
//      sebagai atribut
        System.out.println("Ini adalah "+human1.biodata);
        System.out.println("Nama : "+human1.nama);
        System.out.println("Umur : "+human1.umur);
        System.out.println("Alamat "+human1.alamat);
        System.out.println("================================");
        
//      isian method
        human1.berjalan();
        human1.berlari();
    }
    private String biodata;
    private String nama;
    private String umur;
    private String alamat;

    private void berjalan() {
            System.out.println("Saya sedang berjalan bersama " +nama);
        }

    private void berlari() {
            System.out.println("Saya senang bisa berlari bersama " +nama);
        }  

    }