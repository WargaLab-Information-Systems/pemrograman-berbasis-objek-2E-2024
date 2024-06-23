/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOIS
 */
public class datamhs {
    protected String nama;
    protected String nim;
    protected String alamat;
    private int kodeJurusan;

    public datamhs(String nim, String nama, String alamat, int kodeJurusan) {
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
        return switch (kodeJurusan) {
            case 41 -> "TEKNIK INFORMATIKA";
            case 42 -> "TEKNIK INDUSTRI";
            case 43 -> "TEKNIK ELEKTRO";
            case 44 -> "SISTEM INFORMASI";
            case 48 -> "TEKNIK MESIN";
            case 49 -> "TEKNIK MEKATRONIKA";
            default -> "Jurusan tidak dikenal";
        };
    }
}