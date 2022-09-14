package com.alexmansar.homework.lesson16.library.view;

import com.alexmansar.homework.lesson16.library.enums.TypeOfAction;
import com.alexmansar.homework.lesson16.library.enums.TypeOfModel;
import com.alexmansar.homework.lesson16.library.utils.Validator;

import java.util.Locale;

import static com.alexmansar.homework.lesson16.library.enums.TypeOfAction.*;
import static com.alexmansar.homework.lesson16.library.enums.TypeOfModel.*;
import static com.alexmansar.homework.lesson16.library.utils.Utils.firstUpperCase;

public class MainView {

    public TypeOfModel chooseModel() {
        TypeOfModel typeOfModel;
        System.out.println("Enter name of type which you want to select" +
                System.lineSeparator() + firstUpperCase(AUTHOR.name()) +
                System.lineSeparator() + firstUpperCase(BOOK.name()) +
                System.lineSeparator() + firstUpperCase(GENRE.name()));
        try {
            typeOfModel = TypeOfModel.valueOf(Validator.validateInputText().toUpperCase(Locale.ROOT));
        } catch (Exception exception) {
            return chooseModel();
        }
        return typeOfModel;
    }

    public static TypeOfAction chooseAction(String message) {
        System.out.println("Enter " + firstUpperCase(ADD.name()) + " if you want to add some info about " + message + '\n'
                + "Enter " + firstUpperCase(DELETE.name()) + " if you want to delete some info " + message + '\n' +
                "Enter " + firstUpperCase(PRINT.name()) + " if you want to print the entire list" + message);
        TypeOfAction typeOfAction;
        try {
            typeOfAction = TypeOfAction.valueOf(Validator.validateInputText().toUpperCase(Locale.ROOT));
        } catch (Exception exception) {
            return chooseAction(message);
        }
        return typeOfAction;
    }
}