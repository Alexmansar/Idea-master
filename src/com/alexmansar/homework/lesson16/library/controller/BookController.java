package com.alexmansar.homework.lesson16.library.controller;

import com.alexmansar.homework.lesson16.library.enums.TypeOfAction;
import com.alexmansar.homework.lesson16.library.model.Book;
import com.alexmansar.homework.lesson16.library.view.BookView;
import com.alexmansar.homework.lesson16.library.view.MainView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.alexmansar.homework.lesson16.library.controller.AuthorController.AUTHORS;
import static com.alexmansar.homework.lesson16.library.controller.GenreController.GENRES;

public class BookController {

    public static List<Book> BOOKS = new ArrayList<>();
    private final BookView bookView;
    public final MainView mainView;
    private final GenreController genreController;
    private final AuthorController authorController;

    public BookController() {
        this.bookView = new BookView();
        this.mainView = new MainView();
        this.genreController = new GenreController();
        this.authorController = new AuthorController();
    }

    public void chooseBookAction() throws IOException {
        TypeOfAction type = MainView.chooseAction(" book");
        switch (type) {
            case ADD -> addBook();
            case DELETE -> deleteBook();
            case PRINT -> bookView.printBooks();
        }
    }

    private void addBook() throws IOException {
        if (GENRES.isEmpty()) {
            genreController.addGenre();
        }
        if (AUTHORS.isEmpty()) {
            authorController.addAuthor();
        }
        BOOKS.add(bookView.createBook());
    }


    private void deleteBook() throws IOException {
        BOOKS.remove(bookView.chooseIndexOfBook());
    }
}