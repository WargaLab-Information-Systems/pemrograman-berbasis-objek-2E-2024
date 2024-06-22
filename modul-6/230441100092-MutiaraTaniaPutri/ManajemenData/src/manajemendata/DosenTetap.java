
package manajemendata;

public class DosenTetap extends Dosen {
    double gajiPokok;
    double tunjangan;

    public DosenTetap(String nama, String nik, int umur, char jenisKelamin, String instansi, double gajiPokok, double tunjangan) {
        super(nama, nik, umur, jenisKelamin, instansi);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }    

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }
    
    public void setInstansi(String instansi){
        this.instansi = instansi;
    }
    
    public String getInstansi(){
        return instansi;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Instansi : " + getInstansi());
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + hitungGaji());
    }
    
}
