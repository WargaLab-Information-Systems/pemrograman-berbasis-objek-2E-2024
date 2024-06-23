/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kaaryawan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ivan Aditama
 */
public class Kaaryawan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
//        KaryawanTetap k1 = new KaryawanTetap("nama",0,"posisi","gajiBulanan");
//        KaryawanKontrak k2 = new KaryawanKontrak("nama",0,"posisi","upahPerjam","jamKerja");
        ArrayList<Karyawan> karyawan = new ArrayList<>();
        
        boolean ulang = true;
        do{
            System.out.println(" ");
            System.out.println("===================================================");
            System.out.println("1. Karyawan Tetap");  
            System.out.println("2. Karyawan Kontrak");
            System.out.println("3. Tampilkan data karyawan");
            System.out.println("4. Stop");
            System.out.println("Pilih : ");
            int inp;
            inp = input.nextInt();
                  input.nextLine();
            switch(inp){
                case 1: {
                    System.out.println("-----------------------------------");
                    System.out.println("Posisi anda adalah Karyawan Tetap ");
                    System.out.println("-----------------------------------");
                    System.out.println("Masukkan nama anda : ");
                    String nama = input.nextLine();
                    System.out.println("Masukkan usia anda : ");
                    int usia = input.nextInt();
                               input.nextLine();
                    String posisi = "Karyawan Tetap";
                    System.out.println("Masukkan gaji bulanan anda : ");
                    String gajiBulanan = input.nextLine();

                    KaryawanTetap kt = new KaryawanTetap(nama, usia, posisi, gajiBulanan);
                    karyawan.add(kt);
                    break;
                }
                case 2: {
                    System.out.println("-----------------------------------");
                    System.out.println("Posisi anda adalah Karyawan Kontrak ");
                    System.out.println("-----------------------------------");
                    System.out.println("Masukkan nama anda : ");
                    String nama = input.nextLine();
                    System.out.println("Masukkan usia anda : ");
                    int usia = input.nextInt();
                               input.nextLine();
                    String posisi = "Karyawan Kontrak";
                    System.out.println("Masukkan upah per jam anda : ");
                    String upahPerjam = input.nextLine();  
                    System.out.println("Masukkan jumlah jam kerja anda : ");
                    String jumlahJamKerja = input.nextLine();

                    KaryawanKontrak kk = new KaryawanKontrak(nama,usia,posisi,upahPerjam,jumlahJamKerja);
                    karyawan.add(kk);
                    break;
                }
                
                case 3: {
                    int td;
                    System.out.println("1. Tampilkan data karyawan tetap");
                    System.out.println("2. Tampilkan data karyawan kontrak");
                    td = input.nextInt();
                        if(td == 1){
                            int index = 1;
                            for (Karyawan kt : karyawan) {
                                System.out.println(index + ". ");
                                kt.tampilkanData();
                                index++;
                            }
                        }else if(td == 2){
                            int i = 1;
                            for (Karyawan kk : karyawan) {
                                System.out.println(i + ". ");
                                kk.tampilkanData();
                                i++;       
                            }
                        }else if(karyawan.isEmpty()) {
                            System.out.println("Belum ada buku di perpustakaan.");
                        }
                    }            
                    break;
                case 4: {
                    System.out.println("Terimakasih");;
                    ulang = false;
                }
            }
            
            
        }while(ulang);
    }
}
