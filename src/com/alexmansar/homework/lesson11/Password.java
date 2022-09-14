package com.alexmansar.homework.lesson11;

import com.alexmansar.helper.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int numberOfCharacteristic = 4;
        Helper.print("Hello, let's create new difficult password to you. Enter number of symbols");
        int arraySize = Integer.parseInt(READER.readLine());
        int numberOfPerformance = generateNumberPerformance(numberOfCharacteristic);
        Helper.print("Great! Your new password is" + "[" + String.join("", getPassword(arraySize, numberOfCharacteristic)) + "]");
    }

    public static String[] getPassword(int arraySize, int numberOfCharacteristic) {
        String[] password = new String[arraySize];
        int min = 0;
        int max = 9;
        String smallLetter = "qwertyuiopasdfghjklzxcvbnm";
        String bigLetter = smallLetter.toUpperCase();
        String symbol = "_";                                                              //we can add any other symbols
        boolean isSmallLetter = false;
        boolean isBigLetter = false;
        boolean isNumber = false;
        boolean isSymbol = false;
        for (int i = 0; i < password.length; i++) {
            int numberOfPerformance = generateNumberPerformance(numberOfCharacteristic);
            switch (numberOfPerformance) {
                case 1 -> {
                    isSmallLetter = true;
                    int randomSmallLetter = (int) (Math.random() * (smallLetter.length() - 1));
                    password[i] = String.valueOf(smallLetter.charAt(randomSmallLetter));
                }
                case 2 -> {
                    isBigLetter = true;
                    int randomBigLetter = (int) (Math.random() * (bigLetter.length() - 1));
                    password[i] = String.valueOf(bigLetter.charAt(randomBigLetter));
                }
                case 3 -> {
                    isNumber = true;
                    int randomNumber = (int) (Math.random() * (max - min) + min);
                    password[i] = Integer.toString(randomNumber);
                }
                case 4 -> {
                    isSymbol = true;
                    int randomSymbol = (int) (Math.random() * (symbol.length() - 1));
                    password[i] = String.valueOf(symbol.charAt(randomSymbol));
                }
            }
        }
        if (isSmallLetter && isBigLetter && isNumber && isSymbol) {
            return password;
        } else {
            return getPassword(arraySize, numberOfCharacteristic);
        }
    }

    public static int generateNumberPerformance(int numberOfCharacteristic) {
        return (int) (Math.random() * (numberOfCharacteristic) + 1);
    }
}