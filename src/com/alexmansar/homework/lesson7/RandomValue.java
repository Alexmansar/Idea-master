package com.alexmansar.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomValue {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        getMessage();
        int userNumber;
        int randomNumber = (int) (Math.random() * 10);
        do {
            userNumber = getUserNumber();
            if (check(userNumber)) return;
            if (randomNumber == userNumber) {
                System.out.println("Congratulation");
            } else {
                System.out.println("Try again");
            }
        }
        while (randomNumber != userNumber);

    }

    private static int getUserNumber() throws IOException { //Считываем данные с консоли
        String a = READER.readLine();
        return Integer.parseInt(a);
    }

    private static boolean check(Integer grade) {
        if (grade < 0 || grade > 10) {
            System.out.println("You wrong. Value might by 0 to 10");
            return true;
        }
        return false;
    }

    public static void getMessage() { //вывод сообщения на консоль
        System.out.println("Hi. Try to guess the number that the computer guessed ");
    }
}