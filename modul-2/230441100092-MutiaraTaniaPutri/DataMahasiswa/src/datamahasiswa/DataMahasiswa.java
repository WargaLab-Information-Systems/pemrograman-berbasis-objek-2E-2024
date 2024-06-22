package datamahasiswa;

public class DataMahasiswa {
    private static String univ;
    private static String nim;
    private static String nama;
    private static String alamat;

    public static void setUniv(String univ) {
        DataMahasiswa.univ = univ;
    }
    
    public static String getUniv() {
        return univ;
    }    
    
    public static void setNim(String nim) {
        DataMahasiswa.nim = nim;
    }
    
    public static String getNim() {
        return nim;
    }

    public static void setNama(String nama) {
        DataMahasiswa.nama = nama;
    }

    public static String getNama() {
        return nama;
    }
    
    public static void setAlamat(String alamat) {
        DataMahasiswa.alamat = alamat;
    }
    
    public static String getAlamat() {
        return alamat;
    }   

}
