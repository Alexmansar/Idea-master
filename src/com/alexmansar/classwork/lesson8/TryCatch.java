package com.alexmansar.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatch {
    public static final BufferedReader READER =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        Integer integer=getNumber();

        System.out.println(integer);

        System.out.println("continue");
    }

    private static Integer getNumber() {
        try {
            String str= READER.readLine();
            return Integer.parseInt(str);
        }
        catch (Exception exception) {
            System.out.println(" Error "+exception.getMessage());
            return getNumber();
        }
    }

}
