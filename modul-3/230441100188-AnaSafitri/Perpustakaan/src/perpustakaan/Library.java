import java.util.ArrayList;

public class Library {
    private ArrayList<Perpustakaan> books;

    public Library() {
        books = new ArrayList<>();
    }

public void addPerpustakaan(Perpustakaan book) {
    books.add(book);
}

    public void viewBooks() {
        for (Perpustakaan perpustakaan : books) {
            System.out.println(perpustakaan);
            System.out.println();
        }
    }

}