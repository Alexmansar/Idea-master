package com.alexmansar.homework.lesson16.library.model;

public class Book {
    private String name;

    private String description;
    private int year;
    private Genre genre;
    private Author author;
    public Book() {
    }

    public Book(String name, String description, int year, Genre genre, Author author) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.genre = genre;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book " +
                "name-'" + name+ "'"  + author +
                ", year= " + year +
                ", genre - " + genre.getName() +
                ", description - '" + description;
    }
}