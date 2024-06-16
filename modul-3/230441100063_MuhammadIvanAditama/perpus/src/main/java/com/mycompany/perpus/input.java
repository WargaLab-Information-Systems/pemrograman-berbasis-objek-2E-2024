/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpus;

import java.util.Scanner;

/**
 *
 * @author Ivan Aditama
 */
public class input extends dataBuku{
    Scanner s = new Scanner(System.in);
    
    input(String judul, String penulis, String publisher, String kategori, int stok, int tahun){
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.publisher = publisher;
        this.stok = stok;
        this.tahun = tahun;
    }
    
    public void display(){
        System.out.println("=====================================");
        System.out.println("Judul buku = "+this.judul);
        System.out.println("Penulis = "+this.penulis);
        System.out.println("Kategori = "+getKategori());
        System.out.println("Stok = "+this.stok);
        System.out.println("Tahun Terbit = "+this.tahun);
    }
    
    String getKategori(){
        if(kategori.equals("SU")){
            kategori = "Semua Umur";
        }else if(kategori.equals("D")){
            kategori = "Dewasa";
        }else if(kategori.equals("R")){
            kategori = "Remaja";
        }else if(kategori.equals("A")){
            kategori = "Anak - Anak";
        }else{
            kategori = "kategori tidak valid";
        }
        return kategori;
    }
    
    public void displayInput(){
            
        
            System.out.println("=======================================");
            System.out.println("Masukkan judul buku = ");
            String judul = s.nextLine();
            System.out.println("Masukkan penulis buku = ");
            String penulis = s.nextLine();
            System.out.println("Masukkan publisher = ");
            String publisher = s.nextLine();
            System.out.println("Kategori SU/D/R/A");
            System.out.println("Masukkan kategori buku = ");
            String kategori = s.nextLine();
            System.out.println("Masukkan stok buku = ");
            int stok = s.nextInt();
            System.out.println("Masukkan tahun terbit = ");
            int tahun = s.nextInt();
            
    }
    void home(){
        int ulang = 0;
        do{
            

        
            System.out.print("\n1. Tambah Buku ");
            System.out.print("\n2. Tampilkan Buku ");
            System.out.print("\n3. Stop ");
            System.out.println("\nPilih");
            ulang = s.nextInt();
            s.nextLine(); 
            
            switch(ulang){
                case 1 -> displayInput();
                case 2 -> display();
                case 3 -> System.out.println("thx");
                default -> System.out.println("Tidak valid") ;
            };
        } while(ulang != 3);
    }
}
