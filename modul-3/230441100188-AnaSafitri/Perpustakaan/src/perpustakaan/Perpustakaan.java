public class Perpustakaan {
    private String title;
    private String author;
    private String publisher;
    private String category;
    private int stock;
    private int yearPublished;

    public Perpustakaan(String title, String author, String publisher, String category, int stock, int yearPublished) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.stock = stock;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return "Hasil Input Buku Perpustakaan:\n" +
               "  Judul Buku  : " + title + "\n" +
               "  Nama Penulis: " + author + "\n" +
               "  Publisher   : " + publisher + "\n" +
               "  Kategori    : " + category + "\n" +
               "  Stock Jumlah: " + stock + "\n" +
               "  Tahun Terbit: " + yearPublished;
    }
}
