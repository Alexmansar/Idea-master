package com.alexmansar.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoArrays {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int arraySize = 10;
        String[] strings = new String[arraySize];
        extracted(strings);
        String[] firstArray = getStrings(strings, 0, strings.length / 2);
        String[] secondArray = getStrings(strings, strings.length / 2, strings.length);
        System.out.println("First array is " + Arrays.toString(firstArray));
        System.out.println("Second array is " + Arrays.toString(secondArray));
    }

    private static void extracted(String[] strings) throws IOException {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = READER.readLine();
        }
    }

    private static String[] getStrings(String[] strings, int from, int length) {
        String[] string = Arrays.copyOfRange(strings, from, length);
        return string;
    }
}