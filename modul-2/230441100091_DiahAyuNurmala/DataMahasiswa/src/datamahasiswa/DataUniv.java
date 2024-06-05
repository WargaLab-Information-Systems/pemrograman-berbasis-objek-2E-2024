/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa;

/**
 *
 * @author Lenovo
 */
class DataUniv {
    public static String univ;
    public static int NIM;
    public static String Nama;
    public static String Alamat;
    public static int Prodi;
    
    public DataUniv(String univ, int NIM, String Nama, String Alamat, int Jurusan) {
        this.univ = univ;
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Prodi = Prodi;
    }

    public static String getUniv() {
        return univ;
    }

    public static int getNIM() {
        return NIM;
    }

    public  static String getNama() {
       return Nama;
    }

    public static String getAlamat() {
        return Alamat;
    }

    public static int getProdi() {
        return Prodi;
    }

}
