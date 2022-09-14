package com.alexmansar.homework.lesson16.library.utils;


import java.io.IOException;
import java.time.LocalDate;

import static com.alexmansar.homework.lesson16.library.utils.Utils.createString;

public class Validator {

    public static String validateInputText() throws IOException {
        String str = createString();
        while (str.trim().isEmpty()) {
            System.out.println("You have not entered any value. Please, try again ");
            str = createString();
        }
        return str;
    }

    public static int validateIndex(int size) throws IOException {
        int index;
        try {
            index = Integer.parseInt(createString());
            if (index <= 0 || index > size) {
                System.out.println("No such this number exists");
                return validateIndex(size);
            }
        } catch (NumberFormatException | IndexOutOfBoundsException exception) {
            System.out.println("Use only numbers, try again");
            return validateIndex(size);
        }
        return --index;
    }

    public static int validateYear() {
        LocalDate localDate = LocalDate.now();
        try {
            int year = Integer.parseInt(createString());
            if (year > localDate.getYear()) {
                System.out.println("Use the correct date. The date cannot be from the future");
                return validateYear();
            } else {
                return year;
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("Use only numbers, try again");
            return validateYear();
        }
    }
}