package com.mycompany.doosen;

import java.util.ArrayList;
import java.util.Scanner;

public class Doosen {

    public static void main(String[] args) {
        ArrayList<Dosen> dosenList = new ArrayList<>();
        Scanner i = new Scanner(System.in);
        boolean ulang = true;
        
        
        do{
            System.out.println("1. Masukkan data dosen tetap");
            System.out.println("2. Masukkan data dosen tidak tetap");
            System.out.println("3. Tampilkan data ");
            System.out.println("4. Close");
            int a;
            a = i.nextInt();
                i.nextLine();
            switch(a){
                case 1 :{
                    System.out.println("Masukkan nama :");
                    String nama = i.nextLine();
                    System.out.println("Masukkan NIK :");
                    String nik = i.nextLine();
                    System.out.println("Masukkan ummur :");
                    int umur = i.nextInt();
                               i.nextLine();
                    System.out.println("Masukkan jenis kelamin L/P");
                    String input = i.nextLine().toUpperCase();
                    char jenisKelamin = input.charAt(0);
                    System.out.println("Masukkan gaji pokok :");
                    double gajiPokok = i.nextDouble();
                    System.out.println("Masukkan tunjangan :");
                    double tunjangan = i.nextDouble();
                    DosenTetap DT = new DosenTetap(nama,nik,umur,jenisKelamin,gajiPokok,tunjangan);
                    
                    dosenList.add(DT);
                    break;
                }
                case 2 :{
                    System.out.println("Masukkan nama :");
                    String nama = i.nextLine();
                    System.out.println("Masukkan NIK :");
                    String nik = i.nextLine();
                    System.out.println("Masukkan ummur :");
                    int umur = i.nextInt();
                               i.nextLine();
                    System.out.println("Masukkan jenis kelamin L/P :");
                    String input = i.nextLine().toUpperCase();
                    char jenisKelamin = input.charAt(0);
                    System.out.println("Masukkan jumlah jam mengajar :");
                    int jamMengajar = i.nextInt();
                    System.out.println("Masukkan jumlah honor per jam :");
                    double honorPerJam = i.nextDouble();
                    DosenTidakTetap DTT = new DosenTidakTetap(nama,nik,umur,jenisKelamin,jamMengajar,honorPerJam);
                    
                    dosenList.add(DTT);
                    break;
                }
                case 3 :{
                    int td;
                    System.out.println("1. Tampilkan data dosen tetap");
                    System.out.println("2. Tampilkan data dosen tidak tetap");
                    td = i.nextInt();
                        if(td == 1){
                            int index = 1;
                            for (Dosen DT : dosenList) {
                                System.out.println(index + ". ");
                                DT.tampilkanInfo();
                                DT.hitungGaji();
                                index++;
                            }
                        }else if(td == 2){
                            int b = 1;
                            for (Dosen DTT : dosenList) {
                                System.out.println(b + ". ");
                                DTT.tampilkanInfo();
                                DTT.hitungGaji();
                                b++;       
                            }
                        }else if(dosenList.isEmpty()) {
                            System.out.println("Belum ada buku di perpustakaan.");
                        }
                     
                }
                case 4 :{
                    System.out.println("Trimmakasih");
                    ulang = false;
                    break;
                }
            }
        }while(ulang);
    }
}
