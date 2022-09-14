package com.alexmansar.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Double number1 = getValue(READER);
        System.out.println("Enter operation ");
        char operation = READER.readLine().charAt(0);
        Double number2 = getValue(READER);
        double result = calculate(number1, number2, operation);
        System.out.println("Result= " + result);
    }

    public static Double getValue(BufferedReader READER) throws IOException {
        System.out.println("Enter number ");
        return Double.parseDouble(READER.readLine());
    }

    public static char getOperation(BufferedReader READER) throws IOException {
        return READER.readLine().charAt(0);
    }

    public static double calculate(double number1, double number2, char operation) throws IOException {
        double result;
        switch (operation) {
            case '+' -> result = number1 + number2;
            case '*' -> result = number1 * number2;
            case '-' -> result = number1 - number2;
            case '/' -> {
                result = number1 / number2;
                if (number1 == 0)
                {
                    System.out.println("Error. Can't divide by zero!");
                }
            }
            default -> {
                System.out.println("Error");
                result = calculate(number1, number2, getOperation(READER));
            }
        }
        return result;
    }
}
