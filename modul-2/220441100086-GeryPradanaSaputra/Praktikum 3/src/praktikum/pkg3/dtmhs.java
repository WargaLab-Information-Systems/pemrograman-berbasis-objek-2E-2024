/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg3;


class dtmhs extends datamhs{
    dtmhs(){
        System.out.println("\nSelamat Datang pada modul 2\n kali ini kita akan menggunakan konstruktor dan keyword static");
    }
    public static String getalamat(){
            return alamat;
    }
    public static void setalamat(String alamat){
        praktikum.pkg3.datamhs.alamat=alamat;
    }
    public static String getjurusan(){
        return jurusan;
    }
    public static void setjurusan(String jurusan){
        praktikum.pkg3.datamhs.jurusan=jurusan;
    }
}
