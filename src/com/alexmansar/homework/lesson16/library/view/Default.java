package com.alexmansar.homework.lesson16.library.view;

import com.alexmansar.homework.lesson16.library.model.Author;
import com.alexmansar.homework.lesson16.library.model.Book;
import com.alexmansar.homework.lesson16.library.model.Genre;

import static com.alexmansar.homework.lesson16.library.controller.AuthorController.AUTHORS;
import static com.alexmansar.homework.lesson16.library.controller.BookController.BOOKS;
import static com.alexmansar.homework.lesson16.library.controller.GenreController.GENRES;

public class Default {
    private String genreName;
    private String genreDescription;
    private String nameOfAuthor;
    private String surnameOfAuthor;
    private String nameOfBook;
    private String bookDescription;
    private int yearOfWriting;


    public static void defaultFilling(String genreName, String genreDescription, String nameOfAuthor, String surnameOfAuthor,
                                      String nameOfBook, String bookDescription, int yearOfWriting) {
        Genre genre = new Genre(genreName, genreDescription);
        Author author = new Author(nameOfAuthor, surnameOfAuthor);
        Book book = new Book(nameOfBook, bookDescription, yearOfWriting, genre, author);
        AUTHORS.add(author);
        GENRES.add(genre);
        BOOKS.add(book);
    }
}
