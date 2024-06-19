package modul6;
public class DosenTetap extends Dosen {
    private double gajiPokok;
    private double tunjangan;
    private String instansi;
    public DosenTetap(String nama, String nik, int umur, char jenisKelamin,double gajiPokok, double tunjangan, String intansi){
        super(nama,nik,umur,jenisKelamin);
        this.gajiPokok=gajiPokok;
        this.tunjangan=tunjangan;
        this.instansi= intansi;
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
    public String getInstansi(){
        return instansi;
    }
    public void setInstansi(String instansi){
        this.instansi= instansi;
    }
    
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Informasi Dosen Tetap: ");
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Tunjangan: " + getTunjangan());
        System.out.println("Total Gaji: " + hitungGaji());   
        System.out.println("Instansi: "+ getInstansi());
    }

    
}

