package com.alexmansar.classwork.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.Integer;
import java.io.InputStreamReader;


public class WhileSum {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String input = READER.readLine();
        int sum = 0;
        while (!input.equalsIgnoreCase("sum")) {
            sum += Integer.parseInt(input);
            input = READER.readLine();
        }
        System.out.println("sum " + sum);
    }
}