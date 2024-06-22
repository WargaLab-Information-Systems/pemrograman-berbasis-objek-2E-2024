
package dataperpustakaan;

class Buku {
    private String judul;
    private String penulis;
    private String publisher;
    private String kategori;
    private int stok;
    private int tahunTerbit;
    
    public Buku(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }    
    public String getJudul(){
        return judul;
    }
    
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    public String getPenulis(){
        return penulis;
    }
    
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return publisher;
    }
    
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    public String getKategori(){
        return kategori;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }
    public int getStok(){
        return stok;
    }
    
    public void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    public int getTahunTerbit(){
        return tahunTerbit;
    }
}
