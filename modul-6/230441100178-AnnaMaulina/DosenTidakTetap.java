package datadosen;
public class DosenTidakTetap extends Dosen {
    private int jamMengajar;
    private double honorPerJam;

    public DosenTidakTetap(String nama, String nik, int umur, char jenisKelamin, int jamMengajar, double honorPerJam) {
        super(nama, nik, umur, jenisKelamin);
        this.jamMengajar = jamMengajar;
        this.honorPerJam = honorPerJam;
    }

    // method setter getter
    public void setJamMengajar(int jamMengajar) {
        this.jamMengajar = jamMengajar;
    }

    public int getJamMengajar() {
        return jamMengajar;
    }

    public void setHonorPerJam(double honorPerJam) {
        this.honorPerJam = honorPerJam;
    }
    
    public double getHonorPerJam() {
        return honorPerJam;
    }

    @Override
    public double hitungGaji() {
        return jamMengajar * honorPerJam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("======= Dosen Tidak Tetap =======");
        System.out.println("Nama          : " + getNama());
        System.out.println("NIK           : " + getNik());
        System.out.println("Umur          : " + getUmur() + " tahun");
        System.out.println("Jenis Kelamin : " + getJenisKelamin());
        System.out.println("Jam Mengajar  : " + jamMengajar + " jam" );
        System.out.println("Honor Per Jam : Rp." + honorPerJam);
        System.out.println("Total Gaji    : Rp." + hitungGaji());
    }
}
