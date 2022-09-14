package com.alexmansar.homework.lesson16.library.controller;

import com.alexmansar.homework.lesson16.library.enums.TypeOfAction;
import com.alexmansar.homework.lesson16.library.model.Genre;
import com.alexmansar.homework.lesson16.library.view.GenreView;
import com.alexmansar.homework.lesson16.library.view.MainView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenreController {
    public static List<Genre> GENRES = new ArrayList<>();
    private final GenreView genreView;
    public final MainView mainView;

    public GenreController() {
        this.genreView = new GenreView();
        this.mainView=new MainView();
    }

    public void chooseGenreAction() throws IOException {
        TypeOfAction type = MainView.chooseAction(" genre");
        switch (type) {
            case ADD -> addGenre();
            case DELETE -> deleteGenre();
            case PRINT -> genreView.printGenres();
        }
    }

    private void deleteGenre() throws IOException {
        GENRES.remove(genreView.chooseIndexOfGenre());
    }

    public void addGenre() throws IOException {
        GENRES.add(genreView.createGenre());
    }
}