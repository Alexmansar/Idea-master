package com.alexmansar.homework.lesson16.library.view;

import com.alexmansar.homework.lesson16.library.model.Genre;
import com.alexmansar.homework.lesson16.library.utils.Validator;

import java.io.IOException;

import static com.alexmansar.homework.lesson16.library.controller.GenreController.GENRES;

public class GenreView {

    public GenreView() {
    }

    public Genre createGenre() throws IOException {
        Genre genre = new Genre();
        System.out.println("Enter name of genre");
        genre.setName(Validator.validateInputText());
        System.out.println("now, enter description of genre");
        genre.setDescription(Validator.validateInputText());
        return genre;
    }

    public void printGenres() {
        for (int i = 0; i < GENRES.size(); i++) {
            System.out.println(i + 1 + "." + GENRES.get(i));
        }
        if (GENRES.isEmpty()) {
            System.out.println("The list of genres is empty");
        }
    }

    public int chooseIndexOfGenre() throws IOException {
        System.out.println("Enter number of genre which you want to choice");
        printGenres();
        return Validator.validateIndex(GENRES.size());
    }
}