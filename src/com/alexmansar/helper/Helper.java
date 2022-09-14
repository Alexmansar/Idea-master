package com.alexmansar.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
    }

    public static void print(String str) {
        System.out.println(str);
    }

    /*  public static int getValue() throws IOException {
          return Integer.parseInt(READER.readLine());
      }*/
    public static Double getDoubleValue() throws IOException {
        return Double.parseDouble(READER.readLine());
    }

    public static Integer getIntegerValue() throws IOException {
        return Integer.parseInt(READER.readLine());
    }


    public static String getString() throws IOException {
        return READER.readLine();
    }

    public static boolean print(boolean equals) {
        return true;
    }

    /*public static boolean isValid(int number) {
        if (number > 0) ;
        return true;
    }*/


    /*public static boolean isValid(double number) {
        if (number > 0) ;
        return true;
    }*/

    /*public static boolean isValid(int valid) {
        if (valid <= 0) {
            boolean check = false;
            if (!check) {
                System.out.println("Not");
            }
        }
        return false;
    }

    public static boolean isValid(double valid) {
        if (valid <= 0) {
            boolean check = true;
            if (check) {
            } else
                System.out.println("Not");
        }
        // return true;
        return true;
    }*/

    public static boolean isValid (Integer number) {
        if (number > 0) {
            return false;
        }
        System.out.println("You wrong. Value might by more than 0");
        return true;
    }
    public static boolean isValid (Double number) {
        if (number > 0) {
            return false;
        }
        System.out.println("You wrong. Value might by more than 0");
        return true;
    }

}