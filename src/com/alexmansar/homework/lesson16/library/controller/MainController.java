package com.alexmansar.homework.lesson16.library.controller;

import com.alexmansar.homework.lesson16.library.utils.Validator;
import com.alexmansar.homework.lesson16.library.view.MainView;

import java.io.IOException;

import static com.alexmansar.homework.lesson16.library.view.Default.defaultFilling;

public class MainController {

    MainView mainView;
    AuthorController authorController;
    GenreController genreController;
    BookController bookController;

    public MainController() {
        this.authorController = new AuthorController();
        this.genreController = new GenreController();
        this.bookController = new BookController();
        this.mainView = new MainView();
    }

    public void startApp() throws IOException {
        defaultFilling("Comedy", " laughing", "George", "Bernard Shaw",
                "Pygmalion", "interesting", 1912);

        defaultFilling("Mysticism", " Some strange", "Stephen", "King",
                "The Green Mile", "interesting", 1996);

        defaultFilling("Detective", " seriously", "Arthur ", "Conan Doyle",
                "The Hound of the Baskervilles", "interesting", 1901);
        do {
            switch (mainView.chooseModel()) {
                case AUTHOR -> authorController.chooseAuthorAction();
                case GENRE -> genreController.chooseGenreAction();
                case BOOK -> bookController.chooseBookAction();
            }
            System.out.println(" Do you want to continue work? Enter Yes or no ");
        } while (!Validator.validateInputText().equalsIgnoreCase("no"));
    }
}