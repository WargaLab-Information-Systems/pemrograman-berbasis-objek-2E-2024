package modul3;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String judul, penulis, publisher, kategori, stok, tahun;
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<String>> namaList = new ArrayList<>();
        
        System.out.print("Masukkan jumlah data buku yang ingin diinputkan: ");
        int jumlahulangi = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < jumlahulangi; i++) {
            ArrayList<String> innerList = new ArrayList<>();
            
            System.out.println("============================");
            System.out.print("Judul buku: ");
            judul = scanner.nextLine();
            System.out.print("Masukkan nama penulis: ");
            penulis = scanner.nextLine();
            System.out.print("Masukkan nama publisher: ");
            publisher = scanner.nextLine();
            System.out.print("Masukkan kategori judul buku: ");
            kategori = scanner.nextLine();
            System.out.print("Masukkan stok: ");
            stok = scanner.nextLine();
            System.out.print("Masukkan tahun terbit: ");
            tahun = scanner.nextLine();
            
            
            
            if (kategori.equalsIgnoreCase("SU")) {
                kategori = "SEMUA UMUR";
            } else if (kategori.equalsIgnoreCase("D")) {
                kategori = "DEWASA";
            } else if (kategori.equalsIgnoreCase("R")) {
                kategori = "REMAJA";
            } else if (kategori.equalsIgnoreCase("A")) {
                kategori = "ANAK-ANAK";
            }

            
            innerList.add(judul);
            innerList.add(penulis);
            innerList.add(publisher);
            innerList.add(kategori);
            innerList.add(stok);
            innerList.add(tahun);

            namaList.add(innerList);
        }

        perpustakaan_2 display1 = new perpustakaan_2();
        
        for (ArrayList<String> list : namaList) {
            display1.inilisbuku(
                list.get(0),
                list.get(1), 
                list.get(2),
                list.get(3),
                list.get(4),
                list.get(5)
            );
        }
        scanner.close();
    }
}