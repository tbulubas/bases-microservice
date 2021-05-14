package com.tboptimus.basesmicroservice.domain;

public class Book {
    @Override
    public String toString() {
        return "Book{" +
                "titel='" + titel + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    private String titel;
    private String author;

    public Book(String titel, String author) {
        this.titel = titel;
        this.author = author;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
