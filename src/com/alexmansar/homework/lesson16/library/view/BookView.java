package com.alexmansar.homework.lesson16.library.view;

import com.alexmansar.homework.lesson16.library.model.Book;
import com.alexmansar.homework.lesson16.library.utils.Validator;

import java.io.IOException;

import static com.alexmansar.homework.lesson16.library.controller.AuthorController.AUTHORS;
import static com.alexmansar.homework.lesson16.library.controller.BookController.BOOKS;
import static com.alexmansar.homework.lesson16.library.controller.GenreController.GENRES;

public class BookView {

    private final AuthorView authorView;
    private final GenreView genreView;

    public BookView() {
        this.authorView = new AuthorView();
        this.genreView = new GenreView();
    }

    public Book createBook() throws IOException {
        Book book = new Book();
        System.out.println("Enter name of book ");
        book.setName(Validator.validateInputText());
        System.out.println("now, enter description of book ");
        book.setDescription(Validator.validateInputText());
        System.out.println("enter year of writing");
        book.setYear(Validator.validateYear());
        System.out.println("specify the genre of the book by choosing from the list.");
        book.setGenre(GENRES.get(genreView.chooseIndexOfGenre()));
        System.out.println("Specify the author of the book by choosing from the list.");
        book.setAuthor(AUTHORS.get(authorView.chooseIndexOfAuthor()));
        return book;
    }

    public void printBooks() {
        if (BOOKS.isEmpty()) {
            System.out.println("The list of authors is empty ");
        } else {
            for (int i = 0; i < BOOKS.size(); i++) {
                System.out.println(i + 1 + "." + BOOKS.get(i));
            }
        }
    }

    public int chooseIndexOfBook() throws IOException {
        System.out.println("Enter number of book which you want to choice");
        printBooks();
        return Validator.validateIndex(BOOKS.size());
    }
}