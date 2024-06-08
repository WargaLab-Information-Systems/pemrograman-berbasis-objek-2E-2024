/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosen;
/**
 *
 * @author LENOVO
 */
abstract class Dosen implements Idosen {
    public String nama;
    public String nik;
    public int umur;
    public char jenisKelamin;
    
    public Dosen(String nama, String nik, int umur, char jenisKelamin){
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public String getnik(){
        return nik;
    }
    
    public void setnik(String nik){
        this.nik = nik;
    }
    
    public int getumur(){
        return umur;
    }
    
    public void setumur(int umur){
        this.umur = umur;
    }
    
    public char getjenisKelamin(){
        return jenisKelamin;
    }
    
    public void setjenisKelamin(char jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    
    public abstract void tampilkanInfo();
}
