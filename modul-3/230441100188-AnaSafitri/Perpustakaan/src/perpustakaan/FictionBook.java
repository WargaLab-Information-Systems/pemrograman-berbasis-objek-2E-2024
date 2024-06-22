public class FictionBook extends Perpustakaan {
    private String genre;

    public FictionBook(String title, String author, String publisher, String category, int stock, int yearPublished, String genre) {
        super(title, author, publisher, category, stock, yearPublished);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Genre       : " + genre;
    }
}
