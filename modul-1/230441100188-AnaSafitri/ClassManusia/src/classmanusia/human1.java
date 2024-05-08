package classmanusia;

public class human1 {

    static String biodata;
    static String nama;
    static String umur;
    static String alamat;

    static void berjalan() {
        System.out.println("Yang sedang berjalan itu adalah " + nama);
    }

    static void berlari() {
        System.out.println("Yang sedang berlari itu adalah " + nama);
    }
    
    public static void main(String[] args) {
        biodata = "Perkenalan orang ke dua:";
        nama = "Maisa";
        umur = "18+";
        alamat = "Surabaya";

        System.out.println("Biodata: " + biodata);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
        System.out.println("================================");


        berjalan();
        berlari();
    }
}