package universitas;

public class InputData {
    
    protected String nim;
    protected String nama;
    protected String alamat;
    private int kodeJurusan;
    
    public InputData(String nim, String nama, String alamat, int kodeJurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.kodeJurusan = kodeJurusan;
    }
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public int getKodeJurusan() {
        return kodeJurusan;
    }
    public String getJurusan() {
        switch (kodeJurusan) {
            case 41: return "TEKNIK INFORMATIKA";
            case 42: return "TEKNIK INDUSTRI";
            case 43: return "TEKNIK ELEKTRO";
            case 44: return "SISTEM INFORMASI";
            case 45: return "TEKNIK MESIN";
            case 46: return "TEKNIK MEKATRONIKA";
            default: return "Jurusan tidak dikenal";
        }
    }
}