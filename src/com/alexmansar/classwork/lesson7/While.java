package com.alexmansar.classwork.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String input = READER.readLine();
        while (!input.equalsIgnoreCase("stop")) {
           // System.out.println("you input:=" + input);
            input = READER.readLine();
        }
    }
}

