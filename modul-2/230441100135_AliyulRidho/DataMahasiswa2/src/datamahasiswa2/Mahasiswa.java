/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa2;

/**
 *
 * @author Ridho
 */
public class Mahasiswa extends DataMahasiswa2 {
    String NIM;
    String nama;
    String alamat;
    String jurusan;
    
    Mahasiswa (String NIM,String nama,String alamat,String  jurusan){
        this.NIM = NIM;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = getJurusan(jurusan);
        
    }
    String getJurusan(String kodeJurusan) {
        switch (kodeJurusan) {
            case "41":
                return "TEKNIK INFORMATIKA";
            case "42":
                return "TEKNIK INDUSTRI";
            case "43":
                return "TEKNIK ELEKTRO";
            case "44":
                return "SISTEM INFORMASI";
            case "48":
                return "TEKNIK MESIN";
            case "49":
                return "TEKNIK MEKATRONIKA";
            default:
                return "Jurusan tidak valid";
        }
    }
    
    void displayInfo(){
        
        System.out.println("NIM     :"+NIM);
        System.out.println("Nama    :"+nama);
        System.out.println("Alamat  :"+alamat);
        System.out.println("Jurusan :"+jurusan);
        System.out.println("---------------------------");
    }
    
    
}
