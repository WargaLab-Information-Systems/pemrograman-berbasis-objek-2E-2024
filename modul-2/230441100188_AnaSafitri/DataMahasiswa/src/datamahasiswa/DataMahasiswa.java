package datamahasiswa;

public class DataMahasiswa {
    private static String namaUniversitas;
    private static String nim;
    private static String nama;
    private static String alamat;

    public static String getNamaUniversitas() {
        return namaUniversitas;
    }

    public static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }
    
    public static String getNim() {
        return nim;
    }

    public static void setNim(String nim) {
        DataMahasiswa.nim = nim;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        DataMahasiswa.nama = nama;
    }

    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        DataMahasiswa.alamat = alamat;
    }
}