/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa;

/**
 *
 * @author HP
 */
public class DataUniv {
    public static String Univ;
    public static String NIM;
    public static String Nama;
    public static String Alamat;
    public static String Jurusan;

    public DataUniv(String Univ, String NIM, String Nama, String Alamat, String Jurusan) {
        this.Univ = Univ;
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Jurusan = Jurusan;
    }

    public static void setUniv(String Univ) {
        DataUniv.Univ = Univ;
    }

    public static void setNIM(String NIM) {
        DataUniv.NIM = NIM;
    }

    public static void setNama(String Nama) {
        DataUniv.Nama = Nama;
    }

    public static void setAlamat(String Alamat) {
        DataUniv.Alamat = Alamat;
    }

    public static void setJurusan(String Jurusan) {
        DataUniv.Jurusan = Jurusan;
    }

    public static String getUniv() {
        return Univ;
    }

    public static String getNIM() {
        return NIM;
    }

    public static String getNama() {
        return Nama;
    }

    public static String getAlamat() {
        return Alamat;
    }

    public static String getJurusan() {
        return Jurusan;
    }
}


