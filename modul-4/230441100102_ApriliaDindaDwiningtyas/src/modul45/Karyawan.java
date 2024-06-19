package modul45;
abstract class Karyawan {
    
    public String nama;
    public int usia;
    public String posisi;
    
    public Karyawan(String nama, int usia, String posisi){
      this.nama= nama;
      this.usia= usia;
      this.posisi= posisi;
    }
    abstract void Tampilkandata();
}
