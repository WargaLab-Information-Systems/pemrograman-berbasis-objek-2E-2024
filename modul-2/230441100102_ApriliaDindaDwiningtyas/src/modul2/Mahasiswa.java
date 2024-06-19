package modul2;
public class Mahasiswa  {
    private static String Universitas;
    private static int nim;
    private static String nama;
    private static String Alamat;
    private static String Jurusan;

    public void Mahasiswa(String Universitas, int nim,String nama,String Alamat,String Jurusan){
        
        this.Universitas = Universitas;
        this.nim = nim;
        this.nama = nama;
        this.Alamat = Alamat;
        this.Jurusan = Jurusan;
        
    }
    public static String getUniversitas() {
        return Universitas;
    }
    public static void setUniversitas(String Universitas) {
        Mahasiswa.Universitas = Universitas;
    }
    public static int getNim() {
        return nim;
    }

    public static void setNim(int nim) {
        Mahasiswa.nim = nim;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Mahasiswa.nama = nama;
    }

    public static String getAlamat() {
        return Alamat;
    }

    public static void setAlamat(String Alamat) {
        Mahasiswa.Alamat = Alamat;
    }

    public static String getJurusan() {
        return Jurusan;
    }

    public static void setJurusan(String Jurusan) {
        Mahasiswa.Jurusan = Jurusan;
    }
    
}