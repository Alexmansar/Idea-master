package com.alexmansar.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandLuggage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length,sm  : ");
        Integer length = getSize(reader);
        System.out.println("Enter height, sm : ");
        Integer height = getSize(reader);
        System.out.println("Enter width, sm  : ");
        Integer width = getSize(reader);
        getMes(length, height, width);
    }

    private static void getMes(Integer length, Integer height, Integer width) {
        if (length <= 40 && height <= 53 && width <= 22) {
            System.out.println("You can take you luggage");
        } else if (length <= 55 && height <= 40 && width <= 20) {
            System.out.println("You can take you luggage");
        } else {
            System.out.println("You cann't take you luggage");
        }
    }

    private static Integer getSize(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}