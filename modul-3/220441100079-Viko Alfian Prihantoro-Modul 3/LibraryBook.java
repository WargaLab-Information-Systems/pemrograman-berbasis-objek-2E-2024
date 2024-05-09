/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

public class LibraryBook extends Book {
    public LibraryBook(String title, String author, String publisher, String category, int stock, int yearPublished) {
        super(title, author, publisher, category, stock, yearPublished);
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Category: " + getCategory());
        System.out.println("Stock: " + getStock());
        System.out.println("Year Published: " + getYearPublished());
    }

}
