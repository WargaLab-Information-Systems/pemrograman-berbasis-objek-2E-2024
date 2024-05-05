/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitas;

/**
 *
 * @author AbasZ
 */
public final class Mahasiswa extends DataMahasiswa {
    String NIM;
    String nama;
    String alamat;
    String jurusan;
    
    Mahasiswa (String NIM, String nama, String alamat, String jurusan){
        this.NIM = NIM;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = getJurusan (jurusan);
    }
    
    String getJurusan(String kodeJurusan){
        return switch (kodeJurusan) {
            case "41" -> "Teknik Informatika (TI)";
            case "42" -> "Teknik Industri (TIN)";
            case "43" -> "Teknik Elektro (TE)";
            case "44" -> "Sistem Informasi (SI)";
            case "48" -> "Teknik Mesin (TM)";
            case "49" -> "Teknik Mekatronika (TMK)";
            default -> "Jurusan Tidak ditemukan";
        };
    }
    
    void menampilkaninformasi(){
        System.out.println("--------------------------------------------");
        System.out.println("NIM     : "+NIM);
        System.out.println("Nama    : "+nama);
        System.out.println("Alamat  : "+alamat);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("--------------------------------------------");
    
    }

}
