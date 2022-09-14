package com.alexmansar.homework.lesson16.library.view;


import com.alexmansar.homework.lesson16.library.model.Author;
import com.alexmansar.homework.lesson16.library.utils.Validator;

import java.io.IOException;

import static com.alexmansar.homework.lesson16.library.controller.AuthorController.AUTHORS;


public class AuthorView {

    public AuthorView() {
    }


    public Author createAuthor() throws IOException {
        Author author = new Author();
        System.out.println("Enter name of author, please");
        author.setName(Validator.validateInputText());
        System.out.println("now, enter surname of author");
        author.setSurname(Validator.validateInputText());
        return author;
    }

    public void printAuthors() {
        for (int i = 0; i < AUTHORS.size(); i++) {
            System.out.println(i + 1 + "." + AUTHORS.get(i));
        }
        if (AUTHORS.isEmpty()) {
            System.out.println("Empty List. Try again");
        }
    }


    public int chooseIndexOfAuthor() throws IOException {
        System.out.println("Enter number author witch you want to choose");
        printAuthors();
        return Validator.validateIndex(AUTHORS.size());
    }
}