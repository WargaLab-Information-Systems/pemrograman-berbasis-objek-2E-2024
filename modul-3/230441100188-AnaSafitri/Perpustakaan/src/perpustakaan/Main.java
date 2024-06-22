import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.print("Berapa banyak buku yang ingin anda input: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numBooks; i++) {
            System.out.print("Judul Buku  : ");
            String title = scanner.nextLine();
            System.out.print("Nama Penulis: ");
            String author = scanner.nextLine();
            System.out.print("Publisher   : ");
            String publisher = scanner.nextLine();
            System.out.print("Kategori    : (Fiksi / Non-Fiksi): ");
            String category = scanner.nextLine();

            if (category.equalsIgnoreCase("Fiksi")) {
                System.out.print("Genre Buku  : ");
                String genre = scanner.nextLine();
                System.out.print("Stock Jumlah: ");
                int stock = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tahun Terbit: ");
                int yearPublished = scanner.nextInt();
                scanner.nextLine();

                library.addPerpustakaan(new FictionBook(title, author, publisher, category, stock, yearPublished, genre));
            } else if (category.equalsIgnoreCase("Non-Fiksi")) {
                System.out.print("Gender Buku : ");
                String gender = scanner.nextLine();
                System.out.print("Stock Jumlah: ");
                int stock = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tahun Terbit: ");
                int yearPublished = scanner.nextInt();
                scanner.nextLine(); 

                library.addPerpustakaan(new Perpustakaan(title, author, publisher, category, stock, yearPublished));
            } else {
                System.out.println("Kategori tidak valid. Silakan masukkan 'Fiksi' atau 'Non-Fiksi'.");
                i--; // Kembali ke iterasi sebelumnya
            }

            System.out.println();
        }

        System.out.println("List Buku Berhasil di Input:");
        library.viewBooks();
    }
}
