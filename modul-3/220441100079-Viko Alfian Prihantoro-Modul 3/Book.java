/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

public abstract class Book {
    protected String title;
    protected String author;
    protected String publisher;
    protected String category;
    protected int stock;
    protected int yearPublished;

    public Book(String title, String author, String publisher, String category, int stock, int yearPublished) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.stock = stock;
        this.yearPublished = yearPublished;
    }

    public abstract void displayBookInfo();

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
}