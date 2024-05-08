/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author LENOVO
 */
public class Perpustakaan {
    private String judul;
    private String penulis;
    private String publisher;
    private char kategori;
    private int stok;
    private int tahunTerbit;
    
    public Perpustakaan(String judul, String penulis, String Publisher, char kategori, int stok, int tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }
    
    public String getjudul(){
        return judul;
    }
    
    public void setjudul(String judul){
        this.judul = judul;
    }
    
    public String getpenulis(){
        return penulis;
    }
    
    public void setpenulis(String penulis){
        this.penulis = penulis;
    }
    
    public String getpublisher(){
        return publisher;
    }
    
    public void setpublisher(String publisher){
        this.publisher = publisher;
    }
    
    public char getkategori(){
        return kategori;
    }
    
    public void setkategori(char kategori){
        this.kategori = kategori;
    }
    
    public int getstok(){
        return stok;
    }
    
    public void setstok(int stok){
        this.stok = stok;
    }
    
    public int gettahunTerbit(){
        return tahunTerbit;
    }
    
    public void settahunTerbit(){
        this.tahunTerbit = tahunTerbit;
    }
}
