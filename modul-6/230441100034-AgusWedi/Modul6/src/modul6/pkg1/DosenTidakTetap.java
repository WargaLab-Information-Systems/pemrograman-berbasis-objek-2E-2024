package modul6.pkg1;


public class DosenTidakTetap extends Dosen {
    private double jamMengajar;
    private double honorPerJam;

    public DosenTidakTetap(String nama, String nik, int umur, char jenisKelamin, double jamMengajar, double honorPerJam) {
        super(nama, nik, umur, jenisKelamin);
        this.jamMengajar = jamMengajar;
        this.honorPerJam = honorPerJam;
    }

    // Setter and Getter methods
    public double getJamMengajar() {
        return jamMengajar;
    }

    public void setJamMengajar(double jamMengajar) {
        this.jamMengajar = jamMengajar;
    }

    public double getHonorPerJam() {
        return honorPerJam;
    }

    public void setHonorPerJam(double honorPerJam) {
        this.honorPerJam = honorPerJam;
    }

    @Override
    public double hitungGaji() {
        return jamMengajar * honorPerJam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("-----------------------------");
        System.out.println("Dosen Tidak Tetap:");
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("NIK\t\t: " + getNik());
        System.out.println("Umur\t\t: " + getUmur());
        System.out.println("Jenis Kelamin\t: " + getJenisKelamin());
        System.out.println("Jam Mengajar\t: " + getJamMengajar());
        System.out.println("Honor Per Jam\t: " + getHonorPerJam());
        System.out.println("Total Gaji\t: " + hitungGaji());
        System.out.println("------------------------------");
    }
}

