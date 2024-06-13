/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamhs;
/**
 *
 * @author Safira
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    private static String[] kodeJurusan = {"41", "42", "43", "44", "48", "49"};
    private static String[] namaJurusan = {
        "TEKNIK INFORMATIKA", 
        "TEKNIK INDUSTRI", 
        "TEKNIK ELEKTRO", 
        "SISTEM INFORMASI", 
        "TEKNIK MESIN", 
        "TEKNIK MEKATRONIKA"
    };

    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
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

    public String getJurusan() {
        return jurusan;
    }

    public static String getJurusanByCode(String code) {
        for (int i = 0; i < kodeJurusan.length; i++) {
            if (kodeJurusan[i].equals(code)) {
                return namaJurusan[i];
            }
        }
        return "UNKNOWN";
    }
}
