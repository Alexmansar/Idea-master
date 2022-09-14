package com.alexmansar.homework.lesson16.library.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Utils {
    public static final BufferedReader READER =new BufferedReader(new InputStreamReader(System.in));

    public static String createString() throws IOException {
        return READER.readLine();
    }

    public static String firstUpperCase(String word) {
        if (word == null || word.isEmpty()) return "";
        word = word.toLowerCase(Locale.ROOT);
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
