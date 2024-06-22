/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universitas;

/**
 *
 * @author GRAHA
 */
public class InputData {
    protected String NIM;
    protected String nama;
    protected String alamat;
    private int kodeJurusan;

    public InputData(String NIM, String nama, String alamat, int kodeJurusan) {
        this.NIM = NIM;
        this.nama = nama;
        this.alamat = alamat;
        this.kodeJurusan = kodeJurusan;
    }

    public String getNIM() {
        return NIM;
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
            case 48: return "TEKNIK MESIN";
            case 49: return "TEKNIK MEKATRONIKA";
            default: return "Jurusan tidak dikenal";
        }
    }
}