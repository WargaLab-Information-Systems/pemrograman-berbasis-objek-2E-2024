
package manajemendata;

public class DosenTidakTetap extends Dosen{
    int jamMengajar;
    double honorPerjam;

    public DosenTidakTetap(String nama, String nik, int umur, char jenisKelamin, String instansi, int jamMengajar, double honorPerjam) {
        super(nama, nik, umur, jenisKelamin, instansi);
        this.jamMengajar = jamMengajar;
        this.honorPerjam = honorPerjam;
    }
    
    public int getJamMengajar() {
        return jamMengajar;
    }

    public void setJamMengajar(int jamMengajar) {
        this.jamMengajar = jamMengajar;
    }

    public double getHonorPerjam() {
        return honorPerjam;
    }

    public void setHonorPerjam(double honorPerjam) {
        this.honorPerjam = honorPerjam;
    }

    @Override
    public double hitungGaji() {
        return jamMengajar * honorPerjam;
    }
    
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Instansi : " + instansi);
        System.out.println("Jam Mengajar: " + jamMengajar);
        System.out.println("Honor Per Jam: " + honorPerjam);
        System.out.println("Total Gaji: " + hitungGaji());
    }
    
}
