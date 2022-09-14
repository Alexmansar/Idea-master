package com.alexmansar.homework.lesson16.library.controller;

import com.alexmansar.homework.lesson16.library.enums.TypeOfAction;
import com.alexmansar.homework.lesson16.library.model.Author;
import com.alexmansar.homework.lesson16.library.view.AuthorView;
import com.alexmansar.homework.lesson16.library.view.MainView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AuthorController {
    public static List<Author> AUTHORS = new ArrayList<>();
    private static AuthorView authorView;
    public final MainView mainView;

    public AuthorController() {
        this.authorView = new AuthorView();
        this.mainView = new MainView();
    }


    public void chooseAuthorAction() throws IOException {
        TypeOfAction typeOfAction = MainView.chooseAction("author");
        switch (typeOfAction) {
            case ADD -> addAuthor();
            case DELETE -> AUTHORS.remove(authorView.chooseIndexOfAuthor());
            case PRINT -> authorView.printAuthors();
        }
    }

    public void addAuthor() throws IOException {
        AUTHORS.add(authorView.createAuthor());
    }
}