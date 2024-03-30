import java.util.Scanner;

class Mahasiswa {
    private static String nama, nim, alamat, universitas;
    String jurusan;

    void Mahasiswa(){
        System.out.println("\n====== DAFTAR MAHASISWA ======");
        System.out.println("Universitas \t: " + getUniv());
        System.out.println("Nama \t\t: " + getNama());
        System.out.println("NIM \t\t: " + getNIM());
        System.out.println("Alamat \t\t: " + getAlamat());
        System.out.println("Jurusan \t: " + getJurusan());
    }

    //Getter
    public String getUniv(){
        return universitas;
    }
    public String getNama(){
        return nama;
    }
    public String getNIM(){
        return nim;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getJurusan(){
        return jurusan;
    }

    //Setter
    public void setUniv(String universitas){
        Mahasiswa.universitas = universitas;
    }
    public void setNama(String nama){
        Mahasiswa.nama = nama;
    }
    public void setNIM(String nim){
        Mahasiswa.nim = nim;
    }
    public void setAlamat(String alamat){
        Mahasiswa.alamat = alamat;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
}

public class DataMahasiswa{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        Mahasiswa objek = new Mahasiswa();

        int seleksi;
        String jurusan = null;

        boolean pilih = true;
        while(pilih){

            System.out.println("\n ====== DATA MAHASISWA ======");
            System.out.print("Masukan Universitas \t: ");
            String universitas = input.nextLine();
            objek.setUniv(universitas);
            System.out.print("Masukan Nama \t\t: ");
            String nama = input.nextLine();
            objek.setNama(nama);
            System.out.print("Masukan NIM \t\t: ");
            String nim = input.nextLine();
            objek.setNIM(nim);
            System.out.print("Masukan Alamat \t\t: ");
            String alamat = input.nextLine();
            objek.setAlamat(alamat);
            System.out.println("=== Jurusan ===");
            System.out.println("61.Matematika \n62.Biologi \n63.Kimia \n64.Fisika");
            System.out.println("65.Teknik Informatika  \n66.Sistem Informasi");
            do {
                System.out.print("Masukkan jurusan \t: ");
                seleksi = input.nextInt();
            } while (seleksi < 61 || seleksi > 66);
            switch (seleksi) {
                case 61:
                    jurusan = "Matematika";
                    break;
                case 62:
                    jurusan = "Biologi";
                    break;
                case 63:
                    jurusan = "Kimia";
                    break;
                case 64:
                    jurusan = "Fisika";
                    break;
                case 65:
                    jurusan = "Teknik Informatika";
                    break;
                case 66:
                    jurusan = "Sistem Informasi";
                    break;
                default:
                    break;
            }
            objek.setJurusan(jurusan);
        
            objek.Mahasiswa();

            input.nextLine();
            System.out.print("\nMau Lagi (y/t) ? ");
            String lagi = input.nextLine();
            if(lagi.equals("y")) {
                pilih = true;
            }
            else{
                System.out.println("\n=====================");
                System.out.println("     Terimakasih     ");
                System.out.println("=====================");
                break;
            }
        }  
    }
}