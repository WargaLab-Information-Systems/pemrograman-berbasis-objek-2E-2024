/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dosen;

/**
 *
 * @author LENOVO
 */
public class dosenTidakTetap extends Dosen{
    public int jamMengajar;
    public double honorPerJam;
    
    public dosenTidakTetap(String nama, String nik, int umur, char jenisKelamin, int jamMengajar, double honorPerJam) {
        super(nama, nik, umur, jenisKelamin);
        this.jamMengajar = jamMengajar;
        this.honorPerJam = honorPerJam;
    }
    
    public int getjamMengajar(){
        return jamMengajar;
    }
    
    public void setjamMengajar(int jamMengajar){
        this.jamMengajar = jamMengajar;
    }
    
    public double gethonorPerJam(){
        return honorPerJam;
    }
    
    public void sethonorPerJam(double honorPerJam){
        this.honorPerJam = honorPerJam;
    }

    @Override
    public double hitungGaji() {
        return jamMengajar + honorPerJam;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.println("Dosen Tidak Tetap");
        System.out.println("Nama : " + getnama());
        System.out.println("Nik : " + getnik());
        System.out.println("Umur : " + getumur());
        System.out.println("Jenis Kelamin : " + getjenisKelamin());
        System.out.println("Jam Mengajar : " + getjamMengajar());
        System.out.println("Honor Per Jam : " + gethonorPerJam());
        System.out.println("Total Gaji : " + hitungGaji());
    }
    
}
