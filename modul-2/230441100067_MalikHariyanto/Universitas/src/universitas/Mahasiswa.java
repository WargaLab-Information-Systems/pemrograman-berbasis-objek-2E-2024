/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitas;
public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public String getNIM() {
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
    
    public String Display() {
        return "NIM: " + getNIM() + "\nNama: " + getNama() + "\nAlamat: " + getAlamat() + "\nJurusan: " + getJurusan();
//        return 
//        System.out.println("Nama    : " +getNama());
//        System.out.println("NIM     : "+getNIM());
//        System.out.println("Alamat  : "+getAlamat());
//        System.out.println("Jurusan : "+ getJurusan());    

    }
}