package com.alexmansar.homework.lesson15.tripleConvertor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverter {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static final float KELVIN_CONST = -273.15f;
    public static final float FAHRENHEIT_COEFFICIENT = 9 / 5f;
    public static final int FAHRENHEIT_CONST = 32;

    public static void main(String[] args) throws IOException {
        System.out.println("Please, enter value of degrees");
        float degree = Float.parseFloat(READER.readLine());
        System.out.println("Hello, please enter enter the temperature from which we will convert");
        printMessageConverter();
        String typeFromConvert = String.valueOf(getTypeConvert());
        System.out.println("OK, now, please enter  temperature to which we will convert");
        printMessageConverter();
        String typeToConvert = String.valueOf(getTypeConvert());
        getMessage(degree, typeFromConvert, typeToConvert);


    }

    private static int getTypeConvert() throws IOException {
        int typeConvert = Integer.parseInt(READER.readLine());
        if ((typeConvert != 1) && (typeConvert != 2) && (typeConvert != 3)) {
        }

        return typeConvert;
    }

    private static int convertStringToInt(String typeFromConvert, String typeToConvert) {
        String typeOfConvert = typeFromConvert + typeToConvert;
        return Integer.parseInt(typeOfConvert);
    }

    public static void printMessageConverter() {
        System.out.println("""
                1-Celsius\s
                2-Kelvin\s
                3-Fahrenheit""");
    }

    public static void getMessage(float degree, String typeFromConvert, String typeToConvert) {
        int combinationOption = convertStringToInt(typeFromConvert, typeToConvert);
        float temperature = 0;
        String temperatureFrom = null;
        String temperatureTo = null;
        switch (combinationOption) {
            case 11 -> {
                temperature = degree;
                temperatureFrom = "C";
                temperatureTo = "C";
            }
            case 12 -> {
                temperature = Celsius.calculateTemperatureCelsiusToKelvin(degree, KELVIN_CONST);
                temperatureFrom = "C";
                temperatureTo = "K";
            }
            case 13 -> {
                temperature = Celsius.calculateTemperatureCelsiusToFahrenheit(degree, KELVIN_CONST, FAHRENHEIT_COEFFICIENT, FAHRENHEIT_CONST);
                temperatureFrom = "C";
                temperatureTo = "F";
            }
            case 21 -> {
                temperature = Kelvin.calculateTemperatureKelvinToCelsius(degree, KELVIN_CONST);
                temperatureFrom = "K";
                temperatureTo = "C";
            }
            case 22 -> {
                temperature = degree;
                temperatureFrom = "K";
                temperatureTo = "K";
            }
            case 23 -> {
                temperature = Kelvin.calculateTemperatureKelvinToFahrenheit(degree, KELVIN_CONST, FAHRENHEIT_COEFFICIENT, FAHRENHEIT_CONST);
                temperatureFrom = "K";
                temperatureTo = "F";
            }
            case 31 -> {
                temperature = Fahrenheit.calculateTemperatureFahrenheitToCelsius(degree, FAHRENHEIT_COEFFICIENT, FAHRENHEIT_CONST);
                temperatureFrom = "F";
                temperatureTo = "C";
            }
            case 32 -> {
                temperature = Fahrenheit.calculateTemperatureFahrenheitToKelvin(degree, KELVIN_CONST, FAHRENHEIT_COEFFICIENT, FAHRENHEIT_CONST);
                temperatureFrom = "F";
                temperatureTo = "K";
            }
            case 33 -> {
                temperature = degree;
                temperatureFrom = "F";
                temperatureTo = "F";
            }
        }
        System.out.println("Convert " + degree + temperatureFrom + " to " + temperature + temperatureTo);

    }
}