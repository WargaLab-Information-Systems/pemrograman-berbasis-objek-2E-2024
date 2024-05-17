/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author AbasZ
 */
public class Kategori_Buku {
    
    public static class BukuSemuaUmur extends Buku{
        public BukuSemuaUmur(){
            super();
            Kategori = "SU";
        }
        @Override
        public void display() {
            super.display();
        }
    }
    
    public static class BukuDewasa extends Buku{
        public BukuDewasa(){
            super();
            Kategori = "D";
        }
    }
    
    public static class BukuRemaja extends Buku{
        public BukuRemaja(){
            super();
            Kategori = "R";
        }
    }
    
    public static class BukuAnak extends Buku{
        public BukuAnak(){
            super();
            Kategori = "A";
        }
    }
}